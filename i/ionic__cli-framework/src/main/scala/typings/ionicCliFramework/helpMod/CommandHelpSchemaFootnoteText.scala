package typings.ionicCliFramework.helpMod

import typings.ionicCliFramework.ionicCliFrameworkStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandHelpSchemaFootnoteText extends CommandHelpSchemaFootnote {
  val id: String | Double = js.native
  val text: String = js.native
  val `type`: typings.ionicCliFramework.ionicCliFrameworkStrings.text = js.native
}

object CommandHelpSchemaFootnoteText {
  @scala.inline
  def apply(id: String | Double, text: String, `type`: text): CommandHelpSchemaFootnoteText = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpSchemaFootnoteText]
  }
  @scala.inline
  implicit class CommandHelpSchemaFootnoteTextOps[Self <: CommandHelpSchemaFootnoteText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: text): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

