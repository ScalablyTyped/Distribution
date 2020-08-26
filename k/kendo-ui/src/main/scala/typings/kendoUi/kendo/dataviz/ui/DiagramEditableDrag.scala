package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramEditableDrag extends js.Object {
  var snap: js.UndefOr[Boolean | DiagramEditableDragSnap] = js.native
}

object DiagramEditableDrag {
  @scala.inline
  def apply(): DiagramEditableDrag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditableDrag]
  }
  @scala.inline
  implicit class DiagramEditableDragOps[Self <: DiagramEditableDrag] (val x: Self) extends AnyVal {
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
    def setSnap(value: Boolean | DiagramEditableDragSnap): Self = this.set("snap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
  }
  
}

