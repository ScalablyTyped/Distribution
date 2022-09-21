package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentServiceProviderLinkInfo extends StObject {
  
  /** The business country of the merchant account as identified by the third party service provider. */
  var externalAccountBusinessCountry: js.UndefOr[String] = js.undefined
  
  /** The id used by the third party service provider to identify the merchant. */
  var externalAccountId: js.UndefOr[String] = js.undefined
}
object PaymentServiceProviderLinkInfo {
  
  inline def apply(): PaymentServiceProviderLinkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentServiceProviderLinkInfo]
  }
  
  extension [Self <: PaymentServiceProviderLinkInfo](x: Self) {
    
    inline def setExternalAccountBusinessCountry(value: String): Self = StObject.set(x, "externalAccountBusinessCountry", value.asInstanceOf[js.Any])
    
    inline def setExternalAccountBusinessCountryUndefined: Self = StObject.set(x, "externalAccountBusinessCountry", js.undefined)
    
    inline def setExternalAccountId(value: String): Self = StObject.set(x, "externalAccountId", value.asInstanceOf[js.Any])
    
    inline def setExternalAccountIdUndefined: Self = StObject.set(x, "externalAccountId", js.undefined)
  }
}
