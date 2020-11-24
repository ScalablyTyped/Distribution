package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramLayoutGrid extends js.Object {
  
  var componentSpacingX: js.UndefOr[Double] = js.native
  
  var componentSpacingY: js.UndefOr[Double] = js.native
  
  var offsetX: js.UndefOr[Double] = js.native
  
  var offsetY: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DiagramLayoutGrid {
  
  @scala.inline
  def apply(): DiagramLayoutGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramLayoutGrid]
  }
  
  @scala.inline
  implicit class DiagramLayoutGridOps[Self <: DiagramLayoutGrid] (val x: Self) extends AnyVal {
    
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
    def setComponentSpacingX(value: Double): Self = this.set("componentSpacingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentSpacingX: Self = this.set("componentSpacingX", js.undefined)
    
    @scala.inline
    def setComponentSpacingY(value: Double): Self = this.set("componentSpacingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentSpacingY: Self = this.set("componentSpacingY", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
