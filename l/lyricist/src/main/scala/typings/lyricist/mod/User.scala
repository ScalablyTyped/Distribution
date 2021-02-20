package typings.lyricist.mod

import typings.lyricist.anon.Features
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends StObject {
  
  var api_path: String = js.native
  
  var avatar: Avatar = js.native
  
  var current_user_metadata: Features = js.native
  
  var header_image_url: String = js.native
  
  var human_readable_role_for_display: String = js.native
  
  var id: Double = js.native
  
  var iq: Double = js.native
  
  var login: String = js.native
  
  var name: String = js.native
  
  var role_for_display: String = js.native
  
  var url: String = js.native
}
object User {
  
  @scala.inline
  def apply(
    api_path: String,
    avatar: Avatar,
    current_user_metadata: Features,
    header_image_url: String,
    human_readable_role_for_display: String,
    id: Double,
    iq: Double,
    login: String,
    name: String,
    role_for_display: String,
    url: String
  ): User = {
    val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], current_user_metadata = current_user_metadata.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], human_readable_role_for_display = human_readable_role_for_display.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iq = iq.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], role_for_display = role_for_display.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi_path(value: String): Self = StObject.set(x, "api_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatar(value: Avatar): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent_user_metadata(value: Features): Self = StObject.set(x, "current_user_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader_image_url(value: String): Self = StObject.set(x, "header_image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHuman_readable_role_for_display(value: String): Self = StObject.set(x, "human_readable_role_for_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIq(value: Double): Self = StObject.set(x, "iq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole_for_display(value: String): Self = StObject.set(x, "role_for_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
