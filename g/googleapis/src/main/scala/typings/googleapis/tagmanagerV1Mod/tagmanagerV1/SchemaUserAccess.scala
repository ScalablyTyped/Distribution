package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a user&#39;s permissions to an account and its container.
  */
@js.native
trait SchemaUserAccess extends js.Object {
  /**
    * GTM Account access permissions.
    */
  var accountAccess: js.UndefOr[SchemaAccountAccess] = js.native
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * GTM Container access permissions.
    */
  var containerAccess: js.UndefOr[js.Array[SchemaContainerAccess]] = js.native
  /**
    * User&#39;s email address.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * Account Permission ID.
    */
  var permissionId: js.UndefOr[String] = js.native
}

object SchemaUserAccess {
  @scala.inline
  def apply(
    accountAccess: SchemaAccountAccess = null,
    accountId: String = null,
    containerAccess: js.Array[SchemaContainerAccess] = null,
    emailAddress: String = null,
    permissionId: String = null
  ): SchemaUserAccess = {
    val __obj = js.Dynamic.literal()
    if (accountAccess != null) __obj.updateDynamic("accountAccess")(accountAccess.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (containerAccess != null) __obj.updateDynamic("containerAccess")(containerAccess.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserAccess]
  }
}

