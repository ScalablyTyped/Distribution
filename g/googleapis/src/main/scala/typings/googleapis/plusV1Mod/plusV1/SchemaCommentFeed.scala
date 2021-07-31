package typings.googleapis.plusV1Mod.plusV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommentFeed extends StObject {
  
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of this collection of comments.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The comments in this page of results.
    */
  var items: js.UndefOr[js.Array[SchemaComment]] = js.undefined
  
  /**
    * Identifies this resource as a collection of comments. Value:
    * &quot;plus#commentFeed&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Link to the next page of activities.
    */
  var nextLink: js.UndefOr[String] = js.undefined
  
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The title of this collection of comments.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which this collection of comments was last updated. Formatted
    * as an RFC 3339 timestamp.
    */
  var updated: js.UndefOr[String] = js.undefined
}
object SchemaCommentFeed {
  
  @scala.inline
  def apply(): SchemaCommentFeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommentFeed]
  }
  
  @scala.inline
  implicit class SchemaCommentFeedMutableBuilder[Self <: SchemaCommentFeed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
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
    def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextLinkUndefined: Self = StObject.set(x, "nextLink", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
