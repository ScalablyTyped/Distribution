package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaMerchantCenterLinkingConfig extends StObject {
  
  /**
    * Links between Merchant Center accounts and branches.
    */
  var links: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2betaMerchantCenterLink]] = js.undefined
}
object SchemaGoogleCloudRetailV2betaMerchantCenterLinkingConfig {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaMerchantCenterLinkingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaMerchantCenterLinkingConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaMerchantCenterLinkingConfig](x: Self) {
    
    inline def setLinks(value: js.Array[SchemaGoogleCloudRetailV2betaMerchantCenterLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: SchemaGoogleCloudRetailV2betaMerchantCenterLink*): Self = StObject.set(x, "links", js.Array(value*))
  }
}
