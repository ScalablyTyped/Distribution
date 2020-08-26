package typings.materialDom.focusTrapMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusOptions extends js.Object {
  var initialFocusEl: js.UndefOr[HTMLElement] = js.native
  var skipInitialFocus: js.UndefOr[Boolean] = js.native
}

object FocusOptions {
  @scala.inline
  def apply(): FocusOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusOptions]
  }
  @scala.inline
  implicit class FocusOptionsOps[Self <: FocusOptions] (val x: Self) extends AnyVal {
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
    def setInitialFocusEl(value: HTMLElement): Self = this.set("initialFocusEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialFocusEl: Self = this.set("initialFocusEl", js.undefined)
    @scala.inline
    def setSkipInitialFocus(value: Boolean): Self = this.set("skipInitialFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipInitialFocus: Self = this.set("skipInitialFocus", js.undefined)
  }
  
}

