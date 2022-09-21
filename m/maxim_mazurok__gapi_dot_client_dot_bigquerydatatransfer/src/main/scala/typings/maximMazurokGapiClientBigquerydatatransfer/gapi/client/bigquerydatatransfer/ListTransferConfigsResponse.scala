package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTransferConfigsResponse extends StObject {
  
  /**
    * Output only. The next-pagination token. For multiple-page list results, this token can be used as the `ListTransferConfigsRequest.page_token` to request the next page of list
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Output only. The stored pipeline transfer configurations. */
  var transferConfigs: js.UndefOr[js.Array[TransferConfig]] = js.undefined
}
object ListTransferConfigsResponse {
  
  inline def apply(): ListTransferConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTransferConfigsResponse]
  }
  
  extension [Self <: ListTransferConfigsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTransferConfigs(value: js.Array[TransferConfig]): Self = StObject.set(x, "transferConfigs", value.asInstanceOf[js.Any])
    
    inline def setTransferConfigsUndefined: Self = StObject.set(x, "transferConfigs", js.undefined)
    
    inline def setTransferConfigsVarargs(value: TransferConfig*): Self = StObject.set(x, "transferConfigs", js.Array(value*))
  }
}
