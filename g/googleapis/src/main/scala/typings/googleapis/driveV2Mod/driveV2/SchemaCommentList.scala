package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of comments on a file in Google Drive.
  */
trait SchemaCommentList extends StObject {
  
  /**
    * The list of comments. If nextPageToken is populated, then this list may
    * be incomplete and an additional page of results should be fetched.
    */
  var items: js.UndefOr[js.Array[SchemaComment]] = js.undefined
  
  /**
    * This is always drive#commentList.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A link to the next page of comments.
    */
  var nextLink: js.UndefOr[String] = js.undefined
  
  /**
    * The page token for the next page of comments. This will be absent if the
    * end of the comments list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A link back to this list.
    */
  var selfLink: js.UndefOr[String] = js.undefined
}
object SchemaCommentList {
  
  @scala.inline
  def apply(): SchemaCommentList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommentList]
  }
  
  @scala.inline
  implicit class SchemaCommentListMutableBuilder[Self <: SchemaCommentList] (val x: Self) extends AnyVal {
    
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
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
