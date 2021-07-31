package typings.jssip.mod

import typings.std.MediaStream
import typings.std.MediaStreamConstraints
import typings.std.RTCAnswerOptions
import typings.std.RTCConfiguration
import typings.std.RTCOfferOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionAnswerOptions extends StObject {
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  var mediaConstraints: js.UndefOr[MediaStreamConstraints] = js.undefined
  
  var mediaStream: js.UndefOr[MediaStream] = js.undefined
  
  var pcConfig: js.UndefOr[RTCConfiguration] = js.undefined
  
  var rtcAnswerConstraints: js.UndefOr[RTCAnswerOptions] = js.undefined
  
  var rtcConstraints: js.UndefOr[js.Any] = js.undefined
  
  var rtcOfferConstraints: js.UndefOr[RTCOfferOptions] = js.undefined
  
  var sessionTimersExpires: js.UndefOr[Double] = js.undefined
}
object SessionAnswerOptions {
  
  @scala.inline
  def apply(): SessionAnswerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionAnswerOptions]
  }
  
  @scala.inline
  implicit class SessionAnswerOptionsMutableBuilder[Self <: SessionAnswerOptions] (val x: Self) extends AnyVal {
    
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
