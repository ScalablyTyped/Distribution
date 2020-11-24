package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstallment extends js.Object {
  
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
  implicit class SchemaInstallmentOps[Self <: SchemaInstallment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmount(value: SchemaPrice): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setMonths(value: String): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
  }
}
