package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RationalTimestamp extends StObject {
  
  var baseTime: Double
  
  var timescale: Double
}
object RationalTimestamp {
  
  inline def apply(baseTime: Double, timescale: Double): RationalTimestamp = {
    val __obj = js.Dynamic.literal(baseTime = baseTime.asInstanceOf[js.Any], timescale = timescale.asInstanceOf[js.Any])
    __obj.asInstanceOf[RationalTimestamp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RationalTimestamp] (val x: Self) extends AnyVal {
    
    inline def setBaseTime(value: Double): Self = StObject.set(x, "baseTime", value.asInstanceOf[js.Any])
    
    inline def setTimescale(value: Double): Self = StObject.set(x, "timescale", value.asInstanceOf[js.Any])
  }
}
