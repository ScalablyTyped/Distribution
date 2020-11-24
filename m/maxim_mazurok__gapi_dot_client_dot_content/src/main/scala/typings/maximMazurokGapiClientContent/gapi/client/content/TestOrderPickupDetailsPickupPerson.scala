package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestOrderPickupDetailsPickupPerson extends js.Object {
  
  /** Required. Full name of the pickup person. */
  var name: js.UndefOr[String] = js.native
  
  /** Required. The phone number of the person picking up the items. */
  var phoneNumber: js.UndefOr[String] = js.native
}
object TestOrderPickupDetailsPickupPerson {
  
  @scala.inline
  def apply(): TestOrderPickupDetailsPickupPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOrderPickupDetailsPickupPerson]
  }
  
  @scala.inline
  implicit class TestOrderPickupDetailsPickupPersonOps[Self <: TestOrderPickupDetailsPickupPerson] (val x: Self) extends AnyVal {
    
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
