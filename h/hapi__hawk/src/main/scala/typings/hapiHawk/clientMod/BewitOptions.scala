package typings.hapiHawk.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BewitOptions extends js.Object {
  var credentials: Credentials
  /** Application specific data sent via the ext attribute */
  var ext: js.UndefOr[String] = js.undefined
  /** Time offset to sync with server time */
  var localtimeOffsetMsec: Double
  /** TTL in seconds */
  var ttlSec: Double
}

object BewitOptions {
  @scala.inline
  def apply(credentials: Credentials, localtimeOffsetMsec: Double, ttlSec: Double, ext: String = null): BewitOptions = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], localtimeOffsetMsec = localtimeOffsetMsec.asInstanceOf[js.Any], ttlSec = ttlSec.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[BewitOptions]
  }
}

