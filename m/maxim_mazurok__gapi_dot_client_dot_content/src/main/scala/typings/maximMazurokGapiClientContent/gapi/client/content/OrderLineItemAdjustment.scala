package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderLineItemAdjustment extends js.Object {
  
  /** Adjustment for total price of the line item. */
  var priceAdjustment: js.UndefOr[Price] = js.native
  
  /** Adjustment for total tax of the line item. */
  var taxAdjustment: js.UndefOr[Price] = js.native
  
  /** Type of this adjustment. Acceptable values are: - "`promotion`" */
  var `type`: js.UndefOr[String] = js.native
}
object OrderLineItemAdjustment {
  
  @scala.inline
  def apply(): OrderLineItemAdjustment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLineItemAdjustment]
  }
  
  @scala.inline
  implicit class OrderLineItemAdjustmentOps[Self <: OrderLineItemAdjustment] (val x: Self) extends AnyVal {
    
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
    def setPriceAdjustment(value: Price): Self = this.set("priceAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriceAdjustment: Self = this.set("priceAdjustment", js.undefined)
    
    @scala.inline
    def setTaxAdjustment(value: Price): Self = this.set("taxAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxAdjustment: Self = this.set("taxAdjustment", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
