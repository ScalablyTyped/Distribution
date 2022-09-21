package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaReplaceCatalogAttributeRequest extends StObject {
  
  /**
    * Required. The updated CatalogAttribute.
    */
  var catalogAttribute: js.UndefOr[SchemaGoogleCloudRetailV2betaCatalogAttribute] = js.undefined
  
  /**
    * Indicates which fields in the provided CatalogAttribute to update. The following are NOT supported: * CatalogAttribute.key If not set, all supported fields are updated.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaReplaceCatalogAttributeRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaReplaceCatalogAttributeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaReplaceCatalogAttributeRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaReplaceCatalogAttributeRequest](x: Self) {
    
    inline def setCatalogAttribute(value: SchemaGoogleCloudRetailV2betaCatalogAttribute): Self = StObject.set(x, "catalogAttribute", value.asInstanceOf[js.Any])
    
    inline def setCatalogAttributeUndefined: Self = StObject.set(x, "catalogAttribute", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
