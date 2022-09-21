package typings.maximMazurokGapiClientBlogger.anon

import typings.maximMazurokGapiClientBlogger.gapi.client.blogger.Post
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items extends StObject {
  
  /** The List of Posts for this Blog. */
  var items: js.UndefOr[js.Array[Post]] = js.undefined
  
  /** The URL of the container for posts in this blog. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** The count of posts in this blog. */
  var totalItems: js.UndefOr[Double] = js.undefined
}
object Items {
  
  inline def apply(): Items = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Items]
  }
  
  extension [Self <: Items](x: Self) {
    
    inline def setItems(value: js.Array[Post]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Post*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
