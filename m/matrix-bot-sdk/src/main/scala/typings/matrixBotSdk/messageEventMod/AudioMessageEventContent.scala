package typings.matrixBotSdk.messageEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioMessageEventContent
  extends StObject
     with FileMessageEventContent {
  
  /**
    * Information about the file.
    */
  @JSName("info")
  var info_AudioMessageEventContent: js.UndefOr[TimedFileInfo] = js.undefined
}
object AudioMessageEventContent {
  
  inline def apply(body: String, file: EncryptedFile, msgtype: MessageType, url: String): AudioMessageEventContent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioMessageEventContent]
  }
  
  extension [Self <: AudioMessageEventContent](x: Self) {
    
    inline def setInfo(value: TimedFileInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
  }
}
