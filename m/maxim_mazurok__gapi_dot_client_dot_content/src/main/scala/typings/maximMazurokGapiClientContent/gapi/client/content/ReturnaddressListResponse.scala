package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnaddressListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#returnaddressListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The token for the retrieval of the next page of addresses. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  var resources: js.UndefOr[js.Array[ReturnAddress]] = js.native
}
object ReturnaddressListResponse {
  
  @scala.inline
  def apply(): ReturnaddressListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnaddressListResponse]
  }
  
  @scala.inline
  implicit class ReturnaddressListResponseMutableBuilder[Self <: ReturnaddressListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[ReturnAddress]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: ReturnAddress*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
