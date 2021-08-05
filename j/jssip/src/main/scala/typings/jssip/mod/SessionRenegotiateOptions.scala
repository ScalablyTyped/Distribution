package typings.jssip.mod

import typings.std.RTCOfferOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionRenegotiateOptions extends StObject {
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  var rtcOfferConstraints: js.UndefOr[RTCOfferOptions] = js.undefined
  
  var useUpdate: js.UndefOr[Boolean] = js.undefined
}
object SessionRenegotiateOptions {
  
  inline def apply(): SessionRenegotiateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionRenegotiateOptions]
  }
  
  extension [Self <: SessionRenegotiateOptions](x: Self) {
    
    inline def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
    
    inline def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
    
    inline def setRtcOfferConstraints(value: RTCOfferOptions): Self = StObject.set(x, "rtcOfferConstraints", value.asInstanceOf[js.Any])
    
    inline def setRtcOfferConstraintsUndefined: Self = StObject.set(x, "rtcOfferConstraints", js.undefined)
    
    inline def setUseUpdate(value: Boolean): Self = StObject.set(x, "useUpdate", value.asInstanceOf[js.Any])
    
    inline def setUseUpdateUndefined: Self = StObject.set(x, "useUpdate", js.undefined)
  }
}
