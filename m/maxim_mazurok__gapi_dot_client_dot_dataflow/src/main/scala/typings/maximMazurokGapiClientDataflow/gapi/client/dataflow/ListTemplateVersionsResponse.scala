package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTemplateVersionsResponse extends js.Object {
  
  /** A token that can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** A list of TemplateVersions. */
  var templateVersions: js.UndefOr[js.Array[TemplateVersion]] = js.native
}
object ListTemplateVersionsResponse {
  
  @scala.inline
  def apply(): ListTemplateVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTemplateVersionsResponse]
  }
  
  @scala.inline
  implicit class ListTemplateVersionsResponseOps[Self <: ListTemplateVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setTemplateVersionsVarargs(value: TemplateVersion*): Self = this.set("templateVersions", js.Array(value :_*))
    
    @scala.inline
    def setTemplateVersions(value: js.Array[TemplateVersion]): Self = this.set("templateVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateVersions: Self = this.set("templateVersions", js.undefined)
  }
}
