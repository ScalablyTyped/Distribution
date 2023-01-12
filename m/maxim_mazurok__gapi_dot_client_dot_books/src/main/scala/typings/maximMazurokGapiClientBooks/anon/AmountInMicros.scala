package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmountInMicros extends StObject {
  
  var amountInMicros: js.UndefOr[Double] = js.undefined
  
  var currencyCode: js.UndefOr[String] = js.undefined
  
  var releaseNumber: js.UndefOr[String] = js.undefined
  
  var releaseTime: js.UndefOr[String] = js.undefined
}
object AmountInMicros {
  
  inline def apply(): AmountInMicros = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmountInMicros]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmountInMicros] (val x: Self) extends AnyVal {
    
    inline def setAmountInMicros(value: Double): Self = StObject.set(x, "amountInMicros", value.asInstanceOf[js.Any])
    
    inline def setAmountInMicrosUndefined: Self = StObject.set(x, "amountInMicros", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setReleaseNumber(value: String): Self = StObject.set(x, "releaseNumber", value.asInstanceOf[js.Any])
    
    inline def setReleaseNumberUndefined: Self = StObject.set(x, "releaseNumber", js.undefined)
    
    inline def setReleaseTime(value: String): Self = StObject.set(x, "releaseTime", value.asInstanceOf[js.Any])
    
    inline def setReleaseTimeUndefined: Self = StObject.set(x, "releaseTime", js.undefined)
  }
}
