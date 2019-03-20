package typings
package graphqlDashComposeLib.libInputTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeInputObjectTypeConfig extends _InputTypeComposerDefinition {
  var description: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var fields: graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[ComposeInputFieldConfigMap]
  var name: java.lang.String
}

object ComposeInputObjectTypeConfig {
  @scala.inline
  def apply(
    fields: graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[ComposeInputFieldConfigMap],
    name: java.lang.String,
    description: java.lang.String = null
  ): ComposeInputObjectTypeConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ComposeInputObjectTypeConfig]
  }
}

