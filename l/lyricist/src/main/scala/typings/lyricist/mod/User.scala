package typings.lyricist.mod

import typings.lyricist.anon.Features
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var api_path: String
  var avatar: Avatar
  var current_user_metadata: Features
  var header_image_url: String
  var human_readable_role_for_display: String
  var id: Double
  var iq: Double
  var login: String
  var name: String
  var role_for_display: String
  var url: String
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
}

