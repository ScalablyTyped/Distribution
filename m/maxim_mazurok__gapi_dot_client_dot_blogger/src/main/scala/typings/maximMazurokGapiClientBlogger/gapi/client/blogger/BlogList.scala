package typings.maximMazurokGapiClientBlogger.gapi.client.blogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlogList extends StObject {
  
  /** Admin level list of blog per-user information. */
  var blogUserInfos: js.UndefOr[js.Array[BlogUserInfo]] = js.native
  
  /** The list of Blogs this user has Authorship or Admin rights over. */
  var items: js.UndefOr[js.Array[Blog]] = js.native
  
  /** The kind of this entity. Always blogger#blogList. */
  var kind: js.UndefOr[String] = js.native
}
object BlogList {
  
  @scala.inline
  def apply(): BlogList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlogList]
  }
  
  @scala.inline
  implicit class BlogListMutableBuilder[Self <: BlogList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlogUserInfos(value: js.Array[BlogUserInfo]): Self = StObject.set(x, "blogUserInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogUserInfosUndefined: Self = StObject.set(x, "blogUserInfos", js.undefined)
    
    @scala.inline
    def setBlogUserInfosVarargs(value: BlogUserInfo*): Self = StObject.set(x, "blogUserInfos", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Blog]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Blog*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
