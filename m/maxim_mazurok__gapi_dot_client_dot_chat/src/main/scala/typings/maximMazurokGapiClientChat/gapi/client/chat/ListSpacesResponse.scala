package typings.maximMazurokGapiClientChat.gapi.client.chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSpacesResponse extends js.Object {
  
  /** Continuation token to retrieve the next page of results. It will be empty for the last page of results. Tokens expire in an hour. An error is thrown if an expired token is passed. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of spaces in the requested (or first) page. */
  var spaces: js.UndefOr[js.Array[Space]] = js.native
}
object ListSpacesResponse {
  
  @scala.inline
  def apply(): ListSpacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSpacesResponse]
  }
  
  @scala.inline
  implicit class ListSpacesResponseOps[Self <: ListSpacesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setSpacesVarargs(value: Space*): Self = this.set("spaces", js.Array(value :_*))
    
    @scala.inline
    def setSpaces(value: js.Array[Space]): Self = this.set("spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaces: Self = this.set("spaces", js.undefined)
  }
}
