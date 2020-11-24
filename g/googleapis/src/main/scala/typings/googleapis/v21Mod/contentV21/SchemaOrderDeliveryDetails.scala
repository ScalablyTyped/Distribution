package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderDeliveryDetails extends js.Object {
  
  /**
    * The delivery address
    */
  var address: js.UndefOr[SchemaOrderAddress] = js.native
  
  /**
    * The phone number of the person receiving the delivery.
    */
  var phoneNumber: js.UndefOr[String] = js.native
}
object SchemaOrderDeliveryDetails {
  
  @scala.inline
  def apply(): SchemaOrderDeliveryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderDeliveryDetails]
  }
  
  @scala.inline
  implicit class SchemaOrderDeliveryDetailsOps[Self <: SchemaOrderDeliveryDetails] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: SchemaOrderAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
  }
}
