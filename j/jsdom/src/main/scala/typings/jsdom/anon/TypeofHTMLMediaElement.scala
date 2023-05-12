package typings.jsdom.anon

import typings.jsdom.jsdomInts.`0`
import typings.jsdom.jsdomInts.`1`
import typings.jsdom.jsdomInts.`2`
import typings.jsdom.jsdomInts.`3`
import typings.jsdom.jsdomInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofHTMLMediaElement extends StObject {
  
  /* standard dom */
  val HAVE_CURRENT_DATA: `2`
  
  /* standard dom */
  val HAVE_ENOUGH_DATA: `4`
  
  /* standard dom */
  val HAVE_FUTURE_DATA: `3`
  
  /* standard dom */
  val HAVE_METADATA: `1`
  
  /* standard dom */
  val HAVE_NOTHING: `0`
  
  /* standard dom */
  val NETWORK_EMPTY: `0`
  
  /* standard dom */
  val NETWORK_IDLE: `1`
  
  /* standard dom */
  val NETWORK_LOADING: `2`
  
  /* standard dom */
  val NETWORK_NO_SOURCE: `3`
}
object TypeofHTMLMediaElement {
  
  inline def apply(): TypeofHTMLMediaElement = {
    val __obj = js.Dynamic.literal(HAVE_CURRENT_DATA = 2, HAVE_ENOUGH_DATA = 4, HAVE_FUTURE_DATA = 3, HAVE_METADATA = 1, HAVE_NOTHING = 0, NETWORK_EMPTY = 0, NETWORK_IDLE = 1, NETWORK_LOADING = 2, NETWORK_NO_SOURCE = 3)
    __obj.asInstanceOf[TypeofHTMLMediaElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofHTMLMediaElement] (val x: Self) extends AnyVal {
    
    inline def setHAVE_CURRENT_DATA(value: `2`): Self = StObject.set(x, "HAVE_CURRENT_DATA", value.asInstanceOf[js.Any])
    
    inline def setHAVE_ENOUGH_DATA(value: `4`): Self = StObject.set(x, "HAVE_ENOUGH_DATA", value.asInstanceOf[js.Any])
    
    inline def setHAVE_FUTURE_DATA(value: `3`): Self = StObject.set(x, "HAVE_FUTURE_DATA", value.asInstanceOf[js.Any])
    
    inline def setHAVE_METADATA(value: `1`): Self = StObject.set(x, "HAVE_METADATA", value.asInstanceOf[js.Any])
    
    inline def setHAVE_NOTHING(value: `0`): Self = StObject.set(x, "HAVE_NOTHING", value.asInstanceOf[js.Any])
    
    inline def setNETWORK_EMPTY(value: `0`): Self = StObject.set(x, "NETWORK_EMPTY", value.asInstanceOf[js.Any])
    
    inline def setNETWORK_IDLE(value: `1`): Self = StObject.set(x, "NETWORK_IDLE", value.asInstanceOf[js.Any])
    
    inline def setNETWORK_LOADING(value: `2`): Self = StObject.set(x, "NETWORK_LOADING", value.asInstanceOf[js.Any])
    
    inline def setNETWORK_NO_SOURCE(value: `3`): Self = StObject.set(x, "NETWORK_NO_SOURCE", value.asInstanceOf[js.Any])
  }
}
