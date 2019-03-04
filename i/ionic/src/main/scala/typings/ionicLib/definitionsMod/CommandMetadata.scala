package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandMetadata
  extends atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[
      atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput, 
      CommandMetadataOption
    ] {
  var `type`: ionicLib.ionicLibStrings.global | ionicLib.ionicLibStrings.project
}

object CommandMetadata {
  @scala.inline
  def apply(
    name: java.lang.String,
    summary: java.lang.String,
    `type`: ionicLib.ionicLibStrings.global | ionicLib.ionicLibStrings.project,
    description: java.lang.String = null,
    exampleCommands: js.Array[java.lang.String] = null,
    footnotes: js.Array[atIonicCliDashFrameworkLib.definitionsMod.Footnote] = null,
    groups: js.Array[java.lang.String] = null,
    inputs: js.Array[atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput] = null,
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

