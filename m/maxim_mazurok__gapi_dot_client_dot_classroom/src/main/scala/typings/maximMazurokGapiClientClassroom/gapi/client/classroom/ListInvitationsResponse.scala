package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInvitationsResponse extends StObject {
  
  /** Invitations that match the list request. */
  var invitations: js.UndefOr[js.Array[Invitation]] = js.native
  
  /** Token identifying the next page of results to return. If empty, no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListInvitationsResponse {
  
  @scala.inline
  def apply(): ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvitationsResponse]
  }
  
  @scala.inline
  implicit class ListInvitationsResponseMutableBuilder[Self <: ListInvitationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitations(value: js.Array[Invitation]): Self = StObject.set(x, "invitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationsUndefined: Self = StObject.set(x, "invitations", js.undefined)
    
    @scala.inline
    def setInvitationsVarargs(value: Invitation*): Self = StObject.set(x, "invitations", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
