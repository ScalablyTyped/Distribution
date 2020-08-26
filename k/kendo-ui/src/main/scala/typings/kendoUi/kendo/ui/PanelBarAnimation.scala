package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelBarAnimation extends js.Object {
  var collapse: js.UndefOr[PanelBarAnimationCollapse] = js.native
  var expand: js.UndefOr[PanelBarAnimationExpand] = js.native
}

object PanelBarAnimation {
  @scala.inline
  def apply(): PanelBarAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelBarAnimation]
  }
  @scala.inline
  implicit class PanelBarAnimationOps[Self <: PanelBarAnimation] (val x: Self) extends AnyVal {
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
    def setCollapse(value: PanelBarAnimationCollapse): Self = this.set("collapse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    @scala.inline
    def setExpand(value: PanelBarAnimationExpand): Self = this.set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
  }
  
}

