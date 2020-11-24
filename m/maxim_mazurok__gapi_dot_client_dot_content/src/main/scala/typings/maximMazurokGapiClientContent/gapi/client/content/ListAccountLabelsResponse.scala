package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccountLabelsResponse extends js.Object {
  
  /** The labels from the specified account. */
  var accountLabels: js.UndefOr[js.Array[AccountLabel]] = js.native
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListAccountLabelsResponse {
  
  @scala.inline
  def apply(): ListAccountLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountLabelsResponse]
  }
  
  @scala.inline
  implicit class ListAccountLabelsResponseOps[Self <: ListAccountLabelsResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountLabelsVarargs(value: AccountLabel*): Self = this.set("accountLabels", js.Array(value :_*))
    
    @scala.inline
    def setAccountLabels(value: js.Array[AccountLabel]): Self = this.set("accountLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountLabels: Self = this.set("accountLabels", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
