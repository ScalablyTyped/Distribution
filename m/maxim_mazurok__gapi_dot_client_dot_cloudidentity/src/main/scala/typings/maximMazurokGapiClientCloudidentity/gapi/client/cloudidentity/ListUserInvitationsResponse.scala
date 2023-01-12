package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUserInvitationsResponse extends StObject {
  
  /**
    * The token for the next page. If not empty, indicates that there may be more `UserInvitation` resources that match the listing request; this value can be used in a subsequent
    * ListUserInvitationsRequest to get continued results with the current list call.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of UserInvitation resources. */
  var userInvitations: js.UndefOr[js.Array[UserInvitation]] = js.undefined
}
object ListUserInvitationsResponse {
  
  inline def apply(): ListUserInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserInvitationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListUserInvitationsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUserInvitations(value: js.Array[UserInvitation]): Self = StObject.set(x, "userInvitations", value.asInstanceOf[js.Any])
    
    inline def setUserInvitationsUndefined: Self = StObject.set(x, "userInvitations", js.undefined)
    
    inline def setUserInvitationsVarargs(value: UserInvitation*): Self = StObject.set(x, "userInvitations", js.Array(value*))
  }
}
