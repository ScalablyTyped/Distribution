package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/isValidLiteralValue", JSImport.Namespace)
@js.native
object utilitiesIsValidLiteralValueMod extends js.Object {
  def isValidLiteralValue(
    `type`: graphqlLib.typeDefinitionMod.GraphQLInputType,
    valueNode: graphqlLib.languageAstMod.ValueNode
  ): js.Array[graphqlLib.errorGraphQLErrorMod.GraphQLError] = js.native
}

