package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisCrosshairOptions extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A class name for the crosshair,
    * especially as a hook for styling.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the crosshair.
    * Defaults to `#cccccc` for numeric and datetime axes, and
    * `rgba(204,214,235,0.25)` for category axes, where the crosshair by
    * default highlights the whole category.
    */
  var color: js.UndefOr[ColorType] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The dash style for the
    * crosshair. See plotOptions.series.dashStyle for possible values.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.native
  
  /**
    * (Highstock) A label on the axis next to the crosshair.
    *
    * In styled mode, the label is styled with the
    * `.highcharts-crosshair-label` class.
    */
  var label: js.UndefOr[AxisCrosshairLabelOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether the crosshair should
    * snap to the point or follow the pointer independent of points.
    */
  var snap: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the
    * crosshair. Defaults to 1 for numeric or datetime axes, and for one
    * category width for category axes.
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the crosshair.
    * Higher Z indices allow drawing the crosshair on top of the series or
    * behind the grid lines.
    */
  var zIndex: js.UndefOr[Double] = js.native
}
object AxisCrosshairOptions {
  
  @scala.inline
  def apply(): AxisCrosshairOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisCrosshairOptions]
  }
  
  @scala.inline
  implicit class AxisCrosshairOptionsOps[Self <: AxisCrosshairOptions] (val x: Self) extends AnyVal {
    
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
    def setColor(value: ColorType): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDashStyle(value: DashStyleValue): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: AxisCrosshairLabelOptions): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setSnap(value: Boolean): Self = this.set("snap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
