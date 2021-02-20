package typings.jssip.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.MediaStream
import typings.std.MediaStreamConstraints
import typings.std.RTCAnswerOptions
import typings.std.RTCConfiguration
import typings.std.RTCOfferOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgentCallOptions extends StObject {
  
  var anonymous: js.UndefOr[Boolean] = js.native
  
  var eventHandlers: js.UndefOr[StringDictionary[js.Function1[/* data */ js.Any, Unit]]] = js.native
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  
  var mediaConstraints: js.UndefOr[MediaStreamConstraints] = js.native
  
  var mediaStream: js.UndefOr[MediaStream] = js.native
  
  var pcConfig: js.UndefOr[RTCConfiguration] = js.native
  
  var rtcAnswerConstraints: js.UndefOr[RTCAnswerOptions] = js.native
  
  var rtcConstraints: js.UndefOr[js.Any] = js.native
  
  var rtcOfferConstraints: js.UndefOr[RTCOfferOptions] = js.native
  
  var sessionTimersExpires: js.UndefOr[Double] = js.native
}
object UserAgentCallOptions {
  
  @scala.inline
  def apply(): UserAgentCallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgentCallOptions]
  }
  
  @scala.inline
  implicit class UserAgentCallOptionsMutableBuilder[Self <: UserAgentCallOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    @scala.inline
    def setEventHandlers(value: StringDictionary[js.Function1[/* data */ js.Any, Unit]]): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventHandlersUndefined: Self = StObject.set(x, "eventHandlers", js.undefined)
    
    @scala.inline
    def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
    
    @scala.inline
    def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
    
    @scala.inline
    def setMediaConstraints(value: MediaStreamConstraints): Self = StObject.set(x, "mediaConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaConstraintsUndefined: Self = StObject.set(x, "mediaConstraints", js.undefined)
    
    @scala.inline
    def setMediaStream(value: MediaStream): Self = StObject.set(x, "mediaStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaStreamUndefined: Self = StObject.set(x, "mediaStream", js.undefined)
    
    @scala.inline
    def setPcConfig(value: RTCConfiguration): Self = StObject.set(x, "pcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcConfigUndefined: Self = StObject.set(x, "pcConfig", js.undefined)
    
    @scala.inline
    def setRtcAnswerConstraints(value: RTCAnswerOptions): Self = StObject.set(x, "rtcAnswerConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtcAnswerConstraintsUndefined: Self = StObject.set(x, "rtcAnswerConstraints", js.undefined)
    
    @scala.inline
    def setRtcConstraints(value: js.Any): Self = StObject.set(x, "rtcConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtcConstraintsUndefined: Self = StObject.set(x, "rtcConstraints", js.undefined)
    
    @scala.inline
    def setRtcOfferConstraints(value: RTCOfferOptions): Self = StObject.set(x, "rtcOfferConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtcOfferConstraintsUndefined: Self = StObject.set(x, "rtcOfferConstraints", js.undefined)
    
    @scala.inline
    def setSessionTimersExpires(value: Double): Self = StObject.set(x, "sessionTimersExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTimersExpiresUndefined: Self = StObject.set(x, "sessionTimersExpires", js.undefined)
  }
}
