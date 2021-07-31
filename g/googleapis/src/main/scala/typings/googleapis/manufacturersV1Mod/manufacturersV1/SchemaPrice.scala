package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A price.
  */
trait SchemaPrice extends StObject {
  
  /**
    * The numeric value of the price.
    */
  var amount: js.UndefOr[String] = js.undefined
  
  /**
    * The currency in which the price is denoted.
    */
  var currency: js.UndefOr[String] = js.undefined
}
object SchemaPrice {
  
  @scala.inline
  def apply(): SchemaPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrice]
  }
  
  @scala.inline
  implicit class SchemaPriceMutableBuilder[Self <: SchemaPrice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
  }
}
