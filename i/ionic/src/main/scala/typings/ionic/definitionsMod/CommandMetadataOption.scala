package typings.ionic.definitionsMod

import typings.atIonicCliDashFramework.Anon_Value
import typings.atIonicCliDashFramework.definitionsMod.CommandOptionType
import typings.atIonicCliDashFramework.definitionsMod.Footnote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandMetadataOption
  extends typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption {
  var hint: js.UndefOr[String] = js.undefined
  var `private`: js.UndefOr[Boolean] = js.undefined
}

object CommandMetadataOption {
  @scala.inline
  def apply(
    name: String,
    summary: String,
    aliases: js.Array[String] = null,
    default: String | Boolean = null,
    description: String = null,
    footnotes: js.Array[Footnote] = null,
    groups: js.Array[String] = null,
    hint: String = null,
    `private`: js.UndefOr[Boolean] = js.undefined,
    spec: Anon_Value = null,
    `type`: CommandOptionType = null
  ): CommandMetadataOption = {
    val __obj = js.Dynamic.literal(name = name, summary = summary)
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (footnotes != null) __obj.updateDynamic("footnotes")(footnotes)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    if (spec != null) __obj.updateDynamic("spec")(spec)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadataOption]
  }
}

