package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartParallelAxesResizeOptions extends js.Object {
  
  /**
    * (Highstock) Contains two arrays of axes that are controlled by control
    * line of the axis.
    */
  var controlledAxis: js.UndefOr[ChartParallelAxesResizeControlledAxisOptions] = js.native
  
  /**
    * (Highstock) Cursor style for the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * (Highstock) Enable or disable resize by drag for the axis.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock) Color of the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var lineColor: js.UndefOr[ColorString] = js.native
  
  /**
    * (Highstock) Dash style of the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var lineDashStyle: js.UndefOr[String] = js.native
  
  /**
    * (Highstock) Width of the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) Horizontal offset of the control line.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) Vertical offset of the control line.
    */
  var y: js.UndefOr[Double] = js.native
}
object ChartParallelAxesResizeOptions {
  
  @scala.inline
  def apply(): ChartParallelAxesResizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartParallelAxesResizeOptions]
  }
  
  @scala.inline
  implicit class ChartParallelAxesResizeOptionsOps[Self <: ChartParallelAxesResizeOptions] (val x: Self) extends AnyVal {
    
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
    def setControlledAxis(value: ChartParallelAxesResizeControlledAxisOptions): Self = this.set("controlledAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlledAxis: Self = this.set("controlledAxis", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setLineColor(value: ColorString): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setLineDashStyle(value: String): Self = this.set("lineDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineDashStyle: Self = this.set("lineDashStyle", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
