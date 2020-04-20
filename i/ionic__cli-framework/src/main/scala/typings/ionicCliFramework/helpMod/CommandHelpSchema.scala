package typings.ionicCliFramework.helpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandHelpSchema extends js.Object {
  val aliases: js.Array[String]
  val description: String
  val exampleCommands: js.Array[String]
  val footnotes: js.Array[CommandHelpSchemaFootnote]
  val groups: js.Array[String]
  val inputs: js.Array[CommandHelpSchemaInput]
  val name: String
  val namespace: js.Array[String]
  val options: js.Array[CommandHelpSchemaOption]
  val summary: String
}

object CommandHelpSchema {
  @scala.inline
  def apply(
    aliases: js.Array[String],
    description: String,
    exampleCommands: js.Array[String],
    footnotes: js.Array[CommandHelpSchemaFootnote],
    groups: js.Array[String],
    inputs: js.Array[CommandHelpSchemaInput],
    name: String,
    namespace: js.Array[String],
    options: js.Array[CommandHelpSchemaOption],
    summary: String
  ): CommandHelpSchema = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], exampleCommands = exampleCommands.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpSchema]
  }
}

