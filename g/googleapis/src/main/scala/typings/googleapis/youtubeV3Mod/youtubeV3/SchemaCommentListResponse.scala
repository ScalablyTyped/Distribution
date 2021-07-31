package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommentListResponse extends StObject {
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Serialized EventId of the request which produced this response.
    */
  var eventId: js.UndefOr[String] = js.undefined
  
  /**
    * A list of comments that match the request criteria.
    */
  var items: js.UndefOr[js.Array[SchemaComment]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#commentListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The token that can be used as the value of the pageToken parameter to
    * retrieve the next page in the result set.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var pageInfo: js.UndefOr[SchemaPageInfo] = js.undefined
  
  var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.undefined
  
  /**
    * The visitorId identifies the visitor.
    */
  var visitorId: js.UndefOr[String] = js.undefined
}
object SchemaCommentListResponse {
  
  @scala.inline
  def apply(): SchemaCommentListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommentListResponse]
  }
  
  @scala.inline
  implicit class SchemaCommentListResponseMutableBuilder[Self <: SchemaCommentListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaComment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaComment*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPageInfo(value: SchemaPageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    @scala.inline
    def setTokenPagination(value: SchemaTokenPagination): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
    
    @scala.inline
    def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
  }
}
