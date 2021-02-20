package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialGaugeScale extends StObject {
  
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
  implicit class RadialGaugeScaleMutableBuilder[Self <: RadialGaugeScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    @scala.inline
    def setLabels(value: RadialGaugeScaleLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMajorTicks(value: RadialGaugeScaleMajorTicks): Self = StObject.set(x, "majorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorTicksUndefined: Self = StObject.set(x, "majorTicks", js.undefined)
    
    @scala.inline
    def setMajorUnit(value: Double): Self = StObject.set(x, "majorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorUnitUndefined: Self = StObject.set(x, "majorUnit", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMinorTicks(value: RadialGaugeScaleMinorTicks): Self = StObject.set(x, "minorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTicksUndefined: Self = StObject.set(x, "minorTicks", js.undefined)
    
    @scala.inline
    def setMinorUnit(value: Double): Self = StObject.set(x, "minorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorUnitUndefined: Self = StObject.set(x, "minorUnit", js.undefined)
    
    @scala.inline
    def setRangeDistance(value: Double): Self = StObject.set(x, "rangeDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeDistanceUndefined: Self = StObject.set(x, "rangeDistance", js.undefined)
    
    @scala.inline
    def setRangePlaceholderColor(value: String): Self = StObject.set(x, "rangePlaceholderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangePlaceholderColorUndefined: Self = StObject.set(x, "rangePlaceholderColor", js.undefined)
    
    @scala.inline
    def setRangeSize(value: Double): Self = StObject.set(x, "rangeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeSizeUndefined: Self = StObject.set(x, "rangeSize", js.undefined)
    
    @scala.inline
    def setRanges(value: js.Array[RadialGaugeScaleRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: RadialGaugeScaleRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
  }
}
