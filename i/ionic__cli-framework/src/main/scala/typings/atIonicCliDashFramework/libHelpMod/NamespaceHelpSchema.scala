package typings.atIonicCliDashFramework.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceHelpSchema extends js.Object {
  val aliases: js.Array[String]
  val commands: js.Array[CommandHelpSchema]
  val description: String
  val groups: js.Array[String]
  val name: String
  val summary: String
}

object NamespaceHelpSchema {
  @scala.inline
  def apply(
    aliases: js.Array[String],
    commands: js.Array[CommandHelpSchema],
    description: String,
    groups: js.Array[String],
    name: String,
    summary: String
  ): NamespaceHelpSchema = {
    val __obj = js.Dynamic.literal(aliases = aliases, commands = commands, description = description, groups = groups, name = name, summary = summary)
  
    __obj.asInstanceOf[NamespaceHelpSchema]
  }
}

