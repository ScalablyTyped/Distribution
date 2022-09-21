package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCatalogSearch
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDatacatalogV1SearchCatalogRequest] = js.undefined
}
object ParamsResourceCatalogSearch {
  
  inline def apply(): ParamsResourceCatalogSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCatalogSearch]
  }
  
  extension [Self <: ParamsResourceCatalogSearch](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleCloudDatacatalogV1SearchCatalogRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
