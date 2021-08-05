package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Price extends StObject {
  
  /** 3 letter Currency code, as defined by ISO 4217. See java/com/google/common/money/CurrencyCode.java */
  var currency: js.UndefOr[String] = js.undefined
  
  /** Price in 1/million of the currency base unit, represented as a string. */
  var priceMicros: js.UndefOr[String] = js.undefined
}
object Price {
  
  inline def apply(): Price = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Price]
  }
  
  extension [Self <: Price](x: Self) {
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setPriceMicros(value: String): Self = StObject.set(x, "priceMicros", value.asInstanceOf[js.Any])
    
    inline def setPriceMicrosUndefined: Self = StObject.set(x, "priceMicros", js.undefined)
  }
}
