package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialGaugeScale extends js.Object {
  
  var endAngle: js.UndefOr[Double] = js.native
  
  var labels: js.UndefOr[RadialGaugeScaleLabels] = js.native
  
  var majorTicks: js.UndefOr[RadialGaugeScaleMajorTicks] = js.native
  
  var majorUnit: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var minorTicks: js.UndefOr[RadialGaugeScaleMinorTicks] = js.native
  
  var minorUnit: js.UndefOr[Double] = js.native
  
  var rangeDistance: js.UndefOr[Double] = js.native
  
  var rangePlaceholderColor: js.UndefOr[String] = js.native
  
  var rangeSize: js.UndefOr[Double] = js.native
  
  var ranges: js.UndefOr[js.Array[RadialGaugeScaleRange]] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var startAngle: js.UndefOr[Double] = js.native
}
object RadialGaugeScale {
  
  @scala.inline
  def apply(): RadialGaugeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialGaugeScale]
  }
  
  @scala.inline
  implicit class RadialGaugeScaleOps[Self <: RadialGaugeScale] (val x: Self) extends AnyVal {
    
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
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    
    @scala.inline
    def setLabels(value: RadialGaugeScaleLabels): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMajorTicks(value: RadialGaugeScaleMajorTicks): Self = this.set("majorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorTicks: Self = this.set("majorTicks", js.undefined)
    
    @scala.inline
    def setMajorUnit(value: Double): Self = this.set("majorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorUnit: Self = this.set("majorUnit", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinorTicks(value: RadialGaugeScaleMinorTicks): Self = this.set("minorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTicks: Self = this.set("minorTicks", js.undefined)
    
    @scala.inline
    def setMinorUnit(value: Double): Self = this.set("minorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorUnit: Self = this.set("minorUnit", js.undefined)
    
    @scala.inline
    def setRangeDistance(value: Double): Self = this.set("rangeDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeDistance: Self = this.set("rangeDistance", js.undefined)
    
    @scala.inline
    def setRangePlaceholderColor(value: String): Self = this.set("rangePlaceholderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangePlaceholderColor: Self = this.set("rangePlaceholderColor", js.undefined)
    
    @scala.inline
    def setRangeSize(value: Double): Self = this.set("rangeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeSize: Self = this.set("rangeSize", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: RadialGaugeScaleRange*): Self = this.set("ranges", js.Array(value :_*))
    
    @scala.inline
    def setRanges(value: js.Array[RadialGaugeScaleRange]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
  }
}
