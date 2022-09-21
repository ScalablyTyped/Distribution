package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsAttributesconfigRemovecatalogattribute
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Full AttributesConfig resource name. Format: `projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/attributesConfig`
    */
  var attributesConfig: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRetailV2betaRemoveCatalogAttributeRequest] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsAttributesconfigRemovecatalogattribute {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsAttributesconfigRemovecatalogattribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsAttributesconfigRemovecatalogattribute]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsAttributesconfigRemovecatalogattribute](x: Self) {
    
    inline def setAttributesConfig(value: String): Self = StObject.set(x, "attributesConfig", value.asInstanceOf[js.Any])
    
    inline def setAttributesConfigUndefined: Self = StObject.set(x, "attributesConfig", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRetailV2betaRemoveCatalogAttributeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
