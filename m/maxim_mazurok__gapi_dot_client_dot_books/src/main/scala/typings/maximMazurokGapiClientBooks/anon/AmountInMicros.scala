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
  
  @scala.inline
  def apply(): AmountInMicros = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmountInMicros]
  }
  
  @scala.inline
  implicit class AmountInMicrosMutableBuilder[Self <: AmountInMicros] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmountInMicros(value: Double): Self = StObject.set(x, "amountInMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountInMicrosUndefined: Self = StObject.set(x, "amountInMicros", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setReleaseNumber(value: String): Self = StObject.set(x, "releaseNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseNumberUndefined: Self = StObject.set(x, "releaseNumber", js.undefined)
    
    @scala.inline
    def setReleaseTime(value: String): Self = StObject.set(x, "releaseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseTimeUndefined: Self = StObject.set(x, "releaseTime", js.undefined)
  }
}
