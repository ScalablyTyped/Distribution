package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstallment extends StObject {
  
  /**
    * The amount the buyer has to pay per month.
    */
  var amount: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * The number of installments the buyer has to pay.
    */
  var months: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstallment {
  
  inline def apply(): SchemaInstallment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstallment]
  }
  
  extension [Self <: SchemaInstallment](x: Self) {
    
    inline def setAmount(value: SchemaPrice): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setMonths(value: String): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setMonthsNull: Self = StObject.set(x, "months", null)
    
    inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
  }
}
