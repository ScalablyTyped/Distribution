package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramEditableRotate extends js.Object {
  
  var fill: js.UndefOr[DiagramEditableRotateFill] = js.native
  
  var stroke: js.UndefOr[DiagramEditableRotateStroke] = js.native
}
object DiagramEditableRotate {
  
  @scala.inline
  def apply(): DiagramEditableRotate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditableRotate]
  }
  
  @scala.inline
  implicit class DiagramEditableRotateOps[Self <: DiagramEditableRotate] (val x: Self) extends AnyVal {
    
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
    def setFill(value: DiagramEditableRotateFill): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setStroke(value: DiagramEditableRotateStroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
}
