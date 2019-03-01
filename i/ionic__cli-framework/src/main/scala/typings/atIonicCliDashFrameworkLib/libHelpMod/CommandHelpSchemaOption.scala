package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandHelpSchemaOption extends js.Object {
  val aliases: js.Array[java.lang.String]
  val default: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  val groups: js.Array[java.lang.String]
  val name: java.lang.String
  val spec: atIonicCliDashFrameworkLib.Anon_ValueString
  val summary: java.lang.String
  val `type`: java.lang.String
}

object CommandHelpSchemaOption {
  @scala.inline
  def apply(
    aliases: js.Array[java.lang.String],
    groups: js.Array[java.lang.String],
    name: java.lang.String,
    spec: atIonicCliDashFrameworkLib.Anon_ValueString,
    summary: java.lang.String,
    `type`: java.lang.String,
    default: java.lang.String | scala.Boolean = null
  ): CommandHelpSchemaOption = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("aliases")(aliases)
    __obj.updateDynamic("groups")(groups)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("spec")(spec)
    __obj.updateDynamic("summary")(summary)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpSchemaOption]
  }
}

