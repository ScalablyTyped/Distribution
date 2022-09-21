package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaBatchRemoveCatalogAttributesRequest extends StObject {
  
  /**
    * Required. The attribute name keys of the CatalogAttributes to delete. A maximum of 1000 catalog attributes can be deleted in a batch.
    */
  var attributeKeys: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaBatchRemoveCatalogAttributesRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaBatchRemoveCatalogAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaBatchRemoveCatalogAttributesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaBatchRemoveCatalogAttributesRequest](x: Self) {
    
    inline def setAttributeKeys(value: js.Array[String]): Self = StObject.set(x, "attributeKeys", value.asInstanceOf[js.Any])
    
    inline def setAttributeKeysNull: Self = StObject.set(x, "attributeKeys", null)
    
    inline def setAttributeKeysUndefined: Self = StObject.set(x, "attributeKeys", js.undefined)
    
    inline def setAttributeKeysVarargs(value: String*): Self = StObject.set(x, "attributeKeys", js.Array(value*))
  }
}
