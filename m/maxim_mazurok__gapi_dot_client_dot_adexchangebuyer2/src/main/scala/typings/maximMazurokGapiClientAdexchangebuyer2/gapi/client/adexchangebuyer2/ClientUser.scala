package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientUser extends js.Object {
  
  /**
    * Numerical account ID of the client buyer with which the user is associated; the buyer must be a client of the current sponsor buyer. The value of this field is ignored in an update
    * operation.
    */
  var clientAccountId: js.UndefOr[String] = js.native
  
  /** User's email address. The value of this field is ignored in an update operation. */
  var email: js.UndefOr[String] = js.native
  
  /** The status of the client user. */
  var status: js.UndefOr[String] = js.native
  
  /** The unique numerical ID of the client user that has accepted an invitation. The value of this field is ignored in an update operation. */
  var userId: js.UndefOr[String] = js.native
}
object ClientUser {
  
  @scala.inline
  def apply(): ClientUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientUser]
  }
  
  @scala.inline
  implicit class ClientUserOps[Self <: ClientUser] (val x: Self) extends AnyVal {
    
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
    def setClientAccountId(value: String): Self = this.set("clientAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientAccountId: Self = this.set("clientAccountId", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
