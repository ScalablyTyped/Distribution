package typings.jssip.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.MediaStream
import typings.std.MediaStreamConstraints
import typings.std.RTCAnswerOptions
import typings.std.RTCConfiguration
import typings.std.RTCOfferOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgentCallOptions extends StObject {
  
  var anonymous: js.UndefOr[Boolean] = js.undefined
  
  var eventHandlers: js.UndefOr[StringDictionary[js.Function1[/* data */ js.Any, Unit]]] = js.undefined
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  var mediaConstraints: js.UndefOr[MediaStreamConstraints] = js.undefined
  
  var mediaStream: js.UndefOr[MediaStream] = js.undefined
  
  var pcConfig: js.UndefOr[RTCConfiguration] = js.undefined
  
  var rtcAnswerConstraints: js.UndefOr[RTCAnswerOptions] = js.undefined
  
  var rtcConstraints: js.UndefOr[js.Any] = js.undefined
  
  var rtcOfferConstraints: js.UndefOr[RTCOfferOptions] = js.undefined
  
  var sessionTimersExpires: js.UndefOr[Double] = js.undefined
}
object UserAgentCallOptions {
  
  inline def apply(): UserAgentCallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgentCallOptions]
  }
  
  extension [Self <: UserAgentCallOptions](x: Self) {
    
    inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    inline def setEventHandlers(value: StringDictionary[js.Function1[/* data */ js.Any, Unit]]): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
    
    inline def setEventHandlersUndefined: Self = StObject.set(x, "eventHandlers", js.undefined)
    
    inline def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
    
    inline def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
    
    inline def setMediaConstraints(value: MediaStreamConstraints): Self = StObject.set(x, "mediaConstraints", value.asInstanceOf[js.Any])
    
    inline def setMediaConstraintsUndefined: Self = StObject.set(x, "mediaConstraints", js.undefined)
    
    inline def setMediaStream(value: MediaStream): Self = StObject.set(x, "mediaStream", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamUndefined: Self = StObject.set(x, "mediaStream", js.undefined)
    
    inline def setPcConfig(value: RTCConfiguration): Self = StObject.set(x, "pcConfig", value.asInstanceOf[js.Any])
    
    inline def setPcConfigUndefined: Self = StObject.set(x, "pcConfig", js.undefined)
    
    inline def setRtcAnswerConstraints(value: RTCAnswerOptions): Self = StObject.set(x, "rtcAnswerConstraints", value.asInstanceOf[js.Any])
    
    inline def setRtcAnswerConstraintsUndefined: Self = StObject.set(x, "rtcAnswerConstraints", js.undefined)
    
    inline def setRtcConstraints(value: js.Any): Self = StObject.set(x, "rtcConstraints", value.asInstanceOf[js.Any])
    
    inline def setRtcConstraintsUndefined: Self = StObject.set(x, "rtcConstraints", js.undefined)
    
    inline def setRtcOfferConstraints(value: RTCOfferOptions): Self = StObject.set(x, "rtcOfferConstraints", value.asInstanceOf[js.Any])
    
    inline def setRtcOfferConstraintsUndefined: Self = StObject.set(x, "rtcOfferConstraints", js.undefined)
    
    inline def setSessionTimersExpires(value: Double): Self = StObject.set(x, "sessionTimersExpires", value.asInstanceOf[js.Any])
    
    inline def setSessionTimersExpiresUndefined: Self = StObject.set(x, "sessionTimersExpires", js.undefined)
  }
}
