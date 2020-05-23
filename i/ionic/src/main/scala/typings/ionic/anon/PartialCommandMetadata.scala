package typings.ionic.anon

import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.ionicStrings.global
import typings.ionic.ionicStrings.project
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.Footnote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ionic.ionic/definitions.CommandMetadata> */
trait PartialCommandMetadata extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var exampleCommands: js.UndefOr[js.Array[String]] = js.undefined
  var footnotes: js.UndefOr[js.Array[Footnote]] = js.undefined
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  var inputs: js.UndefOr[js.Array[CommandMetadataInput]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[js.Array[CommandMetadataOption]] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[global | project] = js.undefined
}

object PartialCommandMetadata {
  @scala.inline
  def apply(
    description: String = null,
    exampleCommands: js.Array[String] = null,
    footnotes: js.Array[Footnote] = null,
    groups: js.Array[String] = null,
    inputs: js.Array[CommandMetadataInput] = null,
    name: String = null,
    options: js.Array[CommandMetadataOption] = null,
    summary: String = null,
    `type`: global | project = null
  ): PartialCommandMetadata = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (exampleCommands != null) __obj.updateDynamic("exampleCommands")(exampleCommands.asInstanceOf[js.Any])
    if (footnotes != null) __obj.updateDynamic("footnotes")(footnotes.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCommandMetadata]
  }
}

