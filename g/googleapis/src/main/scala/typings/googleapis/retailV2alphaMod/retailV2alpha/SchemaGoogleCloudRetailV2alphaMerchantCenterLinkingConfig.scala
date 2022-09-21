package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaMerchantCenterLinkingConfig extends StObject {
  
  /**
    * Links between Merchant Center accounts and branches.
    */
  var links: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2alphaMerchantCenterLink]] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaMerchantCenterLinkingConfig {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaMerchantCenterLinkingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaMerchantCenterLinkingConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaMerchantCenterLinkingConfig](x: Self) {
    
    inline def setLinks(value: js.Array[SchemaGoogleCloudRetailV2alphaMerchantCenterLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: SchemaGoogleCloudRetailV2alphaMerchantCenterLink*): Self = StObject.set(x, "links", js.Array(value*))
  }
}
