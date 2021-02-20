package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTransferConfigsResponse extends StObject {
  
  /**
    * Output only. The next-pagination token. For multiple-page list results, this token can be used as the `ListTransferConfigsRequest.page_token` to request the next page of list
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Output only. The stored pipeline transfer configurations. */
  var transferConfigs: js.UndefOr[js.Array[TransferConfig]] = js.native
}
object ListTransferConfigsResponse {
  
  @scala.inline
  def apply(): ListTransferConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTransferConfigsResponse]
  }
  
  @scala.inline
  implicit class ListTransferConfigsResponseMutableBuilder[Self <: ListTransferConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTransferConfigs(value: js.Array[TransferConfig]): Self = StObject.set(x, "transferConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferConfigsUndefined: Self = StObject.set(x, "transferConfigs", js.undefined)
    
    @scala.inline
    def setTransferConfigsVarargs(value: TransferConfig*): Self = StObject.set(x, "transferConfigs", js.Array(value :_*))
  }
}
