package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Membership extends js.Object {
  
  /** Output only. The time when the `Membership` was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The [resource name](https://cloud.google.com/apis/design/resource_names) of the `Membership`. Shall be of the form `groups/{group_id}/memberships/{membership_id}`. */
  var name: js.UndefOr[String] = js.native
  
  /** Required. Immutable. The `EntityKey` of the member. */
  var preferredMemberKey: js.UndefOr[EntityKey] = js.native
  
  /**
    * The `MembershipRole`s that apply to the `Membership`. If unspecified, defaults to a single `MembershipRole` with `name` `MEMBER`. Must not contain duplicate `MembershipRole`s with
    * the same `name`.
    */
  var roles: js.UndefOr[js.Array[MembershipRole]] = js.native
  
  /** Output only. The type of the membership. */
  var `type`: js.UndefOr[String] = js.native
  
  /** Output only. The time when the `Membership` was last updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object Membership {
  
  @scala.inline
  def apply(): Membership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Membership]
  }
  
  @scala.inline
  implicit class MembershipOps[Self <: Membership] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPreferredMemberKey(value: EntityKey): Self = this.set("preferredMemberKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredMemberKey: Self = this.set("preferredMemberKey", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: MembershipRole*): Self = this.set("roles", js.Array(value :_*))
    
    @scala.inline
    def setRoles(value: js.Array[MembershipRole]): Self = this.set("roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
