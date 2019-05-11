package typings
package graphqlDashComposeLib.esmSchemaComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraSchemaConfig extends js.Object {
  var astNode: js.UndefOr[graphqlLib.languageAstMod.SchemaDefinitionNode | scala.Null] = js.undefined
  var directives: js.UndefOr[js.Array[graphqlLib.graphqlMod.GraphQLDirective] | scala.Null] = js.undefined
  var types: js.UndefOr[js.Array[graphqlLib.typeDefinitionMod.GraphQLNamedType] | scala.Null] = js.undefined
}

object ExtraSchemaConfig {
  @scala.inline
  def apply(
    astNode: graphqlLib.languageAstMod.SchemaDefinitionNode = null,
    directives: js.Array[graphqlLib.graphqlMod.GraphQLDirective] = null,
    types: js.Array[graphqlLib.typeDefinitionMod.GraphQLNamedType] = null
  ): ExtraSchemaConfig = {
    val __obj = js.Dynamic.literal()
    if (astNode != null) __obj.updateDynamic("astNode")(astNode)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[ExtraSchemaConfig]
  }
}

