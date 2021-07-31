package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of changes for a user.
  */
trait SchemaChangeList extends StObject {
  
  /**
    * The ETag of the list.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The list of changes. If nextPageToken is populated, then this list may be
    * incomplete and an additional page of results should be fetched.
    */
  var items: js.UndefOr[js.Array[SchemaChange]] = js.undefined
  
  /**
    * This is always drive#changeList.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The current largest change ID.
    */
  var largestChangeId: js.UndefOr[String] = js.undefined
  
  /**
    * The starting page token for future changes. This will be present only if
    * the end of the current changes list has been reached.
    */
  var newStartPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A link to the next page of changes.
    */
  var nextLink: js.UndefOr[String] = js.undefined
  
  /**
    * The page token for the next page of changes. This will be absent if the
    * end of the changes list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A link back to this list.
    */
  var selfLink: js.UndefOr[String] = js.undefined
}
object SchemaChangeList {
  
  @scala.inline
  def apply(): SchemaChangeList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangeList]
  }
  
  @scala.inline
  implicit class SchemaChangeListMutableBuilder[Self <: SchemaChangeList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaChange]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaChange*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLargestChangeId(value: String): Self = StObject.set(x, "largestChangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargestChangeIdUndefined: Self = StObject.set(x, "largestChangeId", js.undefined)
    
    @scala.inline
    def setNewStartPageToken(value: String): Self = StObject.set(x, "newStartPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewStartPageTokenUndefined: Self = StObject.set(x, "newStartPageToken", js.undefined)
    
    @scala.inline
    def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextLinkUndefined: Self = StObject.set(x, "nextLink", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
