package typings.maximMazurokGapiClientBlogger.gapi.client.blogger

import typings.maximMazurokGapiClientBlogger.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pageviews extends StObject {
  
  /** Blog Id. */
  var blogId: js.UndefOr[String] = js.undefined
  
  /** The container of posts in this blog. */
  var counts: js.UndefOr[js.Array[Count]] = js.undefined
  
  /** The kind of this entry. Always blogger#page_views. */
  var kind: js.UndefOr[String] = js.undefined
}
object Pageviews {
  
  inline def apply(): Pageviews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pageviews]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pageviews] (val x: Self) extends AnyVal {
    
    inline def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    inline def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    inline def setCounts(value: js.Array[Count]): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    inline def setCountsUndefined: Self = StObject.set(x, "counts", js.undefined)
    
    inline def setCountsVarargs(value: Count*): Self = StObject.set(x, "counts", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
