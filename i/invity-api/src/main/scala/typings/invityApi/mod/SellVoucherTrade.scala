package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellVoucherTrade extends StObject {
  
  // BTC
  var cryptoAmount: js.UndefOr[Double] = js.undefined
  
  // state of trade after request trade
  var cryptoCurrency: js.UndefOr[String] = js.undefined
  
  // 0.12345
  var destinationAddress: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  // something went wrong
  var exchange: js.UndefOr[String] = js.undefined
  
  // crypto address to which sent crypto currency to sell
  var paymentId: js.UndefOr[String] = js.undefined
  
  var siteUrl: js.UndefOr[String] = js.undefined
  
  // which exchange this trade belongs to, used for discrimination in ExchangeService
  var status: js.UndefOr[SellTradeStatus] = js.undefined
}
object SellVoucherTrade {
  
  inline def apply(): SellVoucherTrade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SellVoucherTrade]
  }
  
  extension [Self <: SellVoucherTrade](x: Self) {
    
    inline def setCryptoAmount(value: Double): Self = StObject.set(x, "cryptoAmount", value.asInstanceOf[js.Any])
    
    inline def setCryptoAmountUndefined: Self = StObject.set(x, "cryptoAmount", js.undefined)
    
    inline def setCryptoCurrency(value: String): Self = StObject.set(x, "cryptoCurrency", value.asInstanceOf[js.Any])
    
    inline def setCryptoCurrencyUndefined: Self = StObject.set(x, "cryptoCurrency", js.undefined)
    
    inline def setDestinationAddress(value: String): Self = StObject.set(x, "destinationAddress", value.asInstanceOf[js.Any])
    
    inline def setDestinationAddressUndefined: Self = StObject.set(x, "destinationAddress", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
    
    inline def setPaymentId(value: String): Self = StObject.set(x, "paymentId", value.asInstanceOf[js.Any])
    
    inline def setPaymentIdUndefined: Self = StObject.set(x, "paymentId", js.undefined)
    
    inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    
    inline def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
    
    inline def setStatus(value: SellTradeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
