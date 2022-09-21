package typings.jssip.rtcsessionMod

import typings.std.RTCOfferOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenegotiateOptions
  extends StObject
     with HoldOptions {
  
  var rtcOfferConstraints: js.UndefOr[RTCOfferOptions] = js.undefined
}
object RenegotiateOptions {
  
  inline def apply(): RenegotiateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenegotiateOptions]
  }
  
  extension [Self <: RenegotiateOptions](x: Self) {
    
    inline def setRtcOfferConstraints(value: RTCOfferOptions): Self = StObject.set(x, "rtcOfferConstraints", value.asInstanceOf[js.Any])
    
    inline def setRtcOfferConstraintsUndefined: Self = StObject.set(x, "rtcOfferConstraints", js.undefined)
  }
}
