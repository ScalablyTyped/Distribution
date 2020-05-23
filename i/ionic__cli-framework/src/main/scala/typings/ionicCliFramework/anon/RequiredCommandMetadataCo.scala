package typings.ionicCliFramework.anon

import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.Footnote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<@ionic/cli-framework.@ionic/cli-framework/definitions.CommandMetadata<@ionic/cli-framework.@ionic/cli-framework/definitions.CommandMetadataInput, @ionic/cli-framework.@ionic/cli-framework/definitions.CommandMetadataOption>> */
trait RequiredCommandMetadataCo extends js.Object {
  var description: String
  var exampleCommands: js.Array[String]
  var footnotes: js.Array[Footnote]
  var groups: js.Array[String]
  var inputs: js.Array[CommandMetadataInput]
  var name: String
  var options: js.Array[CommandMetadataOption]
  var summary: String
}

object RequiredCommandMetadataCo {
  @scala.inline
  def apply(
    description: String,
    exampleCommands: js.Array[String],
    footnotes: js.Array[Footnote],
    groups: js.Array[String],
    inputs: js.Array[CommandMetadataInput],
    name: String,
    options: js.Array[CommandMetadataOption],
    summary: String
  ): RequiredCommandMetadataCo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], exampleCommands = exampleCommands.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredCommandMetadataCo]
  }
}

