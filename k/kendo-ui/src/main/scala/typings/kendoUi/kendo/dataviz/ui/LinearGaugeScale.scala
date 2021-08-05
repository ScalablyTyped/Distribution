package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearGaugeScale extends StObject {
  
  var labels: js.UndefOr[LinearGaugeScaleLabels] = js.undefined
  
  var line: js.UndefOr[LinearGaugeScaleLine] = js.undefined
  
  var majorTicks: js.UndefOr[LinearGaugeScaleMajorTicks] = js.undefined
  
  var majorUnit: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var minorTicks: js.UndefOr[LinearGaugeScaleMinorTicks] = js.undefined
  
  var minorUnit: js.UndefOr[Double] = js.undefined
  
  var mirror: js.UndefOr[Boolean] = js.undefined
  
  var rangePlaceholderColor: js.UndefOr[String] = js.undefined
  
  var rangeSize: js.UndefOr[Double] = js.undefined
  
  var ranges: js.UndefOr[js.Array[LinearGaugeScaleRange]] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var vertical: js.UndefOr[Boolean] = js.undefined
}
object LinearGaugeScale {
  
  inline def apply(): LinearGaugeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGaugeScale]
  }
  
  extension [Self <: LinearGaugeScale](x: Self) {
    
    inline def setLabels(value: LinearGaugeScaleLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLine(value: LinearGaugeScaleLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setMajorTicks(value: LinearGaugeScaleMajorTicks): Self = StObject.set(x, "majorTicks", value.asInstanceOf[js.Any])
    
    inline def setMajorTicksUndefined: Self = StObject.set(x, "majorTicks", js.undefined)
    
    inline def setMajorUnit(value: Double): Self = StObject.set(x, "majorUnit", value.asInstanceOf[js.Any])
    
    inline def setMajorUnitUndefined: Self = StObject.set(x, "majorUnit", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinorTicks(value: LinearGaugeScaleMinorTicks): Self = StObject.set(x, "minorTicks", value.asInstanceOf[js.Any])
    
    inline def setMinorTicksUndefined: Self = StObject.set(x, "minorTicks", js.undefined)
    
    inline def setMinorUnit(value: Double): Self = StObject.set(x, "minorUnit", value.asInstanceOf[js.Any])
    
    inline def setMinorUnitUndefined: Self = StObject.set(x, "minorUnit", js.undefined)
    
    inline def setMirror(value: Boolean): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
    
    inline def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
    
    inline def setRangePlaceholderColor(value: String): Self = StObject.set(x, "rangePlaceholderColor", value.asInstanceOf[js.Any])
    
    inline def setRangePlaceholderColorUndefined: Self = StObject.set(x, "rangePlaceholderColor", js.undefined)
    
    inline def setRangeSize(value: Double): Self = StObject.set(x, "rangeSize", value.asInstanceOf[js.Any])
    
    inline def setRangeSizeUndefined: Self = StObject.set(x, "rangeSize", js.undefined)
    
    inline def setRanges(value: js.Array[LinearGaugeScaleRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: LinearGaugeScaleRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
