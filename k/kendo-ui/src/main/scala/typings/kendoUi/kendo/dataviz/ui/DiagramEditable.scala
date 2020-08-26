package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramEditable extends js.Object {
  var connectionTemplate: js.UndefOr[String | js.Function] = js.native
  var drag: js.UndefOr[Boolean | DiagramEditableDrag] = js.native
  var remove: js.UndefOr[Boolean] = js.native
  var resize: js.UndefOr[Boolean | DiagramEditableResize] = js.native
  var rotate: js.UndefOr[Boolean | DiagramEditableRotate] = js.native
  var shapeTemplate: js.UndefOr[String | js.Function] = js.native
  var tools: js.UndefOr[js.Array[DiagramEditableTool]] = js.native
}

object DiagramEditable {
  @scala.inline
  def apply(): DiagramEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditable]
  }
  @scala.inline
  implicit class DiagramEditableOps[Self <: DiagramEditable] (val x: Self) extends AnyVal {
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
    def setConnectionTemplate(value: String | js.Function): Self = this.set("connectionTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionTemplate: Self = this.set("connectionTemplate", js.undefined)
    @scala.inline
    def setDrag(value: Boolean | DiagramEditableDrag): Self = this.set("drag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setResize(value: Boolean | DiagramEditableResize): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setRotate(value: Boolean | DiagramEditableRotate): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setShapeTemplate(value: String | js.Function): Self = this.set("shapeTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeTemplate: Self = this.set("shapeTemplate", js.undefined)
    @scala.inline
    def setToolsVarargs(value: DiagramEditableTool*): Self = this.set("tools", js.Array(value :_*))
    @scala.inline
    def setTools(value: js.Array[DiagramEditableTool]): Self = this.set("tools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTools: Self = this.set("tools", js.undefined)
  }
  
}

