package typings.maximMazurokGapiClientBlogger.gapi.client.blogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentList extends StObject {
  
  /** Etag of the response. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The List of Comments for a Post. */
  var items: js.UndefOr[js.Array[Comment]] = js.undefined
  
  /** The kind of this entry. Always blogger#commentList. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to fetch the next page, if one exists. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Pagination token to fetch the previous page, if one exists. */
  var prevPageToken: js.UndefOr[String] = js.undefined
}
object CommentList {
  
  @scala.inline
  def apply(): CommentList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentList]
  }
  
  @scala.inline
  implicit class CommentListMutableBuilder[Self <: CommentList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[Comment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Comment*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
  }
}
