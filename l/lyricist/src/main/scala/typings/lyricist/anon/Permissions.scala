package typings.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permissions extends js.Object {
  var excluded_permissions: js.Array[String] = js.native
  var interactions: FollowingBoolean = js.native
  var permissions: js.Array[String] = js.native
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
  @scala.inline
  implicit class PermissionsOps[Self <: Permissions] (val x: Self) extends AnyVal {
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
    def setExcluded_permissionsVarargs(value: String*): Self = this.set("excluded_permissions", js.Array(value :_*))
    @scala.inline
    def setExcluded_permissions(value: js.Array[String]): Self = this.set("excluded_permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setInteractions(value: FollowingBoolean): Self = this.set("interactions", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = this.set("permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = this.set("permissions", value.asInstanceOf[js.Any])
  }
  
}

