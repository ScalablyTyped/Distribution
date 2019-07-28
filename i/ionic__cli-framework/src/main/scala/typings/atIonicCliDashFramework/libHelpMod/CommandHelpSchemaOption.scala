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
    val __obj = js.Dynamic.literal(aliases = aliases, groups = groups, name = name, spec = spec, summary = summary)
    __obj.updateDynamic("type")(`type`)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpSchemaOption]
  }
}

