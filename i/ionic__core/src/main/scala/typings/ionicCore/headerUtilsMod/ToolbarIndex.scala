package typings.ionicCore.headerUtilsMod

import typings.ionicCore.componentsMod.global.HTMLIonTitleElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarIndex extends js.Object {
  var background: HTMLElement = js.native
  var el: HTMLElement = js.native
  var innerTitleEl: HTMLElement = js.native
  var ionButtonsEl: js.Array[js.Any | HTMLElement] = js.native
  var ionTitleEl: js.UndefOr[HTMLIonTitleElement] = js.native
}

object ToolbarIndex {
  @scala.inline
  def apply(
    background: HTMLElement,
    el: HTMLElement,
    innerTitleEl: HTMLElement,
    ionButtonsEl: js.Array[js.Any | HTMLElement]
  ): ToolbarIndex = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], innerTitleEl = innerTitleEl.asInstanceOf[js.Any], ionButtonsEl = ionButtonsEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarIndex]
  }
  @scala.inline
  implicit class ToolbarIndexOps[Self <: ToolbarIndex] (val x: Self) extends AnyVal {
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
    def setBackground(value: HTMLElement): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def setEl(value: HTMLElement): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerTitleEl(value: HTMLElement): Self = this.set("innerTitleEl", value.asInstanceOf[js.Any])
    @scala.inline
    def setIonButtonsElVarargs(value: (js.Any | HTMLElement)*): Self = this.set("ionButtonsEl", js.Array(value :_*))
    @scala.inline
    def setIonButtonsEl(value: js.Array[js.Any | HTMLElement]): Self = this.set("ionButtonsEl", value.asInstanceOf[js.Any])
    @scala.inline
    def setIonTitleEl(value: HTMLIonTitleElement): Self = this.set("ionTitleEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIonTitleEl: Self = this.set("ionTitleEl", js.undefined)
  }
  
}

