package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceHelpSchema extends js.Object {
  val aliases: js.Array[java.lang.String]
  val commands: js.Array[CommandHelpSchema]
  val description: java.lang.String
  val groups: js.Array[java.lang.String]
  val name: java.lang.String
  val summary: java.lang.String
}

object NamespaceHelpSchema {
  @scala.inline
  def apply(
    aliases: js.Array[java.lang.String],
    commands: js.Array[CommandHelpSchema],
    description: java.lang.String,
    groups: js.Array[java.lang.String],
    name: java.lang.String,
    summary: java.lang.String
  ): NamespaceHelpSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aliases")(aliases)
    __obj.updateDynamic("commands")(commands)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("groups")(groups)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("summary")(summary)
    __obj.asInstanceOf[NamespaceHelpSchema]
  }
}

