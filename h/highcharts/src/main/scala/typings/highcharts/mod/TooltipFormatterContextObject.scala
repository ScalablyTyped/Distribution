package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipFormatterContextObject extends StObject {
  
  var color: ColorString | GradientColorObject | PatternObject
  
  var colorIndex: js.UndefOr[Double] = js.undefined
  
  var key: Double
  
  var percentage: js.UndefOr[Double] = js.undefined
  
  var point: Point
  
  var points: js.UndefOr[js.Array[TooltipFormatterContextObject]] = js.undefined
  
  var series: Series
  
  var total: js.UndefOr[Double] = js.undefined
  
  var x: Double
  
  var y: Double
}
object TooltipFormatterContextObject {
  
  inline def apply(
    color: ColorString | GradientColorObject | PatternObject,
    key: Double,
    point: Point,
    series: Series,
    x: Double,
    y: Double
  ): TooltipFormatterContextObject = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipFormatterContextObject]
  }
  
  extension [Self <: TooltipFormatterContextObject](x: Self) {
    
    inline def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorIndex(value: Double): Self = StObject.set(x, "colorIndex", value.asInstanceOf[js.Any])
    
    inline def setColorIndexUndefined: Self = StObject.set(x, "colorIndex", js.undefined)
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    
    inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: js.Array[TooltipFormatterContextObject]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: TooltipFormatterContextObject*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    inline def setSeries(value: Series): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
