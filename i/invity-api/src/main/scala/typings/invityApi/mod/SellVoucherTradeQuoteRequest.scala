package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellVoucherTradeQuoteRequest extends StObject {
  
  // en
  var country: js.UndefOr[String] = js.undefined
  
  var cryptoCurrency: js.UndefOr[String] = js.undefined
  
  // BTC
  var language: js.UndefOr[String] = js.undefined
  
  // cz
  var refundAddress: js.UndefOr[String] = js.undefined
}
object SellVoucherTradeQuoteRequest {
  
  inline def apply(): SellVoucherTradeQuoteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SellVoucherTradeQuoteRequest]
  }
  
  extension [Self <: SellVoucherTradeQuoteRequest](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCryptoCurrency(value: String): Self = StObject.set(x, "cryptoCurrency", value.asInstanceOf[js.Any])
    
    inline def setCryptoCurrencyUndefined: Self = StObject.set(x, "cryptoCurrency", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setRefundAddress(value: String): Self = StObject.set(x, "refundAddress", value.asInstanceOf[js.Any])
    
    inline def setRefundAddressUndefined: Self = StObject.set(x, "refundAddress", js.undefined)
  }
}
