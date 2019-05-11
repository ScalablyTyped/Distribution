package typings
package graphqlDashComposeLib.esmInputTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeInputFieldConfigAsObject
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var astNode: js.UndefOr[graphqlLib.languageAstMod.InputValueDefinitionNode | scala.Null] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var extensions: js.UndefOr[graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions] = js.undefined
  var `type`: graphqlDashComposeLib.esmUtilsDefinitionsMod.Thunk[ComposeInputType] | graphqlLib.typeDefinitionMod.GraphQLInputType
}

object ComposeInputFieldConfigAsObject {
  @scala.inline
  def apply(
    `type`: graphqlDashComposeLib.esmUtilsDefinitionsMod.Thunk[ComposeInputType] | graphqlLib.typeDefinitionMod.GraphQLInputType,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    astNode: graphqlLib.languageAstMod.InputValueDefinitionNode = null,
    defaultValue: js.Any = null,
    description: java.lang.String = null,
    extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions = null
  ): ComposeInputFieldConfigAsObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[ComposeInputFieldConfigAsObject]
  }
}

