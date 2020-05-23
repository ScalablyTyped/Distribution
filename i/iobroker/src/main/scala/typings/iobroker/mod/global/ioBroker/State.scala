package typings.iobroker.mod.global.ioBroker

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  /** Direction flag: false for desired value and true for actual value. Default: false. */
  var ack: Boolean
  /** Optional comment */
  var c: js.UndefOr[String] = js.undefined
  /** Optional time in seconds after which the state is reset to null */
  var expire: js.UndefOr[Double] = js.undefined
  /** Name of the adapter instance which set the value, e.g. "system.adapter.web.0" */
  var from: String
  /** Unix timestamp of the last time the value changed */
  var lc: Double
  /** Optional quality of the state value */
  var q: js.UndefOr[StateQuality] = js.undefined
  /** Unix timestamp. Default: current time */
  var ts: Double
  /** The user who set this value */
  var user: js.UndefOr[String] = js.undefined
  /** The value of the state. */
  var `val`: String | Double | Boolean | js.Array[_] | (Record[String, _]) | Null
}

object State {
  @scala.inline
  def apply(
    ack: Boolean,
    from: String,
    lc: Double,
    ts: Double,
    c: String = null,
    expire: js.UndefOr[Double] = js.undefined,
    q: StateQuality = null,
    user: String = null,
    `val`: String | Double | Boolean | js.Array[_] | (Record[String, _]) = null
  ): State = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], lc = lc.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    if (!js.isUndefined(expire)) __obj.updateDynamic("expire")(expire.get.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

