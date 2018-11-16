package typings
package graphqlLib.utilitiesCoerceValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/coerceValue", JSImport.Namespace)
@js.native
object utilitiesCoerceValueModMembers extends js.Object {
  def coerceValue(value: js.Any, `type`: graphqlLib.typeDefinitionMod.GraphQLInputType): CoercedValue = js.native
  def coerceValue(
    value: js.Any,
    `type`: graphqlLib.typeDefinitionMod.GraphQLInputType,
    blameNode: graphqlLib.languageAstMod.ASTNode
  ): CoercedValue = js.native
  def coerceValue(
    value: js.Any,
    `type`: graphqlLib.typeDefinitionMod.GraphQLInputType,
    blameNode: graphqlLib.languageAstMod.ASTNode,
    path: Path
  ): CoercedValue = js.native
}

