package typings.jsdom.anon

import typings.jsdom.jsdomInts.`0`
import typings.jsdom.jsdomInts.`1`
import typings.jsdom.jsdomInts.`2`
import typings.jsdom.jsdomInts.`3`
import typings.jsdom.jsdomInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofXMLHttpRequest extends StObject {
  
  /* standard dom */
  val DONE: `4`
  
  /* standard dom */
  val HEADERS_RECEIVED: `2`
  
  /* standard dom */
  val LOADING: `3`
  
  /* standard dom */
  val OPENED: `1`
  
  /* standard dom */
  val UNSENT: `0`
}
object TypeofXMLHttpRequest {
  
  inline def apply(): TypeofXMLHttpRequest = {
    val __obj = js.Dynamic.literal(DONE = 4, HEADERS_RECEIVED = 2, LOADING = 3, OPENED = 1, UNSENT = 0)
    __obj.asInstanceOf[TypeofXMLHttpRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofXMLHttpRequest] (val x: Self) extends AnyVal {
    
    inline def setDONE(value: `4`): Self = StObject.set(x, "DONE", value.asInstanceOf[js.Any])
    
    inline def setHEADERS_RECEIVED(value: `2`): Self = StObject.set(x, "HEADERS_RECEIVED", value.asInstanceOf[js.Any])
    
    inline def setLOADING(value: `3`): Self = StObject.set(x, "LOADING", value.asInstanceOf[js.Any])
    
    inline def setOPENED(value: `1`): Self = StObject.set(x, "OPENED", value.asInstanceOf[js.Any])
    
    inline def setUNSENT(value: `0`): Self = StObject.set(x, "UNSENT", value.asInstanceOf[js.Any])
  }
}
