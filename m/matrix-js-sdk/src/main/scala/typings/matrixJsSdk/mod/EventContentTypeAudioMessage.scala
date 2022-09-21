package typings.matrixJsSdk.mod

import typings.matrixJsSdk.anon.Duration
import typings.matrixJsSdk.matrixJsSdkStrings.mDotaudio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventContentTypeAudioMessage
  extends StObject
     with EventContentTypeMessage {
  
  var info: Duration
  
  @JSName("msgtype")
  var msgtype_EventContentTypeAudioMessage: mDotaudio
  
  var url: String
}
object EventContentTypeAudioMessage {
  
  inline def apply(body: String, info: Duration, url: String): EventContentTypeAudioMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], msgtype = "m.audio", url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventContentTypeAudioMessage]
  }
  
  extension [Self <: EventContentTypeAudioMessage](x: Self) {
    
    inline def setInfo(value: Duration): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setMsgtype(value: mDotaudio): Self = StObject.set(x, "msgtype", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
