package typings.atIonicCliDashFramework.libHelpMod

import typings.atIonicCliDashFramework.Anon_ValueString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandHelpSchemaOption extends js.Object {
  val aliases: js.Array[String]
  val default: js.UndefOr[String | Boolean] = js.undefined
  val groups: js.Array[String]
  val name: String
  val spec: Anon_ValueString
  val summary: String
  val `type`: String
}

object CommandHelpSchemaOption {
  @scala.inline
  def apply(
    aliases: js.Array[String],
    groups: js.Array[String],
    name: String,
    spec: Anon_ValueString,
    summary: String,
    `type`: String,
    default: String | Boolean = null
  ): CommandHelpSchemaOption = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpSchemaOption]
  }
}

