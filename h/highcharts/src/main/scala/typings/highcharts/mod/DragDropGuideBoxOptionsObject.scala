package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragDropGuideBoxOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) CSS class name of the guide box in this
    * state. Defaults to `highcharts-drag-box-default`.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Guide box fill color.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Guide box cursor.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Color of the border around the guide box.
    */
  var lineColor: js.UndefOr[ColorString] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Width of the line around the guide box.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Guide box zIndex.
    */
  var zIndex: js.UndefOr[Double] = js.native
}
object DragDropGuideBoxOptionsObject {
  
  @scala.inline
  def apply(): DragDropGuideBoxOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragDropGuideBoxOptionsObject]
  }
  
  @scala.inline
  implicit class DragDropGuideBoxOptionsObjectMutableBuilder[Self <: DragDropGuideBoxOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setLineColor(value: ColorString): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
