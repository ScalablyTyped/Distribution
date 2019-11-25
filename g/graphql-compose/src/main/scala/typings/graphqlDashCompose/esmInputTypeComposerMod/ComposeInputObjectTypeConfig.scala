package typings.graphqlDashCompose.esmInputTypeComposerMod

import typings.graphqlDashCompose.esmUtilsDefinitionsMod.Extensions
import typings.graphqlDashCompose.esmUtilsDefinitionsMod.Thunk
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
    description: String = null,
    extensions: Extensions = null
  ): ComposeInputObjectTypeConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeInputObjectTypeConfig]
  }
}

