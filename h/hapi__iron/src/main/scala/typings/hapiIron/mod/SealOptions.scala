package typings.hapiIron.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SealOptions extends js.Object {
  /**
    Encryption step options.
    */
  var encryption: SealOptionsSub
  /**
    Integrity step options.
    */
  var integrity: SealOptionsSub
  /**
    Local clock time offset, expressed in number of milliseconds (positive or negative). Defaults to 0.
    */
  var localtimeOffsetMsec: Double
  /**
    Number of seconds of permitted clock skew for incoming expirations. Defaults to 60 seconds.
    */
  var timestampSkewSec: Double
  /**
    Sealed object lifetime in milliseconds where 0 means forever. Defaults to 0.
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

