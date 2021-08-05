package typings.maximMazurokGapiClientBlogger.gapi.client.blogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostPerUserInfo extends StObject {
  
  /** ID of the Blog that the post resource belongs to. */
  var blogId: js.UndefOr[String] = js.undefined
  
  /** True if the user has Author level access to the post. */
  var hasEditAccess: js.UndefOr[Boolean] = js.undefined
  
  /** The kind of this entity. Always blogger#postPerUserInfo. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** ID of the Post resource. */
  var postId: js.UndefOr[String] = js.undefined
  
  /** ID of the User. */
  var userId: js.UndefOr[String] = js.undefined
}
object PostPerUserInfo {
  
  inline def apply(): PostPerUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostPerUserInfo]
  }
  
  extension [Self <: PostPerUserInfo](x: Self) {
    
    inline def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    inline def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    inline def setHasEditAccess(value: Boolean): Self = StObject.set(x, "hasEditAccess", value.asInstanceOf[js.Any])
    
    inline def setHasEditAccessUndefined: Self = StObject.set(x, "hasEditAccess", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPostId(value: String): Self = StObject.set(x, "postId", value.asInstanceOf[js.Any])
    
    inline def setPostIdUndefined: Self = StObject.set(x, "postId", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
