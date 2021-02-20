package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipFormatterContextObject extends StObject {
  
  var color: ColorString | GradientColorObject | PatternObject = js.native
  
  var colorIndex: js.UndefOr[Double] = js.native
  
  var key: Double = js.native
  
  var percentage: js.UndefOr[Double] = js.native
  
  var point: Point = js.native
  
  var points: js.UndefOr[js.Array[TooltipFormatterContextObject]] = js.native
  
  var series: Series = js.native
  
  var total: js.UndefOr[Double] = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object TooltipFormatterContextObject {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class TooltipFormatterContextObjectMutableBuilder[Self <: TooltipFormatterContextObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndex(value: Double): Self = StObject.set(x, "colorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndexUndefined: Self = StObject.set(x, "colorIndex", js.undefined)
    
    @scala.inline
    def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    
    @scala.inline
    def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: js.Array[TooltipFormatterContextObject]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: TooltipFormatterContextObject*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: Series): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
