package typings.maximMazurokGapiClientBlogger.gapi.client.blogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostUserInfo extends StObject {
  
  /** The kind of this entity. Always blogger#postUserInfo. */
  var kind: js.UndefOr[String] = js.native
  
  /** The Post resource. */
  var post: js.UndefOr[Post] = js.native
  
  /** Information about a User for the Post. */
  var post_user_info: js.UndefOr[PostPerUserInfo] = js.native
}
object PostUserInfo {
  
  @scala.inline
  def apply(): PostUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostUserInfo]
  }
  
  @scala.inline
  implicit class PostUserInfoMutableBuilder[Self <: PostUserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPost(value: Post): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    @scala.inline
    def setPost_user_info(value: PostPerUserInfo): Self = StObject.set(x, "post_user_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPost_user_infoUndefined: Self = StObject.set(x, "post_user_info", js.undefined)
  }
}
