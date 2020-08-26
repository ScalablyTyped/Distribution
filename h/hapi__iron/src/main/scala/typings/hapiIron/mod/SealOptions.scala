package typings.hapiIron.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SealOptions extends js.Object {
  /**
    Encryption step options.
    */
  var encryption: SealOptionsSub = js.native
  /**
    Integrity step options.
    */
  var integrity: SealOptionsSub = js.native
  /**
    Local clock time offset, expressed in number of milliseconds (positive or negative). Defaults to 0.
    */
  var localtimeOffsetMsec: Double = js.native
  /**
    Number of seconds of permitted clock skew for incoming expirations. Defaults to 60 seconds.
    */
  var timestampSkewSec: Double = js.native
  /**
    Sealed object lifetime in milliseconds where 0 means forever. Defaults to 0.
    */
  var ttl: Double = js.native
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
  @scala.inline
  implicit class SealOptionsOps[Self <: SealOptions] (val x: Self) extends AnyVal {
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
    def setEncryption(value: SealOptionsSub): Self = this.set("encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntegrity(value: SealOptionsSub): Self = this.set("integrity", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocaltimeOffsetMsec(value: Double): Self = this.set("localtimeOffsetMsec", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestampSkewSec(value: Double): Self = this.set("timestampSkewSec", value.asInstanceOf[js.Any])
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
  }
  
}

