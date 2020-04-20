package typings.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPermissions extends js.Object {
  var excluded_permissions: js.Array[String]
  var interactions: AnonFollowingBoolean
  var permissions: js.Array[String]
}

object AnonPermissions {
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    interactions: AnonFollowingBoolean,
    permissions: js.Array[String]
  ): AnonPermissions = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPermissions]
  }
}

