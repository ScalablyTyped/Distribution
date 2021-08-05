package typings.maximMazurokGapiClientBlogger.gapi.client.blogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlogPerUserInfo extends StObject {
  
  /** ID of the Blog resource. */
  var blogId: js.UndefOr[String] = js.undefined
  
  /** True if the user has Admin level access to the blog. */
  var hasAdminAccess: js.UndefOr[Boolean] = js.undefined
  
  /** The kind of this entity. Always blogger#blogPerUserInfo. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The Photo Album Key for the user when adding photos to the blog. */
  var photosAlbumKey: js.UndefOr[String] = js.undefined
  
  /** Access permissions that the user has for the blog (ADMIN, AUTHOR, or READER). */
  var role: js.UndefOr[String] = js.undefined
  
  /** ID of the User. */
  var userId: js.UndefOr[String] = js.undefined
}
object BlogPerUserInfo {
  
  inline def apply(): BlogPerUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlogPerUserInfo]
  }
  
  extension [Self <: BlogPerUserInfo](x: Self) {
    
    inline def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    inline def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    inline def setHasAdminAccess(value: Boolean): Self = StObject.set(x, "hasAdminAccess", value.asInstanceOf[js.Any])
    
    inline def setHasAdminAccessUndefined: Self = StObject.set(x, "hasAdminAccess", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPhotosAlbumKey(value: String): Self = StObject.set(x, "photosAlbumKey", value.asInstanceOf[js.Any])
    
    inline def setPhotosAlbumKeyUndefined: Self = StObject.set(x, "photosAlbumKey", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
