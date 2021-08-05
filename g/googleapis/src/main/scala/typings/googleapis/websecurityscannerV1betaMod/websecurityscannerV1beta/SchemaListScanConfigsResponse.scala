package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `ListScanConfigs` method.
  */
trait SchemaListScanConfigsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of ScanConfigs returned.
    */
  var scanConfigs: js.UndefOr[js.Array[SchemaScanConfig]] = js.undefined
}
object SchemaListScanConfigsResponse {
  
  inline def apply(): SchemaListScanConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListScanConfigsResponse]
  }
  
  extension [Self <: SchemaListScanConfigsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setScanConfigs(value: js.Array[SchemaScanConfig]): Self = StObject.set(x, "scanConfigs", value.asInstanceOf[js.Any])
    
    inline def setScanConfigsUndefined: Self = StObject.set(x, "scanConfigs", js.undefined)
    
    inline def setScanConfigsVarargs(value: SchemaScanConfig*): Self = StObject.set(x, "scanConfigs", js.Array(value :_*))
  }
}
