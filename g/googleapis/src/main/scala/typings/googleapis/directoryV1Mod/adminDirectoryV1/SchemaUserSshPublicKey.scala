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
  def apply(expirationTimeUsec: String = null, fingerprint: String = null, key: String = null): SchemaUserSshPublicKey = {
    val __obj = js.Dynamic.literal()
    if (expirationTimeUsec != null) __obj.updateDynamic("expirationTimeUsec")(expirationTimeUsec.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserSshPublicKey]
  }
}

