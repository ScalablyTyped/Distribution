package typings.atIonicCliDashFramework.definitionsMod

import typings.atIonicCliDashFramework.Anon_Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandMetadataOption extends Metadata {
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  var default: js.UndefOr[String | Boolean] = js.undefined
  var spec: js.UndefOr[Anon_Value] = js.undefined
  var `type`: js.UndefOr[CommandOptionType] = js.undefined
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
    spec: Anon_Value = null,
    `type`: CommandOptionType = null
  ): CommandMetadataOption = {
    val __obj = js.Dynamic.literal(name = name, summary = summary)
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (footnotes != null) __obj.updateDynamic("footnotes")(footnotes)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (spec != null) __obj.updateDynamic("spec")(spec)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadataOption]
  }
}

