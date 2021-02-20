package typings.invityApi.mod

import typings.invityApi.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuyTradeFormResponse extends StObject {
  
  var error: js.UndefOr[String] = js.native
  
  var form: js.UndefOr[Fields] = js.native
}
object BuyTradeFormResponse {
  
  @scala.inline
  def apply(): BuyTradeFormResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuyTradeFormResponse]
  }
  
  @scala.inline
  implicit class BuyTradeFormResponseMutableBuilder[Self <: BuyTradeFormResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setForm(value: Fields): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
  }
}
