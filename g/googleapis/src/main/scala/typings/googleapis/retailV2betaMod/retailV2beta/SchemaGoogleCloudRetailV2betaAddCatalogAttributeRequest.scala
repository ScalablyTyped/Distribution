package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaAddCatalogAttributeRequest extends StObject {
  
  /**
    * Required. The CatalogAttribute to add.
    */
  var catalogAttribute: js.UndefOr[SchemaGoogleCloudRetailV2betaCatalogAttribute] = js.undefined
}
object SchemaGoogleCloudRetailV2betaAddCatalogAttributeRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaAddCatalogAttributeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaAddCatalogAttributeRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaAddCatalogAttributeRequest](x: Self) {
    
    inline def setCatalogAttribute(value: SchemaGoogleCloudRetailV2betaCatalogAttribute): Self = StObject.set(x, "catalogAttribute", value.asInstanceOf[js.Any])
    
    inline def setCatalogAttributeUndefined: Self = StObject.set(x, "catalogAttribute", js.undefined)
  }
}
