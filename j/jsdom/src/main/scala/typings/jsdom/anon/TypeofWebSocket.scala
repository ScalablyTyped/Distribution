package typings.jsdom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofWebSocket extends StObject {
  
  /* standard dom */
  val CLOSED: Double
  
  /* standard dom */
  val CLOSING: Double
  
  /* standard dom */
  val CONNECTING: Double
  
  /* standard dom */
  val OPEN: Double
}
object TypeofWebSocket {
  
  inline def apply(CLOSED: Double, CLOSING: Double, CONNECTING: Double, OPEN: Double): TypeofWebSocket = {
    val __obj = js.Dynamic.literal(CLOSED = CLOSED.asInstanceOf[js.Any], CLOSING = CLOSING.asInstanceOf[js.Any], CONNECTING = CONNECTING.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofWebSocket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofWebSocket] (val x: Self) extends AnyVal {
    
    inline def setCLOSED(value: Double): Self = StObject.set(x, "CLOSED", value.asInstanceOf[js.Any])
    
    inline def setCLOSING(value: Double): Self = StObject.set(x, "CLOSING", value.asInstanceOf[js.Any])
    
    inline def setCONNECTING(value: Double): Self = StObject.set(x, "CONNECTING", value.asInstanceOf[js.Any])
    
    inline def setOPEN(value: Double): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
  }
}
