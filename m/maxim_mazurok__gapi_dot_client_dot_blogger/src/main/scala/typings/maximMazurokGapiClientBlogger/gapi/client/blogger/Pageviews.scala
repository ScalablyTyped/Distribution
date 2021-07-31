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
  
  @scala.inline
  def apply(): Pageviews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pageviews]
  }
  
  @scala.inline
  implicit class PageviewsMutableBuilder[Self <: Pageviews] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    @scala.inline
    def setCounts(value: js.Array[Count]): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountsUndefined: Self = StObject.set(x, "counts", js.undefined)
    
    @scala.inline
    def setCountsVarargs(value: Count*): Self = StObject.set(x, "counts", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
