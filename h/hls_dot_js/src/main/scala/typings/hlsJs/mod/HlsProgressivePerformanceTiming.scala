package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsProgressivePerformanceTiming
  extends StObject
     with HlsPerformanceTiming {
  
  var first: Double
}
object HlsProgressivePerformanceTiming {
  
  inline def apply(end: Double, first: Double, start: Double): HlsProgressivePerformanceTiming = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsProgressivePerformanceTiming]
  }
  
  extension [Self <: HlsProgressivePerformanceTiming](x: Self) {
    
    inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
  }
}
