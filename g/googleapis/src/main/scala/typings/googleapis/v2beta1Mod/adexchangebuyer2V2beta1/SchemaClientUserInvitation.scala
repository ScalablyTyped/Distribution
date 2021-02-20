package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An invitation for a new client user to get access to the Authorized Buyers
  * UI. All fields are required unless otherwise specified.
  */
@js.native
trait SchemaClientUserInvitation extends StObject {
  
  /**
    * Numerical account ID of the client buyer that the invited user is
    * associated with. The value of this field is ignored in create operations.
    */
  var clientAccountId: js.UndefOr[String] = js.native
  
  /**
    * The email address to which the invitation is sent. Email addresses should
    * be unique among all client users under each sponsor buyer.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The unique numerical ID of the invitation that is sent to the user. The
    * value of this field is ignored in create operations.
    */
  var invitationId: js.UndefOr[String] = js.native
}
object SchemaClientUserInvitation {
  
  @scala.inline
  def apply(): SchemaClientUserInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientUserInvitation]
  }
  
  @scala.inline
  implicit class SchemaClientUserInvitationMutableBuilder[Self <: SchemaClientUserInvitation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientAccountId(value: String): Self = StObject.set(x, "clientAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAccountIdUndefined: Self = StObject.set(x, "clientAccountId", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setInvitationId(value: String): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationIdUndefined: Self = StObject.set(x, "invitationId", js.undefined)
  }
}
