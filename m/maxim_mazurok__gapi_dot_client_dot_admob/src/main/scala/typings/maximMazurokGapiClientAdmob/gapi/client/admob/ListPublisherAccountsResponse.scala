package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPublisherAccountsResponse extends js.Object {
  
  /** Publisher that the client credentials can access. */
  var account: js.UndefOr[js.Array[PublisherAccount]] = js.native
  
  /** If not empty, indicates that there might be more accounts for the request; you must pass this value in a new `ListPublisherAccountsRequest`. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListPublisherAccountsResponse {
  
  @scala.inline
  def apply(): ListPublisherAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPublisherAccountsResponse]
  }
  
  @scala.inline
  implicit class ListPublisherAccountsResponseOps[Self <: ListPublisherAccountsResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountVarargs(value: PublisherAccount*): Self = this.set("account", js.Array(value :_*))
    
    @scala.inline
    def setAccount(value: js.Array[PublisherAccount]): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
