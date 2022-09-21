package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClientUserInvitation extends StObject {
  
  /**
    * Numerical account ID of the client buyer that the invited user is associated with. The value of this field is ignored in create operations.
    */
  var clientAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email address to which the invitation is sent. Email addresses should be unique among all client users under each sponsor buyer.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique numerical ID of the invitation that is sent to the user. The value of this field is ignored in create operations.
    */
  var invitationId: js.UndefOr[String | Null] = js.undefined
}
object SchemaClientUserInvitation {
  
  inline def apply(): SchemaClientUserInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientUserInvitation]
  }
  
  extension [Self <: SchemaClientUserInvitation](x: Self) {
    
    inline def setClientAccountId(value: String): Self = StObject.set(x, "clientAccountId", value.asInstanceOf[js.Any])
    
    inline def setClientAccountIdNull: Self = StObject.set(x, "clientAccountId", null)
    
    inline def setClientAccountIdUndefined: Self = StObject.set(x, "clientAccountId", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setInvitationId(value: String): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
    
    inline def setInvitationIdNull: Self = StObject.set(x, "invitationId", null)
    
    inline def setInvitationIdUndefined: Self = StObject.set(x, "invitationId", js.undefined)
  }
}
