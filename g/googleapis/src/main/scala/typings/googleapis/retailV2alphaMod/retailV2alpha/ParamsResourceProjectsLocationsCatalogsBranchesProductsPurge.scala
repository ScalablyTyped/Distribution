package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsBranchesProductsPurge
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the branch under which the products are created. The format is `projects/${projectId\}/locations/global/catalogs/${catalogId\}/branches/${branchId\}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRetailV2alphaPurgeProductsRequest] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsBranchesProductsPurge {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsBranchesProductsPurge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsBranchesProductsPurge]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsBranchesProductsPurge](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRetailV2alphaPurgeProductsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
