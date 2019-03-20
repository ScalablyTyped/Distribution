package typings
package graphqlDashComposeLib.libInputTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeInputFieldConfigAsObject
  extends _ComposeInputFieldConfig
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  @JSName("$call")
  var $call: js.UndefOr[scala.Unit] = js.undefined
  var astNode: js.UndefOr[graphqlLib.languageAstMod.InputValueDefinitionNode | scala.Null] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var `type`: graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[ComposeInputType] | graphqlLib.typeDefinitionMod.GraphQLInputType
}

object ComposeInputFieldConfigAsObject {
  @scala.inline
  def apply(
    `type`: graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[ComposeInputType] | graphqlLib.typeDefinitionMod.GraphQLInputType,
    $call: js.UndefOr[scala.Unit] = js.undefined,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    astNode: graphqlLib.languageAstMod.InputValueDefinitionNode = null,
    defaultValue: js.Any = null,
    description: java.lang.String = null
  ): ComposeInputFieldConfigAsObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined($call)) __obj.updateDynamic("$call")($call)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ComposeInputFieldConfigAsObject]
  }
}

