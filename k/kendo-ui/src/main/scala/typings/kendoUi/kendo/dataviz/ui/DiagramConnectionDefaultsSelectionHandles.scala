package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramConnectionDefaultsSelectionHandles extends js.Object {
  
  var fill: js.UndefOr[String | DiagramConnectionDefaultsSelectionHandlesFill] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var stroke: js.UndefOr[DiagramConnectionDefaultsSelectionHandlesStroke] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DiagramConnectionDefaultsSelectionHandles {
  
  @scala.inline
  def apply(): DiagramConnectionDefaultsSelectionHandles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsSelectionHandles]
  }
  
  @scala.inline
  implicit class DiagramConnectionDefaultsSelectionHandlesOps[Self <: DiagramConnectionDefaultsSelectionHandles] (val x: Self) extends AnyVal {
    
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
    def setFill(value: String | DiagramConnectionDefaultsSelectionHandlesFill): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setStroke(value: DiagramConnectionDefaultsSelectionHandlesStroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
