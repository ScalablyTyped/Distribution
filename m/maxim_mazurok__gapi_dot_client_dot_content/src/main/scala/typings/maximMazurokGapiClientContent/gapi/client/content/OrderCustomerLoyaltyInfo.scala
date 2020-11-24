package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderCustomerLoyaltyInfo extends js.Object {
  
  /** The loyalty card/membership number. */
  var loyaltyNumber: js.UndefOr[String] = js.native
  
  /** Name of card/membership holder, this field will be populated when */
  var name: js.UndefOr[String] = js.native
}
object OrderCustomerLoyaltyInfo {
  
  @scala.inline
  def apply(): OrderCustomerLoyaltyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderCustomerLoyaltyInfo]
  }
  
  @scala.inline
  implicit class OrderCustomerLoyaltyInfoOps[Self <: OrderCustomerLoyaltyInfo] (val x: Self) extends AnyVal {
    
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
    def setLoyaltyNumber(value: String): Self = this.set("loyaltyNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoyaltyNumber: Self = this.set("loyaltyNumber", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
