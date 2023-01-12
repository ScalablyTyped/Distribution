package typings.matrixBotSdk.libModelsEventsMessageEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoMessageEventContent
  extends StObject
     with FileMessageEventContent {
  
  /**
    * Information about the file.
    */
  @JSName("info")
  var info_VideoMessageEventContent: js.UndefOr[VideoFileInfo] = js.undefined
}
object VideoMessageEventContent {
  
  inline def apply(body: String, file: EncryptedFile, msgtype: MessageType, url: String): VideoMessageEventContent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoMessageEventContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoMessageEventContent] (val x: Self) extends AnyVal {
    
    inline def setInfo(value: VideoFileInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
  }
}
