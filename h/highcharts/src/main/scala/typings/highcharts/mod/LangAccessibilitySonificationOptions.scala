package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilitySonificationOptions extends js.Object {
  var playAsSoundButtonText: js.UndefOr[String] = js.native
  var playAsSoundClickAnnouncement: js.UndefOr[String] = js.native
}

object LangAccessibilitySonificationOptions {
  @scala.inline
  def apply(): LangAccessibilitySonificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilitySonificationOptions]
  }
  @scala.inline
  implicit class LangAccessibilitySonificationOptionsOps[Self <: LangAccessibilitySonificationOptions] (val x: Self) extends AnyVal {
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
    def setPlayAsSoundButtonText(value: String): Self = this.set("playAsSoundButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayAsSoundButtonText: Self = this.set("playAsSoundButtonText", js.undefined)
    @scala.inline
    def setPlayAsSoundClickAnnouncement(value: String): Self = this.set("playAsSoundClickAnnouncement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayAsSoundClickAnnouncement: Self = this.set("playAsSoundClickAnnouncement", js.undefined)
  }
  
}

