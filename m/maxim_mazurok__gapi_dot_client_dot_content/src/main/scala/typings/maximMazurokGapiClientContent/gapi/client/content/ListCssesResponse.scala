package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCssesResponse extends js.Object {
  
  /** The CSS domains affiliated with the specified CSS group. */
  var csses: js.UndefOr[js.Array[Css]] = js.native
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListCssesResponse {
  
  @scala.inline
  def apply(): ListCssesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCssesResponse]
  }
  
  @scala.inline
  implicit class ListCssesResponseOps[Self <: ListCssesResponse] (val x: Self) extends AnyVal {
    
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
    def setCssesVarargs(value: Css*): Self = this.set("csses", js.Array(value :_*))
    
    @scala.inline
    def setCsses(value: js.Array[Css]): Self = this.set("csses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsses: Self = this.set("csses", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
