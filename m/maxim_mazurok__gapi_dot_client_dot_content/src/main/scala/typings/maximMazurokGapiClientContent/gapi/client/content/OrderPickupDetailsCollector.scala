package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderPickupDetailsCollector extends js.Object {
  
  /** Name of the person picking up the shipment. */
  var name: js.UndefOr[String] = js.native
  
  /** Phone number of the person picking up the shipment. */
  var phoneNumber: js.UndefOr[String] = js.native
}
object OrderPickupDetailsCollector {
  
  @scala.inline
  def apply(): OrderPickupDetailsCollector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderPickupDetailsCollector]
  }
  
  @scala.inline
  implicit class OrderPickupDetailsCollectorOps[Self <: OrderPickupDetailsCollector] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
  }
}
