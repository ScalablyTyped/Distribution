package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearGaugeScale extends StObject {
  
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
  implicit class LinearGaugeScaleMutableBuilder[Self <: LinearGaugeScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: LinearGaugeScaleLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLine(value: LinearGaugeScaleLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setMajorTicks(value: LinearGaugeScaleMajorTicks): Self = StObject.set(x, "majorTicks", value.asInstanceOf[js.Any])
    
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
    def setMinorTicks(value: LinearGaugeScaleMinorTicks): Self = StObject.set(x, "minorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTicksUndefined: Self = StObject.set(x, "minorTicks", js.undefined)
    
    @scala.inline
    def setMinorUnit(value: Double): Self = StObject.set(x, "minorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorUnitUndefined: Self = StObject.set(x, "minorUnit", js.undefined)
    
    @scala.inline
    def setMirror(value: Boolean): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
    
    @scala.inline
    def setRangePlaceholderColor(value: String): Self = StObject.set(x, "rangePlaceholderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangePlaceholderColorUndefined: Self = StObject.set(x, "rangePlaceholderColor", js.undefined)
    
    @scala.inline
    def setRangeSize(value: Double): Self = StObject.set(x, "rangeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeSizeUndefined: Self = StObject.set(x, "rangeSize", js.undefined)
    
    @scala.inline
    def setRanges(value: js.Array[LinearGaugeScaleRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: LinearGaugeScaleRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
