package typings.maximMazurokGapiClientBlogger.gapi.client.blogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlogUserInfo extends StObject {
  
  /** The Blog resource. */
  var blog: js.UndefOr[Blog] = js.undefined
  
  /** Information about a User for the Blog. */
  var blog_user_info: js.UndefOr[BlogPerUserInfo] = js.undefined
  
  /** The kind of this entity. Always blogger#blogUserInfo. */
  var kind: js.UndefOr[String] = js.undefined
}
object BlogUserInfo {
  
  inline def apply(): BlogUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlogUserInfo]
  }
  
  extension [Self <: BlogUserInfo](x: Self) {
    
    inline def setBlog(value: Blog): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
    
    inline def setBlogUndefined: Self = StObject.set(x, "blog", js.undefined)
    
    inline def setBlog_user_info(value: BlogPerUserInfo): Self = StObject.set(x, "blog_user_info", value.asInstanceOf[js.Any])
    
    inline def setBlog_user_infoUndefined: Self = StObject.set(x, "blog_user_info", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
