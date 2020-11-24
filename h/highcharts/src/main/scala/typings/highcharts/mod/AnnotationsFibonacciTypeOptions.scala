package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsFibonacciTypeOptions extends js.Object {
  
  /**
    * (Highstock) An array of background colors: Default to: (see online
    * documentation for example)
    */
  var backgroundColors: js.UndefOr[js.Object] = js.native
  
  /**
    * (Highstock) The height of the fibonacci in terms of yAxis.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) An array with options for the labels.
    */
  var labels: js.UndefOr[js.Array[AnnotationsFibonacciTypeLabelsOptions]] = js.native
  
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsFibonacciTypeLineOptions] = js.native
  
  /**
    * (Highstock) The color of line.
    */
  var lineColor: js.UndefOr[String] = js.native
  
  /**
    * (Highstock) An array of colors for the lines.
    */
  var lineColors: js.UndefOr[js.Object] = js.native
  
  var points: js.UndefOr[js.Array[AnnotationsFibonacciTypePointsOptions]] = js.native
  
  /**
    * (Highstock) This number defines which xAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var xAxis: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) This number defines which yAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var yAxis: js.UndefOr[Double] = js.native
}
object AnnotationsFibonacciTypeOptions {
  
  @scala.inline
  def apply(): AnnotationsFibonacciTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsFibonacciTypeOptions]
  }
  
  @scala.inline
  implicit class AnnotationsFibonacciTypeOptionsOps[Self <: AnnotationsFibonacciTypeOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColors(value: js.Object): Self = this.set("backgroundColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColors: Self = this.set("backgroundColors", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: AnnotationsFibonacciTypeLabelsOptions*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[AnnotationsFibonacciTypeLabelsOptions]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLine(value: AnnotationsFibonacciTypeLineOptions): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setLineColors(value: js.Object): Self = this.set("lineColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColors: Self = this.set("lineColors", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: AnnotationsFibonacciTypePointsOptions*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[AnnotationsFibonacciTypePointsOptions]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    
    @scala.inline
    def setXAxis(value: Double): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    
    @scala.inline
    def setYAxis(value: Double): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
  }
}
