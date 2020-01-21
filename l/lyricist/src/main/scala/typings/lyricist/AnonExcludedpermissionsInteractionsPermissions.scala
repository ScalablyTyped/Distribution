package typings.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExcludedpermissionsInteractionsPermissions extends js.Object {
  var excluded_permissions: js.Array[String]
  var interactions: AnonFollowingBoolean
  var permissions: js.Array[String]
}

object AnonExcludedpermissionsInteractionsPermissions {
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    interactions: AnonFollowingBoolean,
    permissions: js.Array[String]
  ): AnonExcludedpermissionsInteractionsPermissions = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExcludedpermissionsInteractionsPermissions]
  }
}

