package typings.hapiHawk.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageOptions extends js.Object {
  var credentials: Credentials
  /** Time offset to sync with server time (ignored if timestamp provided) */
  var localtimeOffsetMsec: Double
  /** A pre-generated nonce */
  var nonce: String
  /** A pre-calculated timestamp in seconds */
  var timestamp: Double
}

object MessageOptions {
  @scala.inline
  def apply(credentials: Credentials, localtimeOffsetMsec: Double, nonce: String, timestamp: Double): MessageOptions = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], localtimeOffsetMsec = localtimeOffsetMsec.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageOptions]
  }
}

