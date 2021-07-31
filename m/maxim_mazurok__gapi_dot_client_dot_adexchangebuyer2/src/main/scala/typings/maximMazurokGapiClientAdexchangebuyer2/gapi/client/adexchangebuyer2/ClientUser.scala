package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientUser extends StObject {
  
  /**
    * Numerical account ID of the client buyer with which the user is associated; the buyer must be a client of the current sponsor buyer. The value of this field is ignored in an update
    * operation.
    */
  var clientAccountId: js.UndefOr[String] = js.undefined
  
  /** User's email address. The value of this field is ignored in an update operation. */
  var email: js.UndefOr[String] = js.undefined
  
  /** The status of the client user. */
  var status: js.UndefOr[String] = js.undefined
  
  /** The unique numerical ID of the client user that has accepted an invitation. The value of this field is ignored in an update operation. */
  var userId: js.UndefOr[String] = js.undefined
}
object ClientUser {
  
  @scala.inline
  def apply(): ClientUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientUser]
  }
  
  @scala.inline
  implicit class ClientUserMutableBuilder[Self <: ClientUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientAccountId(value: String): Self = StObject.set(x, "clientAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAccountIdUndefined: Self = StObject.set(x, "clientAccountId", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
