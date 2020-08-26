package typings.jsonEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ace extends js.Object {
  var ace: Theme = js.native
  var epiceditor: BasePath = js.native
  var sceditor: EmoticonsEnabled = js.native
  var selectize: Enable = js.native
}

object Ace {
  @scala.inline
  def apply(ace: Theme, epiceditor: BasePath, sceditor: EmoticonsEnabled, selectize: Enable): Ace = {
    val __obj = js.Dynamic.literal(ace = ace.asInstanceOf[js.Any], epiceditor = epiceditor.asInstanceOf[js.Any], sceditor = sceditor.asInstanceOf[js.Any], selectize = selectize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ace]
  }
  @scala.inline
  implicit class AceOps[Self <: Ace] (val x: Self) extends AnyVal {
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
    def setAce(value: Theme): Self = this.set("ace", value.asInstanceOf[js.Any])
    @scala.inline
    def setEpiceditor(value: BasePath): Self = this.set("epiceditor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSceditor(value: EmoticonsEnabled): Self = this.set("sceditor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectize(value: Enable): Self = this.set("selectize", value.asInstanceOf[js.Any])
  }
  
}

