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
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, securityGroup: String = null): SchemaAuthenticatorGroupsConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (securityGroup != null) __obj.updateDynamic("securityGroup")(securityGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAuthenticatorGroupsConfig]
  }
}

