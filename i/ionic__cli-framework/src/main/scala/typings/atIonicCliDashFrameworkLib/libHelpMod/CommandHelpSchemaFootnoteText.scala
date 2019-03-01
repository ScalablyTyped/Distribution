package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandHelpSchemaFootnoteText extends CommandHelpSchemaFootnote {
  val id: java.lang.String | scala.Double
  val text: java.lang.String
  val `type`: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.text
}

object CommandHelpSchemaFootnoteText {
  @scala.inline
  def apply(
    id: java.lang.String | scala.Double,
    text: java.lang.String,
    `type`: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.text
  ): CommandHelpSchemaFootnoteText = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[CommandHelpSchemaFootnoteText]
  }
}

