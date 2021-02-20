package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client user is created under a client buyer and has restricted access to
  * the Marketplace and certain other sections of the Authorized Buyers UI
  * based on the role granted to the associated client buyer.  The only way a
  * new client user can be created is via accepting an email invitation (see
  * the accounts.clients.invitations.create method).  All fields are required
  * unless otherwise specified.
  */
@js.native
trait SchemaClientUser extends StObject {
  
  /**
    * Numerical account ID of the client buyer with which the user is
    * associated; the buyer must be a client of the current sponsor buyer. The
    * value of this field is ignored in an update operation.
    */
  var clientAccountId: js.UndefOr[String] = js.native
  
  /**
    * User&#39;s email address. The value of this field is ignored in an update
    * operation.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The status of the client user.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The unique numerical ID of the client user that has accepted an
    * invitation. The value of this field is ignored in an update operation.
    */
  var userId: js.UndefOr[String] = js.native
}
object SchemaClientUser {
  
  @scala.inline
  def apply(): SchemaClientUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientUser]
  }
  
  @scala.inline
  implicit class SchemaClientUserMutableBuilder[Self <: SchemaClientUser] (val x: Self) extends AnyVal {
    
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
