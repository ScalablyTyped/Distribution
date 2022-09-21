package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaAddCatalogAttributeRequest extends StObject {
  
  /**
    * Required. The CatalogAttribute to add.
    */
  var catalogAttribute: js.UndefOr[SchemaGoogleCloudRetailV2alphaCatalogAttribute] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaAddCatalogAttributeRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaAddCatalogAttributeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaAddCatalogAttributeRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaAddCatalogAttributeRequest](x: Self) {
    
    inline def setCatalogAttribute(value: SchemaGoogleCloudRetailV2alphaCatalogAttribute): Self = StObject.set(x, "catalogAttribute", value.asInstanceOf[js.Any])
    
    inline def setCatalogAttributeUndefined: Self = StObject.set(x, "catalogAttribute", js.undefined)
  }
}
