package typings.jsdom.anon

import typings.jsdom.jsdomInts.`0`
import typings.jsdom.jsdomInts.`1`
import typings.jsdom.jsdomInts.`2`
import typings.jsdom.jsdomInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofWebSocket extends StObject {
  
  /* standard dom */
  val CLOSED: `3`
  
  /* standard dom */
  val CLOSING: `2`
  
  /* standard dom */
  val CONNECTING: `0`
  
  /* standard dom */
  val OPEN: `1`
}
object TypeofWebSocket {
  
  inline def apply(): TypeofWebSocket = {
    val __obj = js.Dynamic.literal(CLOSED = 3, CLOSING = 2, CONNECTING = 0, OPEN = 1)
    __obj.asInstanceOf[TypeofWebSocket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofWebSocket] (val x: Self) extends AnyVal {
    
    inline def setCLOSED(value: `3`): Self = StObject.set(x, "CLOSED", value.asInstanceOf[js.Any])
    
    inline def setCLOSING(value: `2`): Self = StObject.set(x, "CLOSING", value.asInstanceOf[js.Any])
    
    inline def setCONNECTING(value: `0`): Self = StObject.set(x, "CONNECTING", value.asInstanceOf[js.Any])
    
    inline def setOPEN(value: `1`): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
  }
}
