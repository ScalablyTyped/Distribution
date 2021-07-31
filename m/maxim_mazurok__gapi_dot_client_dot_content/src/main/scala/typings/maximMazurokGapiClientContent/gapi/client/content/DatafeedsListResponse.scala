package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatafeedsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#datafeedsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The token for the retrieval of the next page of datafeeds. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var resources: js.UndefOr[js.Array[Datafeed]] = js.undefined
}
object DatafeedsListResponse {
  
  @scala.inline
  def apply(): DatafeedsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedsListResponse]
  }
  
  @scala.inline
  implicit class DatafeedsListResponseMutableBuilder[Self <: DatafeedsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[Datafeed]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: Datafeed*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
