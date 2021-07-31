package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListClientUserInvitationsResponse extends StObject {
  
  /**
    * The returned list of client users.
    */
  var invitations: js.UndefOr[js.Array[SchemaClientUserInvitation]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListClientUserInvitationsRequest.pageToken field in the subsequent call
    * to the clients.invitations.list method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListClientUserInvitationsResponse {
  
  @scala.inline
  def apply(): SchemaListClientUserInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListClientUserInvitationsResponse]
  }
  
  @scala.inline
  implicit class SchemaListClientUserInvitationsResponseMutableBuilder[Self <: SchemaListClientUserInvitationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitations(value: js.Array[SchemaClientUserInvitation]): Self = StObject.set(x, "invitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationsUndefined: Self = StObject.set(x, "invitations", js.undefined)
    
    @scala.inline
    def setInvitationsVarargs(value: SchemaClientUserInvitation*): Self = StObject.set(x, "invitations", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
