package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipFormatterContextObject
  extends StObject
     with PointLabelObject {
  
  /**
    * Array of points in shared tooltips.
    */
  var points: js.UndefOr[js.Array[TooltipFormatterContextObject]] = js.undefined
}
object TooltipFormatterContextObject {
  
  inline def apply(colorIndex: Double, percentage: Double, point: Point, series: Series): TooltipFormatterContextObject = {
    val __obj = js.Dynamic.literal(colorIndex = colorIndex.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipFormatterContextObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipFormatterContextObject] (val x: Self) extends AnyVal {
    
    inline def setPoints(value: js.Array[TooltipFormatterContextObject]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: TooltipFormatterContextObject*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
