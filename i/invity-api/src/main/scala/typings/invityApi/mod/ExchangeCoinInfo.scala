package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeCoinInfo extends StObject {
  
  // Bitcoin
  var category: String
  
  // BTC
  var name: String
  
  var ticker: String
  
  // popular
  var token: js.UndefOr[String] = js.undefined
}
object ExchangeCoinInfo {
  
  inline def apply(category: String, name: String, ticker: String): ExchangeCoinInfo = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ticker = ticker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeCoinInfo]
  }
  
  extension [Self <: ExchangeCoinInfo](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTicker(value: String): Self = StObject.set(x, "ticker", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
