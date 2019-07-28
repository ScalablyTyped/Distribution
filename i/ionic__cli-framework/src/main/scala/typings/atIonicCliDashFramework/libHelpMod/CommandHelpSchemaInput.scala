package typings.atIonicCliDashFramework.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandHelpSchemaInput extends js.Object {
  val name: String
  val required: Boolean
  val summary: String
}

object CommandHelpSchemaInput {
  @scala.inline
  def apply(name: String, required: Boolean, summary: String): CommandHelpSchemaInput = {
    val __obj = js.Dynamic.literal(name = name, required = required, summary = summary)
  
    __obj.asInstanceOf[CommandHelpSchemaInput]
  }
}

