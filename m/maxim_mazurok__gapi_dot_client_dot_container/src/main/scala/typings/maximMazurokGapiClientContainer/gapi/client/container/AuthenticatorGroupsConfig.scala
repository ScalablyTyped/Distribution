package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticatorGroupsConfig extends js.Object {
  
  /** Whether this cluster should return group membership lookups during authentication using a group of security groups. */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** The name of the security group-of-groups to be used. Only relevant if enabled = true. */
  var securityGroup: js.UndefOr[String] = js.native
}
object AuthenticatorGroupsConfig {
  
  @scala.inline
  def apply(): AuthenticatorGroupsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticatorGroupsConfig]
  }
  
  @scala.inline
  implicit class AuthenticatorGroupsConfigOps[Self <: AuthenticatorGroupsConfig] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setSecurityGroup(value: String): Self = this.set("securityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroup: Self = this.set("securityGroup", js.undefined)
  }
}
