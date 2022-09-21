package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsAttributesconfigReplacecatalogattribute
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Full AttributesConfig resource name. Format: `projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/attributesConfig`
    */
  var attributesConfig: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRetailV2alphaReplaceCatalogAttributeRequest] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsAttributesconfigReplacecatalogattribute {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsAttributesconfigReplacecatalogattribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsAttributesconfigReplacecatalogattribute]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsAttributesconfigReplacecatalogattribute](x: Self) {
    
    inline def setAttributesConfig(value: String): Self = StObject.set(x, "attributesConfig", value.asInstanceOf[js.Any])
    
    inline def setAttributesConfigUndefined: Self = StObject.set(x, "attributesConfig", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRetailV2alphaReplaceCatalogAttributeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
