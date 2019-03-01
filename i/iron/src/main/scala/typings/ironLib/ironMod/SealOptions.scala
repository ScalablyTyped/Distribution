package typings
package ironLib.ironMod

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
  var localtimeOffsetMsec: scala.Double
  /**
    * number of seconds of permitted clock skew for incoming expirations. Defaults to 60 seconds.
    */
  var timestampSkewSec: scala.Double
  /**
    * sealed object lifetime in milliseconds where 0 means forever. Defaults to 0.
    */
  var ttl: scala.Double
}

object SealOptions {
  @scala.inline
  def apply(
    encryption: SealOptionsSub,
    integrity: SealOptionsSub,
    localtimeOffsetMsec: scala.Double,
    timestampSkewSec: scala.Double,
    ttl: scala.Double
  ): SealOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encryption")(encryption)
    __obj.updateDynamic("integrity")(integrity)
    __obj.updateDynamic("localtimeOffsetMsec")(localtimeOffsetMsec)
    __obj.updateDynamic("timestampSkewSec")(timestampSkewSec)
    __obj.updateDynamic("ttl")(ttl)
    __obj.asInstanceOf[SealOptions]
  }
}

