package typings.lyricist.lyricistMod

import typings.lyricist.Anon_ExcludedpermissionsFeatures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var api_path: String
  var avatar: Avatar
  var current_user_metadata: Anon_ExcludedpermissionsFeatures
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
    current_user_metadata: Anon_ExcludedpermissionsFeatures,
    header_image_url: String,
    human_readable_role_for_display: String,
    id: Double,
    iq: Double,
    login: String,
    name: String,
    role_for_display: String,
    url: String
  ): User = {
    val __obj = js.Dynamic.literal(api_path = api_path, avatar = avatar, current_user_metadata = current_user_metadata, header_image_url = header_image_url, human_readable_role_for_display = human_readable_role_for_display, id = id, iq = iq, login = login, name = name, role_for_display = role_for_display, url = url)
  
    __obj.asInstanceOf[User]
  }
}

