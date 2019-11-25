package typings.iron.ironMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SealOptions extends js.Object {
  /**
    * defines the options used by the encryption process.
    */
  var encryption: SealOptionsSub
  /**
    * defines the options used by the HMAC integrity verification process.
    */
  var integrity: SealOptionsSub
  /**
    * local clock time offset, expressed in number of milliseconds (positive or negative). Defaults to 0.
    */
  var localtimeOffsetMsec: Double
  /**
    * number of seconds of permitted clock skew for incoming expirations. Defaults to 60 seconds.
    */
  var timestampSkewSec: Double
  /**
    * sealed object lifetime in milliseconds where 0 means forever. Defaults to 0.
    */
  var ttl: Double
}

object SealOptions {
  @scala.inline
  def apply(
    encryption: SealOptionsSub,
    integrity: SealOptionsSub,
    localtimeOffsetMsec: Double,
    timestampSkewSec: Double,
    ttl: Double
  ): SealOptions = {
    val __obj = js.Dynamic.literal(encryption = encryption.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any], localtimeOffsetMsec = localtimeOffsetMsec.asInstanceOf[js.Any], timestampSkewSec = timestampSkewSec.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SealOptions]
  }
}

