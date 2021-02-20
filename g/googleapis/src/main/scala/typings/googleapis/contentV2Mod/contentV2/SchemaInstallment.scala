package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstallment extends StObject {
  
  /**
    * The amount the buyer has to pay per month.
    */
  var amount: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * The number of installments the buyer has to pay.
    */
  var months: js.UndefOr[String] = js.native
}
object SchemaInstallment {
  
  @scala.inline
  def apply(): SchemaInstallment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstallment]
  }
  
  @scala.inline
  implicit class SchemaInstallmentMutableBuilder[Self <: SchemaInstallment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: SchemaPrice): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setMonths(value: String): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
  }
}
