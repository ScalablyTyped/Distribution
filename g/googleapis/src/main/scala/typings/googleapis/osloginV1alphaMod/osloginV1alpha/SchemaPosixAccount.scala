package typings.googleapis.osloginV1alphaMod.osloginV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The POSIX account information associated with a Google account.
  */
@js.native
trait SchemaPosixAccount extends js.Object {
  /**
    * Output only. A POSIX account identifier.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The GECOS (user information) entry for this account.
    */
  var gecos: js.UndefOr[String] = js.native
  /**
    * The default group ID.
    */
  var gid: js.UndefOr[String] = js.native
  /**
    * The path to the home directory for this account.
    */
  var homeDirectory: js.UndefOr[String] = js.native
  /**
    * The operating system type where this account applies.
    */
  var operatingSystemType: js.UndefOr[String] = js.native
  /**
    * Only one POSIX account can be marked as primary.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * The path to the logic shell for this account.
    */
  var shell: js.UndefOr[String] = js.native
  /**
    * System identifier for which account the username or uid applies to. By
    * default, the empty value is used.
    */
  var systemId: js.UndefOr[String] = js.native
  /**
    * The user ID.
    */
  var uid: js.UndefOr[String] = js.native
  /**
    * The username of the POSIX account.
    */
  var username: js.UndefOr[String] = js.native
}

object SchemaPosixAccount {
  @scala.inline
  def apply(
    accountId: String = null,
    gecos: String = null,
    gid: String = null,
    homeDirectory: String = null,
    operatingSystemType: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    shell: String = null,
    systemId: String = null,
    uid: String = null,
    username: String = null
  ): SchemaPosixAccount = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (gecos != null) __obj.updateDynamic("gecos")(gecos.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (homeDirectory != null) __obj.updateDynamic("homeDirectory")(homeDirectory.asInstanceOf[js.Any])
    if (operatingSystemType != null) __obj.updateDynamic("operatingSystemType")(operatingSystemType.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.get.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (systemId != null) __obj.updateDynamic("systemId")(systemId.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPosixAccount]
  }
}

