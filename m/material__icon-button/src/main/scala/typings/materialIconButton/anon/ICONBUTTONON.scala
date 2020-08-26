package typings.materialIconButton.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICONBUTTONON extends js.Object {
  var ICON_BUTTON_ON: String = js.native
  var ROOT: String = js.native
}

object ICONBUTTONON {
  @scala.inline
  def apply(ICON_BUTTON_ON: String, ROOT: String): ICONBUTTONON = {
    val __obj = js.Dynamic.literal(ICON_BUTTON_ON = ICON_BUTTON_ON.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICONBUTTONON]
  }
  @scala.inline
  implicit class ICONBUTTONONOps[Self <: ICONBUTTONON] (val x: Self) extends AnyVal {
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
    def setICON_BUTTON_ON(value: String): Self = this.set("ICON_BUTTON_ON", value.asInstanceOf[js.Any])
    @scala.inline
    def setROOT(value: String): Self = this.set("ROOT", value.asInstanceOf[js.Any])
  }
  
}

