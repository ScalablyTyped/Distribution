package typings.ionicCliFramework.helpMod

import typings.ionicCliFramework.ionicCliFrameworkStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandHelpSchemaFootnoteText extends CommandHelpSchemaFootnote {
  val id: String | Double
  val text: String
  val `type`: typings.ionicCliFramework.ionicCliFrameworkStrings.text
}

object CommandHelpSchemaFootnoteText {
  @scala.inline
  def apply(id: String | Double, text: String, `type`: text): CommandHelpSchemaFootnoteText = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpSchemaFootnoteText]
  }
}

