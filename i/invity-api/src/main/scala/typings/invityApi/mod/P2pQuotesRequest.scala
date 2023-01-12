package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait P2pQuotesRequest extends StObject {
  
  var amount: String
  
  var assetCode: Coin
  
  var country: js.UndefOr[CountryCode] = js.undefined
  
  var currency: Currency
}
object P2pQuotesRequest {
  
  inline def apply(amount: String, assetCode: Coin, currency: Currency): P2pQuotesRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], assetCode = assetCode.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[P2pQuotesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: P2pQuotesRequest] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAssetCode(value: Coin): Self = StObject.set(x, "assetCode", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: CountryCode): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
  }
}
