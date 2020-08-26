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
  def apply(): SchemaPosixAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosixAccount]
  }
  @scala.inline
  implicit class SchemaPosixAccountOps[Self <: SchemaPosixAccount] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setGecos(value: String): Self = this.set("gecos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGecos: Self = this.set("gecos", js.undefined)
    @scala.inline
    def setGid(value: String): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    @scala.inline
    def setHomeDirectory(value: String): Self = this.set("homeDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeDirectory: Self = this.set("homeDirectory", js.undefined)
    @scala.inline
    def setOperatingSystemType(value: String): Self = this.set("operatingSystemType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystemType: Self = this.set("operatingSystemType", js.undefined)
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setShell(value: String): Self = this.set("shell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShell: Self = this.set("shell", js.undefined)
    @scala.inline
    def setSystemId(value: String): Self = this.set("systemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemId: Self = this.set("systemId", js.undefined)
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

