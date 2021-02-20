package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrencyCode extends StObject {
  
  var amountInMicros: js.UndefOr[Double] = js.native
  
  var currencyCode: js.UndefOr[String] = js.native
}
object CurrencyCode {
  
  @scala.inline
  def apply(): CurrencyCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrencyCode]
  }
  
  @scala.inline
  implicit class CurrencyCodeMutableBuilder[Self <: CurrencyCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmountInMicros(value: Double): Self = StObject.set(x, "amountInMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountInMicrosUndefined: Self = StObject.set(x, "amountInMicros", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
  }
}
