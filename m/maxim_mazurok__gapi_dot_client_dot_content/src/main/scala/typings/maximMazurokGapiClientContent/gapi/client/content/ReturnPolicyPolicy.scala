package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnPolicyPolicy extends js.Object {
  
  /**
    * Required. Last day for returning the items. In ISO 8601 format. When specifying the return window like this, set the policy type to "lastReturnDate". Use this for seasonal overrides
    * only.
    */
  var lastReturnDate: js.UndefOr[String] = js.native
  
  /**
    * The number of days items can be returned after delivery, where one day is defined to be 24 hours after the delivery timestamp. When specifying the return window like this, set the
    * policy type to "numberOfDaysAfterDelivery". Acceptable values are 30, 45, 60, 90, 100, 180, 270 and 365 for the default policy. Additional policies further allow 14, 15, 21 and 28
    * days, but note that for most items a minimum of 30 days is required for returns. Exceptions may be made for electronics. A policy of less than 30 days can only be applied to those
    * items.
    */
  var numberOfDays: js.UndefOr[String] = js.native
  
  /**
    * Policy type. Use "lastReturnDate" for seasonal overrides only. Note that for most items a minimum of 30 days is required for returns. Exceptions may be made for electronics or
    * non-returnable items such as food, perishables, and living things. A policy of less than 30 days can only be applied to those items. Acceptable values are: - "`lastReturnDate`" -
    * "`lifetimeReturns`" - "`noReturns`" - "`numberOfDaysAfterDelivery`"
    */
  var `type`: js.UndefOr[String] = js.native
}
object ReturnPolicyPolicy {
  
  @scala.inline
  def apply(): ReturnPolicyPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnPolicyPolicy]
  }
  
  @scala.inline
  implicit class ReturnPolicyPolicyOps[Self <: ReturnPolicyPolicy] (val x: Self) extends AnyVal {
    
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
    def setLastReturnDate(value: String): Self = this.set("lastReturnDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastReturnDate: Self = this.set("lastReturnDate", js.undefined)
    
    @scala.inline
    def setNumberOfDays(value: String): Self = this.set("numberOfDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfDays: Self = this.set("numberOfDays", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
