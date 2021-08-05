package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrice extends StObject {
  
  /**
    * 3 letter Currency code, as defined by ISO 4217.
    */
  var currency: js.UndefOr[String] = js.undefined
  
  /**
    * The price in millionths of the currency base unit represented as a
    * string.
    */
  var priceMicros: js.UndefOr[String] = js.undefined
}
object SchemaPrice {
  
  inline def apply(): SchemaPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrice]
  }
  
  extension [Self <: SchemaPrice](x: Self) {
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setPriceMicros(value: String): Self = StObject.set(x, "priceMicros", value.asInstanceOf[js.Any])
    
    inline def setPriceMicrosUndefined: Self = StObject.set(x, "priceMicros", js.undefined)
  }
}
