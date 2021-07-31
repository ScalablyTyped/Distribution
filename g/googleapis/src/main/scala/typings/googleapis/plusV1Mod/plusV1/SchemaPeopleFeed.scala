package typings.googleapis.plusV1Mod.plusV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPeopleFeed extends StObject {
  
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The people in this page of results. Each item includes the id,
    * displayName, image, and url for the person. To retrieve additional
    * profile data, see the people.get method.
    */
  var items: js.UndefOr[js.Array[SchemaPerson]] = js.undefined
  
  /**
    * Identifies this resource as a collection of people. Value:
    * &quot;plus#peopleFeed&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Link to this resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * The title of this collection of people.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of people available in this list. The number of people
    * in a response might be smaller due to paging. This might not be set for
    * all collections.
    */
  var totalItems: js.UndefOr[Double] = js.undefined
}
object SchemaPeopleFeed {
  
  @scala.inline
  def apply(): SchemaPeopleFeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPeopleFeed]
  }
  
  @scala.inline
  implicit class SchemaPeopleFeedMutableBuilder[Self <: SchemaPeopleFeed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaPerson]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaPerson*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
