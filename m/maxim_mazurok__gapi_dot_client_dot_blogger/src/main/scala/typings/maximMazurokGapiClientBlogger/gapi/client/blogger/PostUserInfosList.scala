package typings.maximMazurokGapiClientBlogger.gapi.client.blogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostUserInfosList extends StObject {
  
  /** The list of Posts with User information for the post, for this Blog. */
  var items: js.UndefOr[js.Array[PostUserInfo]] = js.undefined
  
  /** The kind of this entity. Always blogger#postList. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to fetch the next page, if one exists. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object PostUserInfosList {
  
  @scala.inline
  def apply(): PostUserInfosList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostUserInfosList]
  }
  
  @scala.inline
  implicit class PostUserInfosListMutableBuilder[Self <: PostUserInfosList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PostUserInfo]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PostUserInfo*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
