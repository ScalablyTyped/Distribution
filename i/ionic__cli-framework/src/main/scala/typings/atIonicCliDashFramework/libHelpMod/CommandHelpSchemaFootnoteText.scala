package typings.atIonicCliDashFramework.libHelpMod

import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandHelpSchemaFootnoteText extends CommandHelpSchemaFootnote {
  val id: String | Double
  val text: String
  val `type`: typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.text
}

object CommandHelpSchemaFootnoteText {
  @scala.inline
  def apply(id: String | Double, text: String, `type`: text): CommandHelpSchemaFootnoteText = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CommandHelpSchemaFootnoteText]
  }
}

