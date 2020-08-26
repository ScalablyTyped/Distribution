package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramShapeDefaultsHover extends js.Object {
  var fill: js.UndefOr[String | DiagramShapeDefaultsHoverFill] = js.native
}

object DiagramShapeDefaultsHover {
  @scala.inline
  def apply(): DiagramShapeDefaultsHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeDefaultsHover]
  }
  @scala.inline
  implicit class DiagramShapeDefaultsHoverOps[Self <: DiagramShapeDefaultsHover] (val x: Self) extends AnyVal {
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
    def setFill(value: String | DiagramShapeDefaultsHoverFill): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
  }
  
}

