package typings.ionic.definitionsMod

import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.Footnote
import typings.ionic.ionicStrings.global
import typings.ionic.ionicStrings.project
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandMetadata
  extends typings.atIonicCliDashFramework.definitionsMod.CommandMetadata[CommandMetadataInput, CommandMetadataOption] {
  var `type`: global | project
}

object CommandMetadata {
  @scala.inline
  def apply(
    name: String,
    summary: String,
    `type`: global | project,
    description: String = null,
    exampleCommands: js.Array[String] = null,
    footnotes: js.Array[Footnote] = null,
    groups: js.Array[String] = null,
    inputs: js.Array[CommandMetadataInput] = null,
    options: js.Array[CommandMetadataOption] = null
  ): CommandMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (exampleCommands != null) __obj.updateDynamic("exampleCommands")(exampleCommands.asInstanceOf[js.Any])
    if (footnotes != null) __obj.updateDynamic("footnotes")(footnotes.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadata]
  }
}

