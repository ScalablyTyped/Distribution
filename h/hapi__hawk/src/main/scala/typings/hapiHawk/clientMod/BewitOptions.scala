package typings.hapiHawk.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BewitOptions extends js.Object {
  var credentials: Credentials = js.native
  /** Application specific data sent via the ext attribute */
  var ext: js.UndefOr[String] = js.native
  /** Time offset to sync with server time */
  var localtimeOffsetMsec: Double = js.native
  /** TTL in seconds */
  var ttlSec: Double = js.native
}

object BewitOptions {
  @scala.inline
  def apply(credentials: Credentials, localtimeOffsetMsec: Double, ttlSec: Double): BewitOptions = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], localtimeOffsetMsec = localtimeOffsetMsec.asInstanceOf[js.Any], ttlSec = ttlSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[BewitOptions]
  }
  @scala.inline
  implicit class BewitOptionsOps[Self <: BewitOptions] (val x: Self) extends AnyVal {
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
    def setCredentials(value: Credentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocaltimeOffsetMsec(value: Double): Self = this.set("localtimeOffsetMsec", value.asInstanceOf[js.Any])
    @scala.inline
    def setTtlSec(value: Double): Self = this.set("ttlSec", value.asInstanceOf[js.Any])
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
  }
  
}

