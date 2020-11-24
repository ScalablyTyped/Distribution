package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyMembershipRolesResponse extends js.Object {
  
  /** The `Membership` resource after modifying its `MembershipRole`s. */
  var membership: js.UndefOr[Membership] = js.native
}
object ModifyMembershipRolesResponse {
  
  @scala.inline
  def apply(): ModifyMembershipRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyMembershipRolesResponse]
  }
  
  @scala.inline
  implicit class ModifyMembershipRolesResponseOps[Self <: ModifyMembershipRolesResponse] (val x: Self) extends AnyVal {
    
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
    def setMembership(value: Membership): Self = this.set("membership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembership: Self = this.set("membership", js.undefined)
  }
}
