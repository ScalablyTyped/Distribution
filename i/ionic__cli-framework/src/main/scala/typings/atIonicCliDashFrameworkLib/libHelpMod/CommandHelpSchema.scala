package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandHelpSchema extends js.Object {
  val aliases: js.Array[java.lang.String]
  val description: java.lang.String
  val exampleCommands: js.Array[java.lang.String]
  val footnotes: js.Array[CommandHelpSchemaFootnote]
  val groups: js.Array[java.lang.String]
  val inputs: js.Array[CommandHelpSchemaInput]
  val name: java.lang.String
  val namespace: js.Array[java.lang.String]
  val options: js.Array[CommandHelpSchemaOption]
  val summary: java.lang.String
}

object CommandHelpSchema {
  @scala.inline
  def apply(
    aliases: js.Array[java.lang.String],
    description: java.lang.String,
    exampleCommands: js.Array[java.lang.String],
    footnotes: js.Array[CommandHelpSchemaFootnote],
    groups: js.Array[java.lang.String],
    inputs: js.Array[CommandHelpSchemaInput],
    name: java.lang.String,
    namespace: js.Array[java.lang.String],
    options: js.Array[CommandHelpSchemaOption],
    summary: java.lang.String
  ): CommandHelpSchema = {
    val __obj = js.Dynamic.literal(aliases = aliases, description = description, exampleCommands = exampleCommands, footnotes = footnotes, groups = groups, inputs = inputs, name = name, namespace = namespace, options = options, summary = summary)
  
    __obj.asInstanceOf[CommandHelpSchema]
  }
}

