package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragDropHandleOptionsObject extends js.Object {
  
  /**
    * (Highcharts, Highstock, Gantt) The class name of the drag handles.
    * Defaults to `highcharts-drag-handle`.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The fill color of the drag handles.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The mouse cursor to use for the drag
    * handles. By default this is intelligently switching between `ew-resize`
    * and `ns-resize` depending on the direction the point is being dragged.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The line color of the drag handles.
    */
  var lineColor: js.UndefOr[ColorString] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The line width for the drag handles.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Function to define the SVG path to use for
    * the drag handles. Takes the point as argument. Should return an SVG path
    * in array format. The SVG path is automatically positioned on the point.
    */
  var pathFormatter: js.UndefOr[js.Function] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The z index for the drag handles.
    */
  var zIndex: js.UndefOr[Double] = js.native
}
object DragDropHandleOptionsObject {
  
  @scala.inline
  def apply(): DragDropHandleOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragDropHandleOptionsObject]
  }
  
  @scala.inline
  implicit class DragDropHandleOptionsObjectOps[Self <: DragDropHandleOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setLineColor(value: ColorString): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setPathFormatter(value: js.Function): Self = this.set("pathFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathFormatter: Self = this.set("pathFormatter", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
