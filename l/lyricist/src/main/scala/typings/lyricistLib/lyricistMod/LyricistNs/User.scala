package typings
package lyricistLib.lyricistMod.LyricistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var api_path: java.lang.String
  var avatar: Avatar
  var current_user_metadata: lyricistLib.Anon_ExcludedpermissionsFeatures
  var header_image_url: java.lang.String
  var human_readable_role_for_display: java.lang.String
  var id: scala.Double
  var iq: scala.Double
  var login: java.lang.String
  var name: java.lang.String
  var role_for_display: java.lang.String
  var url: java.lang.String
}

object User {
  @scala.inline
  def apply(
    api_path: java.lang.String,
    avatar: Avatar,
    current_user_metadata: lyricistLib.Anon_ExcludedpermissionsFeatures,
    header_image_url: java.lang.String,
    human_readable_role_for_display: java.lang.String,
    id: scala.Double,
    iq: scala.Double,
    login: java.lang.String,
    name: java.lang.String,
    role_for_display: java.lang.String,
    url: java.lang.String
  ): User = {
    val __obj = js.Dynamic.literal(api_path = api_path, avatar = avatar, current_user_metadata = current_user_metadata, header_image_url = header_image_url, human_readable_role_for_display = human_readable_role_for_display, id = id, iq = iq, login = login, name = name, role_for_display = role_for_display, url = url)
  
    __obj.asInstanceOf[User]
  }
}

