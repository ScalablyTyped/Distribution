package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMembershipsResponse extends StObject {
  
  /** List of memberships in the requested (or first) page. */
  var memberships: js.UndefOr[js.Array[Membership]] = js.undefined
  
  /** Continuation token to retrieve the next page of results. It will be empty for the last page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListMembershipsResponse {
  
  @scala.inline
  def apply(): ListMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMembershipsResponse]
  }
  
  @scala.inline
  implicit class ListMembershipsResponseMutableBuilder[Self <: ListMembershipsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberships(value: js.Array[Membership]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
    
    @scala.inline
    def setMembershipsVarargs(value: Membership*): Self = StObject.set(x, "memberships", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
