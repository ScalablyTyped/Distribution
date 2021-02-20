package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1ListTagsResponse extends StObject {
  
  /** Token to retrieve the next page of results. It is set to empty if no items remain in results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Tag details. */
  var tags: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1Tag]] = js.native
}
object GoogleCloudDatacatalogV1beta1ListTagsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1ListTagsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1ListTagsResponseMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1ListTagsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[GoogleCloudDatacatalogV1beta1Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: GoogleCloudDatacatalogV1beta1Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
