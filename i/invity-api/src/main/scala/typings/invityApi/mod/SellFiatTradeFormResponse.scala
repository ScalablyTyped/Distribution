package typings.invityApi.mod

import typings.invityApi.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellFiatTradeFormResponse extends StObject {
  
  var error: js.UndefOr[String] = js.undefined
  
  var form: js.UndefOr[Fields] = js.undefined
}
object SellFiatTradeFormResponse {
  
  inline def apply(): SellFiatTradeFormResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SellFiatTradeFormResponse]
  }
  
  extension [Self <: SellFiatTradeFormResponse](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setForm(value: Fields): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
  }
}
