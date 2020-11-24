package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsListLinksResponse extends js.Object {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountsListLinksResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The list of available links. */
  var links: js.UndefOr[js.Array[LinkedAccount]] = js.native
  
  /** The token for the retrieval of the next page of links. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object AccountsListLinksResponse {
  
  @scala.inline
  def apply(): AccountsListLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsListLinksResponse]
  }
  
  @scala.inline
  implicit class AccountsListLinksResponseOps[Self <: AccountsListLinksResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: LinkedAccount*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[LinkedAccount]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
