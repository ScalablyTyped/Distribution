package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTemplateVersionsResponse extends StObject {
  
  /** A token that can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of TemplateVersions. */
  var templateVersions: js.UndefOr[js.Array[TemplateVersion]] = js.undefined
}
object ListTemplateVersionsResponse {
  
  inline def apply(): ListTemplateVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTemplateVersionsResponse]
  }
  
  extension [Self <: ListTemplateVersionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTemplateVersions(value: js.Array[TemplateVersion]): Self = StObject.set(x, "templateVersions", value.asInstanceOf[js.Any])
    
    inline def setTemplateVersionsUndefined: Self = StObject.set(x, "templateVersions", js.undefined)
    
    inline def setTemplateVersionsVarargs(value: TemplateVersion*): Self = StObject.set(x, "templateVersions", js.Array(value :_*))
  }
}
