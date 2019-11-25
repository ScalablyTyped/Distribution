package typings.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludedpermissionsInteractionsPermissions extends js.Object {
  var excluded_permissions: js.Array[String]
  var interactions: Anon_FollowingBoolean
  var permissions: js.Array[String]
}

object Anon_ExcludedpermissionsInteractionsPermissions {
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    interactions: Anon_FollowingBoolean,
    permissions: js.Array[String]
  ): Anon_ExcludedpermissionsInteractionsPermissions = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ExcludedpermissionsInteractionsPermissions]
  }
}

