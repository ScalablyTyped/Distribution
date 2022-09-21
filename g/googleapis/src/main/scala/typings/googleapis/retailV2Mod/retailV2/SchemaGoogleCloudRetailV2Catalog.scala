package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2Catalog extends StObject {
  
  /**
    * Required. Immutable. The catalog display name. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The fully qualified resource name of the catalog.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The product level configuration.
    */
  var productLevelConfig: js.UndefOr[SchemaGoogleCloudRetailV2ProductLevelConfig] = js.undefined
}
object SchemaGoogleCloudRetailV2Catalog {
  
  inline def apply(): SchemaGoogleCloudRetailV2Catalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2Catalog]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2Catalog](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProductLevelConfig(value: SchemaGoogleCloudRetailV2ProductLevelConfig): Self = StObject.set(x, "productLevelConfig", value.asInstanceOf[js.Any])
    
    inline def setProductLevelConfigUndefined: Self = StObject.set(x, "productLevelConfig", js.undefined)
  }
}
