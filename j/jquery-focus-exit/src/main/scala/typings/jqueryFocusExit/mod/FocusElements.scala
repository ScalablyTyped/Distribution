package typings.jqueryFocusExit.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusElements extends js.Object {
  var gainedFocus: HTMLElement = js.native
  var lostFocus: js.UndefOr[HTMLElement] = js.native
}

object FocusElements {
  @scala.inline
  def apply(gainedFocus: HTMLElement): FocusElements = {
    val __obj = js.Dynamic.literal(gainedFocus = gainedFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusElements]
  }
  @scala.inline
  implicit class FocusElementsOps[Self <: FocusElements] (val x: Self) extends AnyVal {
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
    def setGainedFocus(value: HTMLElement): Self = this.set("gainedFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setLostFocus(value: HTMLElement): Self = this.set("lostFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLostFocus: Self = this.set("lostFocus", js.undefined)
  }
  
}

