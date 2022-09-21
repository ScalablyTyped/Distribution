package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrice extends StObject {
  
  /**
    * The numeric value of the price.
    */
  var amount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The currency in which the price is denoted.
    */
  var currency: js.UndefOr[String | Null] = js.undefined
}
object SchemaPrice {
  
  inline def apply(): SchemaPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrice]
  }
  
  extension [Self <: SchemaPrice](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountNull: Self = StObject.set(x, "amount", null)
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
  }
}
