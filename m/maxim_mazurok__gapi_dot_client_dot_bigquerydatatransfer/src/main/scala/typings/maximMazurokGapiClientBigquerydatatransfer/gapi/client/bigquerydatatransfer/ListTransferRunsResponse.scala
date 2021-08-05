package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTransferRunsResponse extends StObject {
  
  /** Output only. The next-pagination token. For multiple-page list results, this token can be used as the `ListTransferRunsRequest.page_token` to request the next page of list results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Output only. The stored pipeline transfer runs. */
  var transferRuns: js.UndefOr[js.Array[TransferRun]] = js.undefined
}
object ListTransferRunsResponse {
  
  inline def apply(): ListTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTransferRunsResponse]
  }
  
  extension [Self <: ListTransferRunsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTransferRuns(value: js.Array[TransferRun]): Self = StObject.set(x, "transferRuns", value.asInstanceOf[js.Any])
    
    inline def setTransferRunsUndefined: Self = StObject.set(x, "transferRuns", js.undefined)
    
    inline def setTransferRunsVarargs(value: TransferRun*): Self = StObject.set(x, "transferRuns", js.Array(value :_*))
  }
}
