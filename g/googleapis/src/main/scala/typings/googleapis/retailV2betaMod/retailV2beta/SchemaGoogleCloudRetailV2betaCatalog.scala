package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaCatalog extends StObject {
  
  /**
    * Required. Immutable. The catalog display name. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Merchant Center linking configuration. Once a link is added, the data stream from Merchant Center to Cloud Retail will be enabled automatically. The requester must have access to the merchant center account in order to make changes to this field.
    */
  var merchantCenterLinkingConfig: js.UndefOr[SchemaGoogleCloudRetailV2betaMerchantCenterLinkingConfig] = js.undefined
  
  /**
    * Required. Immutable. The fully qualified resource name of the catalog.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The product level configuration.
    */
  var productLevelConfig: js.UndefOr[SchemaGoogleCloudRetailV2betaProductLevelConfig] = js.undefined
}
object SchemaGoogleCloudRetailV2betaCatalog {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaCatalog]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaCatalog](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMerchantCenterLinkingConfig(value: SchemaGoogleCloudRetailV2betaMerchantCenterLinkingConfig): Self = StObject.set(x, "merchantCenterLinkingConfig", value.asInstanceOf[js.Any])
    
    inline def setMerchantCenterLinkingConfigUndefined: Self = StObject.set(x, "merchantCenterLinkingConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProductLevelConfig(value: SchemaGoogleCloudRetailV2betaProductLevelConfig): Self = StObject.set(x, "productLevelConfig", value.asInstanceOf[js.Any])
    
    inline def setProductLevelConfigUndefined: Self = StObject.set(x, "productLevelConfig", js.undefined)
  }
}
