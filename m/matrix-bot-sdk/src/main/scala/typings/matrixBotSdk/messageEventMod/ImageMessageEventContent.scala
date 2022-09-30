package typings.matrixBotSdk.messageEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageMessageEventContent
  extends StObject
     with FileMessageEventContent {
  
  /**
    * Information about the file.
    */
  @JSName("info")
  var info_ImageMessageEventContent: js.UndefOr[DimensionalFileInfo] = js.undefined
}
object ImageMessageEventContent {
  
  inline def apply(body: String, file: EncryptedFile, msgtype: MessageType, url: String): ImageMessageEventContent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMessageEventContent]
  }
  
  extension [Self <: ImageMessageEventContent](x: Self) {
    
    inline def setInfo(value: DimensionalFileInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
  }
}
