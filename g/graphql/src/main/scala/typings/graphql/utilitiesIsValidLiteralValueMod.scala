package typings.graphql

import typings.graphql.errorGraphQLErrorMod.GraphQLError
import typings.graphql.languageAstMod.ValueNode
import typings.graphql.typeDefinitionMod.GraphQLInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/isValidLiteralValue", JSImport.Namespace)
@js.native
object utilitiesIsValidLiteralValueMod extends js.Object {
  def isValidLiteralValue(`type`: GraphQLInputType, valueNode: ValueNode): js.Array[GraphQLError] = js.native
}

