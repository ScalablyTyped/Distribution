package typings.ionicCliFramework.helpMod

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
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NamespaceHelpSchema]
  }
}

