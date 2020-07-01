package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Add an account with the permission specified. The role cannot be owner. If
  * an account already has a role in the matter, it will be overwritten.
  */
@js.native
trait SchemaAddMatterPermissionsRequest extends js.Object {
  /**
    * Only relevant if send_emails is true. True to CC requestor in the email
    * message. False to not CC requestor.
    */
  var ccMe: js.UndefOr[Boolean] = js.native
  /**
    * The MatterPermission to add.
    */
  var matterPermission: js.UndefOr[SchemaMatterPermission] = js.native
  /**
    * True to send notification email to the added account. False to not send
    * notification email.
    */
  var sendEmails: js.UndefOr[Boolean] = js.native
}

object SchemaAddMatterPermissionsRequest {
  @scala.inline
  def apply(
    ccMe: js.UndefOr[Boolean] = js.undefined,
    matterPermission: SchemaMatterPermission = null,
    sendEmails: js.UndefOr[Boolean] = js.undefined
  ): SchemaAddMatterPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ccMe)) __obj.updateDynamic("ccMe")(ccMe.get.asInstanceOf[js.Any])
    if (matterPermission != null) __obj.updateDynamic("matterPermission")(matterPermission.asInstanceOf[js.Any])
    if (!js.isUndefined(sendEmails)) __obj.updateDynamic("sendEmails")(sendEmails.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddMatterPermissionsRequest]
  }
}

