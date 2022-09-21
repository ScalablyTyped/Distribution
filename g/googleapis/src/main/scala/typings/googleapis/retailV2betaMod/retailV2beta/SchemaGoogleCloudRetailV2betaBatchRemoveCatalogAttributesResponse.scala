package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaBatchRemoveCatalogAttributesResponse extends StObject {
  
  /**
    * Catalog attributes that were deleted. Only attributes that are not in use by products can be deleted.
    */
  var deletedCatalogAttributes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Catalog attributes that were reset. Attributes that are in use by products cannot be deleted, however their configuration properties will reset to default values upon removal request.
    */
  var resetCatalogAttributes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaBatchRemoveCatalogAttributesResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaBatchRemoveCatalogAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaBatchRemoveCatalogAttributesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaBatchRemoveCatalogAttributesResponse](x: Self) {
    
    inline def setDeletedCatalogAttributes(value: js.Array[String]): Self = StObject.set(x, "deletedCatalogAttributes", value.asInstanceOf[js.Any])
    
    inline def setDeletedCatalogAttributesNull: Self = StObject.set(x, "deletedCatalogAttributes", null)
    
    inline def setDeletedCatalogAttributesUndefined: Self = StObject.set(x, "deletedCatalogAttributes", js.undefined)
    
    inline def setDeletedCatalogAttributesVarargs(value: String*): Self = StObject.set(x, "deletedCatalogAttributes", js.Array(value*))
    
    inline def setResetCatalogAttributes(value: js.Array[String]): Self = StObject.set(x, "resetCatalogAttributes", value.asInstanceOf[js.Any])
    
    inline def setResetCatalogAttributesNull: Self = StObject.set(x, "resetCatalogAttributes", null)
    
    inline def setResetCatalogAttributesUndefined: Self = StObject.set(x, "resetCatalogAttributes", js.undefined)
    
    inline def setResetCatalogAttributesVarargs(value: String*): Self = StObject.set(x, "resetCatalogAttributes", js.Array(value*))
  }
}
