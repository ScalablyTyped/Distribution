package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofWebSocket extends StObject {
  
  val CLOSED: Double = js.native
  
  val CLOSING: Double = js.native
  
  val CONNECTING: Double = js.native
  
  val OPEN: Double = js.native
}
object TypeofWebSocket {
  
  @scala.inline
  def apply(CLOSED: Double, CLOSING: Double, CONNECTING: Double, OPEN: Double): TypeofWebSocket = {
    val __obj = js.Dynamic.literal(CLOSED = CLOSED.asInstanceOf[js.Any], CLOSING = CLOSING.asInstanceOf[js.Any], CONNECTING = CONNECTING.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofWebSocket]
  }
  
  @scala.inline
  implicit class TypeofWebSocketMutableBuilder[Self <: TypeofWebSocket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCLOSED(value: Double): Self = StObject.set(x, "CLOSED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLOSING(value: Double): Self = StObject.set(x, "CLOSING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCONNECTING(value: Double): Self = StObject.set(x, "CONNECTING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOPEN(value: Double): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
  }
}
