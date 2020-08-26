package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a POSIX account entry.
  */
@js.native
trait SchemaUserSshPublicKey extends js.Object {
  /**
    * An expiration time in microseconds since epoch.
    */
  var expirationTimeUsec: js.UndefOr[String] = js.native
  /**
    * A SHA-256 fingerprint of the SSH public key. (Read-only)
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * An SSH public key.
    */
  var key: js.UndefOr[String] = js.native
}

object SchemaUserSshPublicKey {
  @scala.inline
  def apply(): SchemaUserSshPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserSshPublicKey]
  }
  @scala.inline
  implicit class SchemaUserSshPublicKeyOps[Self <: SchemaUserSshPublicKey] (val x: Self) extends AnyVal {
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
    def setExpirationTimeUsec(value: String): Self = this.set("expirationTimeUsec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationTimeUsec: Self = this.set("expirationTimeUsec", js.undefined)
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

