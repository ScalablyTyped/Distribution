package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListInvitationsResponse extends StObject {
  
  /**
    * A collection of invitations that are pending for the account. The number of invitations listed here cannot exceed 1000.
    */
  var invitations: js.UndefOr[js.Array[SchemaInvitation]] = js.undefined
}
object SchemaListInvitationsResponse {
  
  inline def apply(): SchemaListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListInvitationsResponse]
  }
  
  extension [Self <: SchemaListInvitationsResponse](x: Self) {
    
    inline def setInvitations(value: js.Array[SchemaInvitation]): Self = StObject.set(x, "invitations", value.asInstanceOf[js.Any])
    
    inline def setInvitationsUndefined: Self = StObject.set(x, "invitations", js.undefined)
    
    inline def setInvitationsVarargs(value: SchemaInvitation*): Self = StObject.set(x, "invitations", js.Array(value*))
  }
}
