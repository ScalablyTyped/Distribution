package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsAttributesconfigBatchremovecatalogattributes
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The attributes config resource shared by all catalog attributes being deleted. Format: `projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/attributesConfig`
    */
  var attributesConfig: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRetailV2betaBatchRemoveCatalogAttributesRequest] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsAttributesconfigBatchremovecatalogattributes {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsAttributesconfigBatchremovecatalogattributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsAttributesconfigBatchremovecatalogattributes]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsAttributesconfigBatchremovecatalogattributes](x: Self) {
    
    inline def setAttributesConfig(value: String): Self = StObject.set(x, "attributesConfig", value.asInstanceOf[js.Any])
    
    inline def setAttributesConfigUndefined: Self = StObject.set(x, "attributesConfig", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRetailV2betaBatchRemoveCatalogAttributesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
