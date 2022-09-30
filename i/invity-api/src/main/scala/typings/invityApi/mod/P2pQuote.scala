package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait P2pQuote extends StObject {
  
  var amountRange: P2pAmountRange
  
  var assetCode: Coin
  
  var confirmations: Double
  
  var countryCode: js.UndefOr[CountryCode] = js.undefined
  
  var currency: Currency
  
  var id: Id
  
  var paymentMethods: js.Array[P2pPaymentMethod]
  
  var paymentWindowMinutes: Double
  
  var price: String
  
  var provider: String
  
  var title: String
  
  var trader: P2pTrader
}
object P2pQuote {
  
  inline def apply(
    amountRange: P2pAmountRange,
    assetCode: Coin,
    confirmations: Double,
    currency: Currency,
    id: Id,
    paymentMethods: js.Array[P2pPaymentMethod],
    paymentWindowMinutes: Double,
    price: String,
    provider: String,
    title: String,
    trader: P2pTrader
  ): P2pQuote = {
    val __obj = js.Dynamic.literal(amountRange = amountRange.asInstanceOf[js.Any], assetCode = assetCode.asInstanceOf[js.Any], confirmations = confirmations.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paymentMethods = paymentMethods.asInstanceOf[js.Any], paymentWindowMinutes = paymentWindowMinutes.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trader = trader.asInstanceOf[js.Any])
    __obj.asInstanceOf[P2pQuote]
  }
  
  extension [Self <: P2pQuote](x: Self) {
    
    inline def setAmountRange(value: P2pAmountRange): Self = StObject.set(x, "amountRange", value.asInstanceOf[js.Any])
    
    inline def setAssetCode(value: Coin): Self = StObject.set(x, "assetCode", value.asInstanceOf[js.Any])
    
    inline def setConfirmations(value: Double): Self = StObject.set(x, "confirmations", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: CountryCode): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethods(value: js.Array[P2pPaymentMethod]): Self = StObject.set(x, "paymentMethods", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodsVarargs(value: P2pPaymentMethod*): Self = StObject.set(x, "paymentMethods", js.Array(value*))
    
    inline def setPaymentWindowMinutes(value: Double): Self = StObject.set(x, "paymentWindowMinutes", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTrader(value: P2pTrader): Self = StObject.set(x, "trader", value.asInstanceOf[js.Any])
  }
}
