package typings
package graphqlLib.utilitiesCoerceValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/coerceValue", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def coerceValue(value: js.Any, `type`: graphqlLib.typeDefinitionMod.GraphQLInputType): graphqlLib.utilitiesCoerceValueMod.CoercedValue = js.native
  def coerceValue(
    value: js.Any,
    `type`: graphqlLib.typeDefinitionMod.GraphQLInputType,
    blameNode: graphqlLib.languageAstMod.ASTNode
  ): graphqlLib.utilitiesCoerceValueMod.CoercedValue = js.native
  def coerceValue(
    value: js.Any,
    `type`: graphqlLib.typeDefinitionMod.GraphQLInputType,
    blameNode: graphqlLib.languageAstMod.ASTNode,
    path: graphqlLib.utilitiesCoerceValueMod.Path
  ): graphqlLib.utilitiesCoerceValueMod.CoercedValue = js.native
}

