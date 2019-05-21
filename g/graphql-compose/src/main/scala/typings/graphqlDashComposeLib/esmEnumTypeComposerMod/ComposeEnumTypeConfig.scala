package typings
package graphqlDashComposeLib.esmEnumTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeEnumTypeConfig extends _EnumTypeComposeDefinition {
  var description: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var extensions: js.UndefOr[graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions] = js.undefined
  var name: java.lang.String
  var values: js.UndefOr[ComposeEnumValueConfigMap] = js.undefined
}

object ComposeEnumTypeConfig {
  @scala.inline
  def apply(
    name: java.lang.String,
    description: java.lang.String = null,
    extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions = null,
    values: ComposeEnumValueConfigMap = null
  ): ComposeEnumTypeConfig = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[ComposeEnumTypeConfig]
  }
}

