package typings.maximMazurokGapiClientAdmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerId extends js.Object {
  
  /** Output only. The unique identifier of the customer's account. */
  var customerId: js.UndefOr[String] = js.native
  
  /** Output only. Object key. Only relevant if entity.type = "OBJECT" Note: external-facing name of report is "Entities" rather than "Objects". */
  var entityId: js.UndefOr[String] = js.native
  
  /** Output only. The user's immutable G Suite profile identifier. */
  var profileId: js.UndefOr[String] = js.native
  
  /** Output only. The type of item. The value is customer. */
  var `type`: js.UndefOr[String] = js.native
  
  /** Output only. The user's email address. Only relevant if entity.type = "USER" */
  var userEmail: js.UndefOr[String] = js.native
}
object CustomerId {
  
  @scala.inline
  def apply(): CustomerId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerId]
  }
  
  @scala.inline
  implicit class CustomerIdOps[Self <: CustomerId] (val x: Self) extends AnyVal {
    
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
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    
    @scala.inline
    def setEntityId(value: String): Self = this.set("entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityId: Self = this.set("entityId", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUserEmail(value: String): Self = this.set("userEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEmail: Self = this.set("userEmail", js.undefined)
  }
}
