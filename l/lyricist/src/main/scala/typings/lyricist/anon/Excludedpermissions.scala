package typings.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Excludedpermissions extends js.Object {
  var excluded_permissions: js.Array[String] = js.native
  var interactions: Following = js.native
  var iq_by_action: js.Any = js.native
  var permissions: js.Array[String] = js.native
  var relationships: js.Any = js.native
}

object Excludedpermissions {
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    interactions: Following,
    iq_by_action: js.Any,
    permissions: js.Array[String],
    relationships: js.Any
  ): Excludedpermissions = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], iq_by_action = iq_by_action.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
    __obj.asInstanceOf[Excludedpermissions]
  }
  @scala.inline
  implicit class ExcludedpermissionsOps[Self <: Excludedpermissions] (val x: Self) extends AnyVal {
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
    def setInteractions(value: Following): Self = this.set("interactions", value.asInstanceOf[js.Any])
    @scala.inline
    def setIq_by_action(value: js.Any): Self = this.set("iq_by_action", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = this.set("permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelationships(value: js.Any): Self = this.set("relationships", value.asInstanceOf[js.Any])
  }
  
}

