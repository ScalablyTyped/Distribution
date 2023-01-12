package typings.jssip.libRtcsessionMod

import typings.std.MediaStream
import typings.std.RTCConfiguration
import typings.std.RTCOfferOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnswerOptions
  extends StObject
     with ExtraHeaders {
  
  var mediaConstraints: js.UndefOr[MediaConstraints] = js.undefined
  
  var mediaStream: js.UndefOr[MediaStream] = js.undefined
  
  var pcConfig: js.UndefOr[RTCConfiguration] = js.undefined
  
  var rtcAnswerConstraints: js.UndefOr[RTCOfferOptions] = js.undefined
  
  var rtcConstraints: js.UndefOr[js.Object] = js.undefined
  
  var rtcOfferConstraints: js.UndefOr[RTCOfferOptions] = js.undefined
  
  var sessionTimersExpires: js.UndefOr[Double] = js.undefined
}
object AnswerOptions {
  
  inline def apply(): AnswerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnswerOptions] (val x: Self) extends AnyVal {
    
    inline def setMediaConstraints(value: MediaConstraints): Self = StObject.set(x, "mediaConstraints", value.asInstanceOf[js.Any])
    
    inline def setMediaConstraintsUndefined: Self = StObject.set(x, "mediaConstraints", js.undefined)
    
    inline def setMediaStream(value: MediaStream): Self = StObject.set(x, "mediaStream", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamUndefined: Self = StObject.set(x, "mediaStream", js.undefined)
    
    inline def setPcConfig(value: RTCConfiguration): Self = StObject.set(x, "pcConfig", value.asInstanceOf[js.Any])
    
    inline def setPcConfigUndefined: Self = StObject.set(x, "pcConfig", js.undefined)
    
    inline def setRtcAnswerConstraints(value: RTCOfferOptions): Self = StObject.set(x, "rtcAnswerConstraints", value.asInstanceOf[js.Any])
    
    inline def setRtcAnswerConstraintsUndefined: Self = StObject.set(x, "rtcAnswerConstraints", js.undefined)
    
    inline def setRtcConstraints(value: js.Object): Self = StObject.set(x, "rtcConstraints", value.asInstanceOf[js.Any])
    
    inline def setRtcConstraintsUndefined: Self = StObject.set(x, "rtcConstraints", js.undefined)
    
    inline def setRtcOfferConstraints(value: RTCOfferOptions): Self = StObject.set(x, "rtcOfferConstraints", value.asInstanceOf[js.Any])
    
    inline def setRtcOfferConstraintsUndefined: Self = StObject.set(x, "rtcOfferConstraints", js.undefined)
    
    inline def setSessionTimersExpires(value: Double): Self = StObject.set(x, "sessionTimersExpires", value.asInstanceOf[js.Any])
    
    inline def setSessionTimersExpiresUndefined: Self = StObject.set(x, "sessionTimersExpires", js.undefined)
  }
}
