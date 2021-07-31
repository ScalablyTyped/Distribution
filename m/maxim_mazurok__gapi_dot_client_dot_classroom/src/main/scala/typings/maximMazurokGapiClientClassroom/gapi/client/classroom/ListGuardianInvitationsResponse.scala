package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGuardianInvitationsResponse extends StObject {
  
  /** Guardian invitations that matched the list request. */
  var guardianInvitations: js.UndefOr[js.Array[GuardianInvitation]] = js.undefined
  
  /** Token identifying the next page of results to return. If empty, no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListGuardianInvitationsResponse {
  
  @scala.inline
  def apply(): ListGuardianInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGuardianInvitationsResponse]
  }
  
  @scala.inline
  implicit class ListGuardianInvitationsResponseMutableBuilder[Self <: ListGuardianInvitationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGuardianInvitations(value: js.Array[GuardianInvitation]): Self = StObject.set(x, "guardianInvitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuardianInvitationsUndefined: Self = StObject.set(x, "guardianInvitations", js.undefined)
    
    @scala.inline
    def setGuardianInvitationsVarargs(value: GuardianInvitation*): Self = StObject.set(x, "guardianInvitations", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
