package typings.graphqlCompose.inputTypeComposerMod

import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.definitionsMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeInputObjectTypeConfig extends _InputTypeComposeDefinition {
  var description: js.UndefOr[String | Null] = js.undefined
  var extensions: js.UndefOr[Extensions] = js.undefined
  var fields: Thunk[ComposeInputFieldConfigMap]
  var name: String
}

object ComposeInputObjectTypeConfig {
  @scala.inline
  def apply(
    fields: Thunk[ComposeInputFieldConfigMap],
    name: String,
    description: js.UndefOr[Null | String] = js.undefined,
    extensions: Extensions = null
  ): ComposeInputObjectTypeConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeInputObjectTypeConfig]
  }
}

