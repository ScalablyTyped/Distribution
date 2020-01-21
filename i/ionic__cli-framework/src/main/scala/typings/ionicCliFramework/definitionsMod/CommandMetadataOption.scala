package typings.ionicCliFramework.definitionsMod

import typings.ionicCliFramework.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandMetadataOption extends Metadata {
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  var default: js.UndefOr[String | Boolean] = js.undefined
  var spec: js.UndefOr[AnonValue] = js.undefined
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
    spec: AnonValue = null,
    `type`: CommandOptionType = null
  ): CommandMetadataOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (footnotes != null) __obj.updateDynamic("footnotes")(footnotes.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadataOption]
  }
}

