package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsChunkPerformanceTiming
  extends StObject
     with HlsPerformanceTiming {
  
  var executeEnd: Double
  
  var executeStart: Double
}
object HlsChunkPerformanceTiming {
  
  inline def apply(end: Double, executeEnd: Double, executeStart: Double, start: Double): HlsChunkPerformanceTiming = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], executeEnd = executeEnd.asInstanceOf[js.Any], executeStart = executeStart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsChunkPerformanceTiming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HlsChunkPerformanceTiming] (val x: Self) extends AnyVal {
    
    inline def setExecuteEnd(value: Double): Self = StObject.set(x, "executeEnd", value.asInstanceOf[js.Any])
    
    inline def setExecuteStart(value: Double): Self = StObject.set(x, "executeStart", value.asInstanceOf[js.Any])
  }
}
