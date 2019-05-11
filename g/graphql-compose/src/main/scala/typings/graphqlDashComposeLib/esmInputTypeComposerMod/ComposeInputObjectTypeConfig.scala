package typings
package graphqlDashComposeLib.esmInputTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeInputObjectTypeConfig extends _InputTypeComposeDefinition {
  var description: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var extensions: js.UndefOr[graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions] = js.undefined
  var fields: graphqlDashComposeLib.esmUtilsDefinitionsMod.Thunk[ComposeInputFieldConfigMap]
  var name: java.lang.String
}

object ComposeInputObjectTypeConfig {
  @scala.inline
  def apply(
    fields: graphqlDashComposeLib.esmUtilsDefinitionsMod.Thunk[ComposeInputFieldConfigMap],
    name: java.lang.String,
    description: java.lang.String = null,
    extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions = null
  ): ComposeInputObjectTypeConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[ComposeInputObjectTypeConfig]
  }
}

