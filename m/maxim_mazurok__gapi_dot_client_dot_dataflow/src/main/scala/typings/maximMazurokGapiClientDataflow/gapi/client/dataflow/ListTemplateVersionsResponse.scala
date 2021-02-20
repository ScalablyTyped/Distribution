package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTemplateVersionsResponse extends StObject {
  
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
  implicit class ListTemplateVersionsResponseMutableBuilder[Self <: ListTemplateVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTemplateVersions(value: js.Array[TemplateVersion]): Self = StObject.set(x, "templateVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateVersionsUndefined: Self = StObject.set(x, "templateVersions", js.undefined)
    
    @scala.inline
    def setTemplateVersionsVarargs(value: TemplateVersion*): Self = StObject.set(x, "templateVersions", js.Array(value :_*))
  }
}
