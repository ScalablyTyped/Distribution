package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Account.
  */
@js.native
trait SchemaAccount extends js.Object {
  /**
    * The Account ID uniquely identifies the GTM Account.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The fingerprint of the GTM Account as computed at storage time. This
    * value is recomputed whenever the account is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * Account display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether the account shares data anonymously with Google and others.
    */
  var shareData: js.UndefOr[Boolean] = js.native
}

object SchemaAccount {
  @scala.inline
  def apply(
    accountId: String = null,
    fingerprint: String = null,
    name: String = null,
    shareData: js.UndefOr[Boolean] = js.undefined
  ): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(shareData)) __obj.updateDynamic("shareData")(shareData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccount]
  }
}

