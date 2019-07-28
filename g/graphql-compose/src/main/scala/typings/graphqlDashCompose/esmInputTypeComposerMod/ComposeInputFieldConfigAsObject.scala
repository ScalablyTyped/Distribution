package typings.graphqlDashCompose.esmInputTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.InputValueDefinitionNode
import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.graphqlDashCompose.esmUtilsDefinitionsMod.Extensions
import typings.graphqlDashCompose.esmUtilsDefinitionsMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeInputFieldConfigAsObject
  extends /* key */ StringDictionary[js.Any] {
  var astNode: js.UndefOr[InputValueDefinitionNode | Null] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[String | Null] = js.undefined
  var extensions: js.UndefOr[Extensions] = js.undefined
  var `type`: Thunk[ComposeInputType] | GraphQLInputType
}

object ComposeInputFieldConfigAsObject {
  @scala.inline
  def apply(
    `type`: Thunk[ComposeInputType] | GraphQLInputType,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    astNode: InputValueDefinitionNode = null,
    defaultValue: js.Any = null,
    description: String = null,
    extensions: Extensions = null
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

