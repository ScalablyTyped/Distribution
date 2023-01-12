package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * (Highstock) Highcharts Stock only.
  */
trait DataGroupingInfoObject extends StObject {
  
  var length: Double
  
  var options: js.UndefOr[SeriesOptionsType] = js.undefined
  
  var start: Double
}
object DataGroupingInfoObject {
  
  inline def apply(length: Double, start: Double): DataGroupingInfoObject = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataGroupingInfoObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataGroupingInfoObject] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: SeriesOptionsType): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
