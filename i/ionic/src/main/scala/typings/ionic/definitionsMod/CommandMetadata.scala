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
    val __obj = js.Dynamic.literal(name = name, summary = summary)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (exampleCommands != null) __obj.updateDynamic("exampleCommands")(exampleCommands)
    if (footnotes != null) __obj.updateDynamic("footnotes")(footnotes)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[CommandMetadata]
  }
}

