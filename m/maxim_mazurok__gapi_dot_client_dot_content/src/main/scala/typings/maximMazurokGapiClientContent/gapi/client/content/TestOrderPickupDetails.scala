package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestOrderPickupDetails extends js.Object {
  
  /** Required. Code of the location defined by provider or merchant. */
  var locationCode: js.UndefOr[String] = js.native
  
  /** Required. Pickup location address. */
  var pickupLocationAddress: js.UndefOr[TestOrderAddress] = js.native
  
  /** Pickup location type. Acceptable values are: - "`locker`" - "`store`" - "`curbside`" */
  var pickupLocationType: js.UndefOr[String] = js.native
  
  /** Required. all pickup persons set by users. */
  var pickupPersons: js.UndefOr[js.Array[TestOrderPickupDetailsPickupPerson]] = js.native
}
object TestOrderPickupDetails {
  
  @scala.inline
  def apply(): TestOrderPickupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOrderPickupDetails]
  }
  
  @scala.inline
  implicit class TestOrderPickupDetailsOps[Self <: TestOrderPickupDetails] (val x: Self) extends AnyVal {
    
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
    def setLocationCode(value: String): Self = this.set("locationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationCode: Self = this.set("locationCode", js.undefined)
    
    @scala.inline
    def setPickupLocationAddress(value: TestOrderAddress): Self = this.set("pickupLocationAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickupLocationAddress: Self = this.set("pickupLocationAddress", js.undefined)
    
    @scala.inline
    def setPickupLocationType(value: String): Self = this.set("pickupLocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickupLocationType: Self = this.set("pickupLocationType", js.undefined)
    
    @scala.inline
    def setPickupPersonsVarargs(value: TestOrderPickupDetailsPickupPerson*): Self = this.set("pickupPersons", js.Array(value :_*))
    
    @scala.inline
    def setPickupPersons(value: js.Array[TestOrderPickupDetailsPickupPerson]): Self = this.set("pickupPersons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickupPersons: Self = this.set("pickupPersons", js.undefined)
  }
}
