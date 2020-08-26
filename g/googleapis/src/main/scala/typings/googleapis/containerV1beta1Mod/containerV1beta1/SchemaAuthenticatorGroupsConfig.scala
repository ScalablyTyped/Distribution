package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for returning group information from authenticators.
  */
@js.native
trait SchemaAuthenticatorGroupsConfig extends js.Object {
  /**
    * Whether this cluster should return group membership lookups during
    * authentication using a group of security groups.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of the security group-of-groups to be used. Only relevant if
    * enabled = true.
    */
  var securityGroup: js.UndefOr[String] = js.native
}

object SchemaAuthenticatorGroupsConfig {
  @scala.inline
  def apply(): SchemaAuthenticatorGroupsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthenticatorGroupsConfig]
  }
  @scala.inline
  implicit class SchemaAuthenticatorGroupsConfigOps[Self <: SchemaAuthenticatorGroupsConfig] (val x: Self) extends AnyVal {
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

