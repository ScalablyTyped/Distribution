package typings.matrixBotSdk.libModelsEventsMessageEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileMessageEventContent
  extends StObject
     with MessageEventContent {
  
  /**
    * The encrypted file, if encrypted.
    */
  var file: EncryptedFile
  
  /**
    * Information about the file.
    */
  var info: js.UndefOr[FileWithThumbnailInfo] = js.undefined
  
  /**
    * URL to the file, if unencrypted.
    */
  var url: String
}
object FileMessageEventContent {
  
  inline def apply(body: String, file: EncryptedFile, msgtype: MessageType, url: String): FileMessageEventContent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileMessageEventContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileMessageEventContent] (val x: Self) extends AnyVal {
    
    inline def setFile(value: EncryptedFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: FileWithThumbnailInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
