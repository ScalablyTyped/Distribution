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
  
  @scala.inline
  def apply(): ListTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTransferRunsResponse]
  }
  
  @scala.inline
  implicit class ListTransferRunsResponseMutableBuilder[Self <: ListTransferRunsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTransferRuns(value: js.Array[TransferRun]): Self = StObject.set(x, "transferRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferRunsUndefined: Self = StObject.set(x, "transferRuns", js.undefined)
    
    @scala.inline
    def setTransferRunsVarargs(value: TransferRun*): Self = StObject.set(x, "transferRuns", js.Array(value :_*))
  }
}
