package typings.hexo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexPage extends StObject {
  
  var current: js.UndefOr[Double] = js.undefined
  
  var current_url: js.UndefOr[String] = js.undefined
  
  var next: js.UndefOr[Double] = js.undefined
  
  var next_link: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
  
  var posts: js.UndefOr[js.Object] = js.undefined
  
  var prev: js.UndefOr[Double] = js.undefined
  
  var prev_link: js.UndefOr[String] = js.undefined
  
  var total: js.UndefOr[Double] = js.undefined
}
object IndexPage {
  
  inline def apply(): IndexPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexPage] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setCurrent_url(value: String): Self = StObject.set(x, "current_url", value.asInstanceOf[js.Any])
    
    inline def setCurrent_urlUndefined: Self = StObject.set(x, "current_url", js.undefined)
    
    inline def setNext(value: Double): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNext_link(value: String): Self = StObject.set(x, "next_link", value.asInstanceOf[js.Any])
    
    inline def setNext_linkUndefined: Self = StObject.set(x, "next_link", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setPosts(value: js.Object): Self = StObject.set(x, "posts", value.asInstanceOf[js.Any])
    
    inline def setPostsUndefined: Self = StObject.set(x, "posts", js.undefined)
    
    inline def setPrev(value: Double): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    inline def setPrev_link(value: String): Self = StObject.set(x, "prev_link", value.asInstanceOf[js.Any])
    
    inline def setPrev_linkUndefined: Self = StObject.set(x, "prev_link", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
