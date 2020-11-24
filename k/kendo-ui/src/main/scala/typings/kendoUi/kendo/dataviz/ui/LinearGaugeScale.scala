package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearGaugeScale extends js.Object {
  
  var labels: js.UndefOr[LinearGaugeScaleLabels] = js.native
  
  var line: js.UndefOr[LinearGaugeScaleLine] = js.native
  
  var majorTicks: js.UndefOr[LinearGaugeScaleMajorTicks] = js.native
  
  var majorUnit: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var minorTicks: js.UndefOr[LinearGaugeScaleMinorTicks] = js.native
  
  var minorUnit: js.UndefOr[Double] = js.native
  
  var mirror: js.UndefOr[Boolean] = js.native
  
  var rangePlaceholderColor: js.UndefOr[String] = js.native
  
  var rangeSize: js.UndefOr[Double] = js.native
  
  var ranges: js.UndefOr[js.Array[LinearGaugeScaleRange]] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var vertical: js.UndefOr[Boolean] = js.native
}
object LinearGaugeScale {
  
  @scala.inline
  def apply(): LinearGaugeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGaugeScale]
  }
  
  @scala.inline
  implicit class LinearGaugeScaleOps[Self <: LinearGaugeScale] (val x: Self) extends AnyVal {
    
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
    def setLabels(value: LinearGaugeScaleLabels): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLine(value: LinearGaugeScaleLine): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setMajorTicks(value: LinearGaugeScaleMajorTicks): Self = this.set("majorTicks", value.asInstanceOf[js.Any])
    
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
    def setMinorTicks(value: LinearGaugeScaleMinorTicks): Self = this.set("minorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTicks: Self = this.set("minorTicks", js.undefined)
    
    @scala.inline
    def setMinorUnit(value: Double): Self = this.set("minorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorUnit: Self = this.set("minorUnit", js.undefined)
    
    @scala.inline
    def setMirror(value: Boolean): Self = this.set("mirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMirror: Self = this.set("mirror", js.undefined)
    
    @scala.inline
    def setRangePlaceholderColor(value: String): Self = this.set("rangePlaceholderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangePlaceholderColor: Self = this.set("rangePlaceholderColor", js.undefined)
    
    @scala.inline
    def setRangeSize(value: Double): Self = this.set("rangeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeSize: Self = this.set("rangeSize", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: LinearGaugeScaleRange*): Self = this.set("ranges", js.Array(value :_*))
    
    @scala.inline
    def setRanges(value: js.Array[LinearGaugeScaleRange]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
