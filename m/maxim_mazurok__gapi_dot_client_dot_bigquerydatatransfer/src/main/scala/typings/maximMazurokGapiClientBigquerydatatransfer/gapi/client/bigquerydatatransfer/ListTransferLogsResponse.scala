package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTransferLogsResponse extends StObject {
  
  /** Output only. The next-pagination token. For multiple-page list results, this token can be used as the `GetTransferRunLogRequest.page_token` to request the next page of list results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Output only. The stored pipeline transfer messages. */
  var transferMessages: js.UndefOr[js.Array[TransferMessage]] = js.undefined
}
object ListTransferLogsResponse {
  
  inline def apply(): ListTransferLogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTransferLogsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTransferLogsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTransferMessages(value: js.Array[TransferMessage]): Self = StObject.set(x, "transferMessages", value.asInstanceOf[js.Any])
    
    inline def setTransferMessagesUndefined: Self = StObject.set(x, "transferMessages", js.undefined)
    
    inline def setTransferMessagesVarargs(value: TransferMessage*): Self = StObject.set(x, "transferMessages", js.Array(value*))
  }
}
