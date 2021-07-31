package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeNormalizedObject extends StObject {
  
  /**
    * The count.
    */
  var count: Double
  
  /**
    * The interval in axis values (ms).
    */
  var unitRange: Double
}
object TimeNormalizedObject {
  
  @scala.inline
  def apply(count: Double, unitRange: Double): TimeNormalizedObject = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], unitRange = unitRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeNormalizedObject]
  }
  
  @scala.inline
  implicit class TimeNormalizedObjectMutableBuilder[Self <: TimeNormalizedObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitRange(value: Double): Self = StObject.set(x, "unitRange", value.asInstanceOf[js.Any])
  }
}
