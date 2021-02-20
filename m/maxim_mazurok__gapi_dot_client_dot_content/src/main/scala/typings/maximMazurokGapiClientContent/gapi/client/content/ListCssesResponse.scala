package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCssesResponse extends StObject {
  
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
  implicit class ListCssesResponseMutableBuilder[Self <: ListCssesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsses(value: js.Array[Css]): Self = StObject.set(x, "csses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssesUndefined: Self = StObject.set(x, "csses", js.undefined)
    
    @scala.inline
    def setCssesVarargs(value: Css*): Self = StObject.set(x, "csses", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
