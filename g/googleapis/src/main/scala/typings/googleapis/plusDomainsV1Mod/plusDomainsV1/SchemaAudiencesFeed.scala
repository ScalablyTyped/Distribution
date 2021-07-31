package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAudiencesFeed extends StObject {
  
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The audiences in this result.
    */
  var items: js.UndefOr[js.Array[SchemaAudience]] = js.undefined
  
  /**
    * Identifies this resource as a collection of audiences. Value:
    * &quot;plus#audienceFeed&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of ACL entries. The number of entries in this response
    * may be smaller due to paging.
    */
  var totalItems: js.UndefOr[Double] = js.undefined
}
object SchemaAudiencesFeed {
  
  @scala.inline
  def apply(): SchemaAudiencesFeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAudiencesFeed]
  }
  
  @scala.inline
  implicit class SchemaAudiencesFeedMutableBuilder[Self <: SchemaAudiencesFeed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaAudience]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaAudience*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
