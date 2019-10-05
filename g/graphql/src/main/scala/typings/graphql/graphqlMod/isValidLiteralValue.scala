package typings.graphql.graphqlMod

import typings.graphql.languageAstMod.ValueNode
import typings.graphql.typeDefinitionMod.GraphQLInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "isValidLiteralValue")
@js.native
object isValidLiteralValue extends js.Object {
  def apply(`type`: GraphQLInputType, valueNode: ValueNode): js.Array[typings.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
}

