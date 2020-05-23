package typings.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permissions extends js.Object {
  var excluded_permissions: js.Array[String]
  var interactions: FollowingBoolean
  var permissions: js.Array[String]
}

object Permissions {
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    interactions: FollowingBoolean,
    permissions: js.Array[String]
  ): Permissions = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permissions]
  }
}

