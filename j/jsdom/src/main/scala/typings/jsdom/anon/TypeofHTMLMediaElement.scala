package typings.jsdom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofHTMLMediaElement extends StObject {
  
  /* standard dom */
  val HAVE_CURRENT_DATA: Double
  
  /* standard dom */
  val HAVE_ENOUGH_DATA: Double
  
  /* standard dom */
  val HAVE_FUTURE_DATA: Double
  
  /* standard dom */
  val HAVE_METADATA: Double
  
  /* standard dom */
  val HAVE_NOTHING: Double
  
  /* standard dom */
  val NETWORK_EMPTY: Double
  
  /* standard dom */
  val NETWORK_IDLE: Double
  
  /* standard dom */
  val NETWORK_LOADING: Double
  
  /* standard dom */
  val NETWORK_NO_SOURCE: Double
}
object TypeofHTMLMediaElement {
  
  inline def apply(
    HAVE_CURRENT_DATA: Double,
    HAVE_ENOUGH_DATA: Double,
    HAVE_FUTURE_DATA: Double,
    HAVE_METADATA: Double,
    HAVE_NOTHING: Double,
    NETWORK_EMPTY: Double,
    NETWORK_IDLE: Double,
    NETWORK_LOADING: Double,
    NETWORK_NO_SOURCE: Double
  ): TypeofHTMLMediaElement = {
    val __obj = js.Dynamic.literal(HAVE_CURRENT_DATA = HAVE_CURRENT_DATA.asInstanceOf[js.Any], HAVE_ENOUGH_DATA = HAVE_ENOUGH_DATA.asInstanceOf[js.Any], HAVE_FUTURE_DATA = HAVE_FUTURE_DATA.asInstanceOf[js.Any], HAVE_METADATA = HAVE_METADATA.asInstanceOf[js.Any], HAVE_NOTHING = HAVE_NOTHING.asInstanceOf[js.Any], NETWORK_EMPTY = NETWORK_EMPTY.asInstanceOf[js.Any], NETWORK_IDLE = NETWORK_IDLE.asInstanceOf[js.Any], NETWORK_LOADING = NETWORK_LOADING.asInstanceOf[js.Any], NETWORK_NO_SOURCE = NETWORK_NO_SOURCE.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofHTMLMediaElement]
  }
  
  extension [Self <: TypeofHTMLMediaElement](x: Self) {
    
    inline def setHAVE_CURRENT_DATA(value: Double): Self = StObject.set(x, "HAVE_CURRENT_DATA", value.asInstanceOf[js.Any])
    
    inline def setHAVE_ENOUGH_DATA(value: Double): Self = StObject.set(x, "HAVE_ENOUGH_DATA", value.asInstanceOf[js.Any])
    
    inline def setHAVE_FUTURE_DATA(value: Double): Self = StObject.set(x, "HAVE_FUTURE_DATA", value.asInstanceOf[js.Any])
    
    inline def setHAVE_METADATA(value: Double): Self = StObject.set(x, "HAVE_METADATA", value.asInstanceOf[js.Any])
    
    inline def setHAVE_NOTHING(value: Double): Self = StObject.set(x, "HAVE_NOTHING", value.asInstanceOf[js.Any])
    
    inline def setNETWORK_EMPTY(value: Double): Self = StObject.set(x, "NETWORK_EMPTY", value.asInstanceOf[js.Any])
    
    inline def setNETWORK_IDLE(value: Double): Self = StObject.set(x, "NETWORK_IDLE", value.asInstanceOf[js.Any])
    
    inline def setNETWORK_LOADING(value: Double): Self = StObject.set(x, "NETWORK_LOADING", value.asInstanceOf[js.Any])
    
    inline def setNETWORK_NO_SOURCE(value: Double): Self = StObject.set(x, "NETWORK_NO_SOURCE", value.asInstanceOf[js.Any])
  }
}
