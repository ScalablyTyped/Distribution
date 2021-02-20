package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeCoinInfo extends StObject {
  
  // Bitcoin
  var category: String = js.native
  
  // BTC
  var name: String = js.native
  
  var ticker: String = js.native
  
  // popular
  var token: js.UndefOr[String] = js.native
}
object ExchangeCoinInfo {
  
  @scala.inline
  def apply(category: String, name: String, ticker: String): ExchangeCoinInfo = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ticker = ticker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeCoinInfo]
  }
  
  @scala.inline
  implicit class ExchangeCoinInfoMutableBuilder[Self <: ExchangeCoinInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicker(value: String): Self = StObject.set(x, "ticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
