package typings.lyricist.mod

import typings.lyricist.anon.Features
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends js.Object {
  
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
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApi_path(value: String): Self = this.set("api_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatar(value: Avatar): Self = this.set("avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent_user_metadata(value: Features): Self = this.set("current_user_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader_image_url(value: String): Self = this.set("header_image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHuman_readable_role_for_display(value: String): Self = this.set("human_readable_role_for_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIq(value: Double): Self = this.set("iq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogin(value: String): Self = this.set("login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole_for_display(value: String): Self = this.set("role_for_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
