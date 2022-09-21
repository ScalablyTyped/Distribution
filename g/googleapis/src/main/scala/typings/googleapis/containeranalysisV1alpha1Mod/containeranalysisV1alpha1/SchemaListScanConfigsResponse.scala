package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListScanConfigsResponse extends StObject {
  
  /**
    * A page token to pass in order to get more scan configs.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The set of scan configs.
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
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setScanConfigs(value: js.Array[SchemaScanConfig]): Self = StObject.set(x, "scanConfigs", value.asInstanceOf[js.Any])
    
    inline def setScanConfigsUndefined: Self = StObject.set(x, "scanConfigs", js.undefined)
    
    inline def setScanConfigsVarargs(value: SchemaScanConfig*): Self = StObject.set(x, "scanConfigs", js.Array(value*))
  }
}
