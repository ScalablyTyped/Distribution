package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsBranchesProductsAddlocalinventories
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Full resource name of Product, such as `projects/x/locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`. If the caller does not have permission to access the Product, regardless of whether or not it exists, a PERMISSION_DENIED error is returned.
    */
  var product: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRetailV2alphaAddLocalInventoriesRequest] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsBranchesProductsAddlocalinventories {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsBranchesProductsAddlocalinventories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsBranchesProductsAddlocalinventories]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsBranchesProductsAddlocalinventories](x: Self) {
    
    inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRetailV2alphaAddLocalInventoriesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
