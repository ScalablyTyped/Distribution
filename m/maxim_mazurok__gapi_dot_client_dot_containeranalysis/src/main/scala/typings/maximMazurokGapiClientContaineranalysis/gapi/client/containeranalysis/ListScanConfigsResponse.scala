package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListScanConfigsResponse extends StObject {
  
  /** The next pagination token in the list response. It should be used as `page_token` for the following request. An empty value means no more results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The scan configurations requested. */
  var scanConfigs: js.UndefOr[js.Array[ScanConfig]] = js.undefined
}
object ListScanConfigsResponse {
  
  inline def apply(): ListScanConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScanConfigsResponse]
  }
  
  extension [Self <: ListScanConfigsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setScanConfigs(value: js.Array[ScanConfig]): Self = StObject.set(x, "scanConfigs", value.asInstanceOf[js.Any])
    
    inline def setScanConfigsUndefined: Self = StObject.set(x, "scanConfigs", js.undefined)
    
    inline def setScanConfigsVarargs(value: ScanConfig*): Self = StObject.set(x, "scanConfigs", js.Array(value :_*))
  }
}
