package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationMockPointOptionsObject extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The x position of the point.
    * Units can be either in axis or chart pixel coordinates.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This number defines which xAxis
    * the point is connected to. It refers to either the axis id or the index
    * of the axis in the xAxis array. If the option is not configured or the
    * axis is not found the point's x coordinate refers to the chart pixels.
    */
  var xAxis: js.UndefOr[Double | String | Null] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The y position of the point.
    * Units can be either in axis or chart pixel coordinates.
    */
  var y: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This number defines which yAxis
    * the point is connected to. It refers to either the axis id or the index
    * of the axis in the yAxis array. If the option is not configured or the
    * axis is not found the point's y coordinate refers to the chart pixels.
    */
  var yAxis: js.UndefOr[Double | String | Null] = js.native
}
object AnnotationMockPointOptionsObject {
  
  @scala.inline
  def apply(): AnnotationMockPointOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationMockPointOptionsObject]
  }
  
  @scala.inline
  implicit class AnnotationMockPointOptionsObjectOps[Self <: AnnotationMockPointOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setXAxis(value: Double | String): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    
    @scala.inline
    def setXAxisNull: Self = this.set("xAxis", null)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setYAxis(value: Double | String): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
    
    @scala.inline
    def setYAxisNull: Self = this.set("yAxis", null)
  }
}
