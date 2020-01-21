package typings.googleapis.osloginV1alphaMod.osloginV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The SSH public key information associated with a Google account.
  */
@js.native
trait SchemaSshPublicKey extends js.Object {
  /**
    * An expiration time in microseconds since epoch.
    */
  var expirationTimeUsec: js.UndefOr[String] = js.native
  /**
    * Output only. The SHA-256 fingerprint of the SSH public key.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * Public key text in SSH format, defined by &lt;a
    * href=&quot;https://www.ietf.org/rfc/rfc4253.txt&quot;
    * target=&quot;_blank&quot;&gt;RFC4253&lt;/a&gt; section 6.6.
    */
  var key: js.UndefOr[String] = js.native
}

object SchemaSshPublicKey {
  @scala.inline
  def apply(expirationTimeUsec: String = null, fingerprint: String = null, key: String = null): SchemaSshPublicKey = {
    val __obj = js.Dynamic.literal()
    if (expirationTimeUsec != null) __obj.updateDynamic("expirationTimeUsec")(expirationTimeUsec.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSshPublicKey]
  }
}

