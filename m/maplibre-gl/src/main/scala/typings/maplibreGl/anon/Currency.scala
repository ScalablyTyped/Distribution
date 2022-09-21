package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currency extends StObject {
  
  var currency: js.UndefOr[String | Any] = js.undefined
  
  var locale: js.UndefOr[String | Any] = js.undefined
  
  var `max-fraction-digits`: js.UndefOr[Double | Any] = js.undefined
  
  var `min-fraction-digits`: js.UndefOr[Double | Any] = js.undefined
}
object Currency {
  
  inline def apply(): Currency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Currency]
  }
  
  extension [Self <: Currency](x: Self) {
    
    inline def setCurrency(value: String | Any): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setLocale(value: String | Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def `setMax-fraction-digits`(value: Double | Any): Self = StObject.set(x, "max-fraction-digits", value.asInstanceOf[js.Any])
    
    inline def `setMax-fraction-digitsUndefined`: Self = StObject.set(x, "max-fraction-digits", js.undefined)
    
    inline def `setMin-fraction-digits`(value: Double | Any): Self = StObject.set(x, "min-fraction-digits", value.asInstanceOf[js.Any])
    
    inline def `setMin-fraction-digitsUndefined`: Self = StObject.set(x, "min-fraction-digits", js.undefined)
  }
}
