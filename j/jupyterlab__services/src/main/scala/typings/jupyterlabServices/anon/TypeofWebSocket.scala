package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofWebSocket extends StObject {
  
  val CLOSED: Double
  
  val CLOSING: Double
  
  val CONNECTING: Double
  
  val OPEN: Double
}
object TypeofWebSocket {
  
  inline def apply(CLOSED: Double, CLOSING: Double, CONNECTING: Double, OPEN: Double): TypeofWebSocket = {
    val __obj = js.Dynamic.literal(CLOSED = CLOSED.asInstanceOf[js.Any], CLOSING = CLOSING.asInstanceOf[js.Any], CONNECTING = CONNECTING.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofWebSocket]
  }
  
  extension [Self <: TypeofWebSocket](x: Self) {
    
    inline def setCLOSED(value: Double): Self = StObject.set(x, "CLOSED", value.asInstanceOf[js.Any])
    
    inline def setCLOSING(value: Double): Self = StObject.set(x, "CLOSING", value.asInstanceOf[js.Any])
    
    inline def setCONNECTING(value: Double): Self = StObject.set(x, "CONNECTING", value.asInstanceOf[js.Any])
    
    inline def setOPEN(value: Double): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
  }
}
