package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrencyCode extends StObject {
  
  var amountInMicros: js.UndefOr[Double] = js.undefined
  
  var currencyCode: js.UndefOr[String] = js.undefined
}
object CurrencyCode {
  
  inline def apply(): CurrencyCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrencyCode]
  }
  
  extension [Self <: CurrencyCode](x: Self) {
    
    inline def setAmountInMicros(value: Double): Self = StObject.set(x, "amountInMicros", value.asInstanceOf[js.Any])
    
    inline def setAmountInMicrosUndefined: Self = StObject.set(x, "amountInMicros", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
  }
}
