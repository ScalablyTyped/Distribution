package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeObject extends StObject {
  
  /**
    * Maximum number of the range.
    */
  var max: Double = js.native
  
  /**
    * Minimum number of the range.
    */
  var min: Double = js.native
}
object RangeObject {
  
  @scala.inline
  def apply(max: Double, min: Double): RangeObject = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeObject]
  }
  
  @scala.inline
  implicit class RangeObjectMutableBuilder[Self <: RangeObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
