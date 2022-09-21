package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2AddCatalogAttributeRequest extends StObject {
  
  /**
    * Required. The CatalogAttribute to add.
    */
  var catalogAttribute: js.UndefOr[SchemaGoogleCloudRetailV2CatalogAttribute] = js.undefined
}
object SchemaGoogleCloudRetailV2AddCatalogAttributeRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2AddCatalogAttributeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2AddCatalogAttributeRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2AddCatalogAttributeRequest](x: Self) {
    
    inline def setCatalogAttribute(value: SchemaGoogleCloudRetailV2CatalogAttribute): Self = StObject.set(x, "catalogAttribute", value.asInstanceOf[js.Any])
    
    inline def setCatalogAttributeUndefined: Self = StObject.set(x, "catalogAttribute", js.undefined)
  }
}
