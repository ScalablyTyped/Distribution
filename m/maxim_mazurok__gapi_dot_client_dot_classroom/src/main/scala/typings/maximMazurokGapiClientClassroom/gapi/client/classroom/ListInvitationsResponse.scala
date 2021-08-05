package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInvitationsResponse extends StObject {
  
  /** Invitations that match the list request. */
  var invitations: js.UndefOr[js.Array[Invitation]] = js.undefined
  
  /** Token identifying the next page of results to return. If empty, no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListInvitationsResponse {
  
  inline def apply(): ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvitationsResponse]
  }
  
  extension [Self <: ListInvitationsResponse](x: Self) {
    
    inline def setInvitations(value: js.Array[Invitation]): Self = StObject.set(x, "invitations", value.asInstanceOf[js.Any])
    
    inline def setInvitationsUndefined: Self = StObject.set(x, "invitations", js.undefined)
    
    inline def setInvitationsVarargs(value: Invitation*): Self = StObject.set(x, "invitations", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
