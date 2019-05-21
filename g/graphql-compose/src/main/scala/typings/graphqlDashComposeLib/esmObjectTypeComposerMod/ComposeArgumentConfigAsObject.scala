package typings
package graphqlDashComposeLib.esmObjectTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeArgumentConfigAsObject extends js.Object {
  @JSName("$call")
  var $call: js.UndefOr[scala.Unit] = js.undefined
  var astNode: js.UndefOr[graphqlLib.languageAstMod.InputValueDefinitionNode | scala.Null] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var extensions: js.UndefOr[graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions] = js.undefined
  var `type`: graphqlDashComposeLib.esmUtilsDefinitionsMod.Thunk[ComposeArgumentType] | graphqlLib.typeDefinitionMod.GraphQLInputType
}

object ComposeArgumentConfigAsObject {
  @scala.inline
  def apply(
    `type`: graphqlDashComposeLib.esmUtilsDefinitionsMod.Thunk[ComposeArgumentType] | graphqlLib.typeDefinitionMod.GraphQLInputType,
    $call: js.UndefOr[scala.Unit] = js.undefined,
    astNode: graphqlLib.languageAstMod.InputValueDefinitionNode = null,
    defaultValue: js.Any = null,
    description: java.lang.String = null,
    extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions = null
  ): ComposeArgumentConfigAsObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined($call)) __obj.updateDynamic("$call")($call)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[ComposeArgumentConfigAsObject]
  }
}

