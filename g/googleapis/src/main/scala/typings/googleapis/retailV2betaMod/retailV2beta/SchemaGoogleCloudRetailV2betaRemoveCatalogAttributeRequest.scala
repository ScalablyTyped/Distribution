package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaRemoveCatalogAttributeRequest extends StObject {
  
  /**
    * Required. The attribute name key of the CatalogAttribute to remove.
    */
  var key: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaRemoveCatalogAttributeRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaRemoveCatalogAttributeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaRemoveCatalogAttributeRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaRemoveCatalogAttributeRequest](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
