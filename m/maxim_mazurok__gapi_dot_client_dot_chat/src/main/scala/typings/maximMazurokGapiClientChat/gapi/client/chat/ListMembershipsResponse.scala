package typings.maximMazurokGapiClientChat.gapi.client.chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMembershipsResponse extends js.Object {
  
  /** List of memberships in the requested (or first) page. */
  var memberships: js.UndefOr[js.Array[Membership]] = js.native
  
  /** Continuation token to retrieve the next page of results. It will be empty for the last page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListMembershipsResponse {
  
  @scala.inline
  def apply(): ListMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMembershipsResponse]
  }
  
  @scala.inline
  implicit class ListMembershipsResponseOps[Self <: ListMembershipsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMembershipsVarargs(value: Membership*): Self = this.set("memberships", js.Array(value :_*))
    
    @scala.inline
    def setMemberships(value: js.Array[Membership]): Self = this.set("memberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberships: Self = this.set("memberships", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
