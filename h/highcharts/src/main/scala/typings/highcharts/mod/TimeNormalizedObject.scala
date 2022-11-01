package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeNormalizedObject extends StObject {
  
  /**
    * The count.
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * The interval in axis values (ms).
    */
  var unitRange: Double
}
object TimeNormalizedObject {
  
  inline def apply(unitRange: Double): TimeNormalizedObject = {
    val __obj = js.Dynamic.literal(unitRange = unitRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeNormalizedObject]
  }
  
  extension [Self <: TimeNormalizedObject](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setUnitRange(value: Double): Self = StObject.set(x, "unitRange", value.asInstanceOf[js.Any])
  }
}
