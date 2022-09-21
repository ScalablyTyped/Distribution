package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPaymentServiceProviderLinkInfo extends StObject {
  
  /**
    * The business country of the merchant account as identified by the third party service provider.
    */
  var externalAccountBusinessCountry: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The id used by the third party service provider to identify the merchant.
    */
  var externalAccountId: js.UndefOr[String | Null] = js.undefined
}
object SchemaPaymentServiceProviderLinkInfo {
  
  inline def apply(): SchemaPaymentServiceProviderLinkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPaymentServiceProviderLinkInfo]
  }
  
  extension [Self <: SchemaPaymentServiceProviderLinkInfo](x: Self) {
    
    inline def setExternalAccountBusinessCountry(value: String): Self = StObject.set(x, "externalAccountBusinessCountry", value.asInstanceOf[js.Any])
    
    inline def setExternalAccountBusinessCountryNull: Self = StObject.set(x, "externalAccountBusinessCountry", null)
    
    inline def setExternalAccountBusinessCountryUndefined: Self = StObject.set(x, "externalAccountBusinessCountry", js.undefined)
    
    inline def setExternalAccountId(value: String): Self = StObject.set(x, "externalAccountId", value.asInstanceOf[js.Any])
    
    inline def setExternalAccountIdNull: Self = StObject.set(x, "externalAccountId", null)
    
    inline def setExternalAccountIdUndefined: Self = StObject.set(x, "externalAccountId", js.undefined)
  }
}
