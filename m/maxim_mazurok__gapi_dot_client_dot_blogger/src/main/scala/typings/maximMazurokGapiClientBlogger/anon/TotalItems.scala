package typings.maximMazurokGapiClientBlogger.anon

import typings.maximMazurokGapiClientBlogger.gapi.client.blogger.Comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TotalItems extends StObject {
  
  /** The List of Comments for this Post. */
  var items: js.UndefOr[js.Array[Comment]] = js.native
  
  /** The URL of the comments on this post. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** The count of comments on this post. */
  var totalItems: js.UndefOr[String] = js.native
}
object TotalItems {
  
  @scala.inline
  def apply(): TotalItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotalItems]
  }
  
  @scala.inline
  implicit class TotalItemsMutableBuilder[Self <: TotalItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Comment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Comment*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setTotalItems(value: String): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
