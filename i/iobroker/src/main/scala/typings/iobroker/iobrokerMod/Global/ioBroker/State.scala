package typings.iobroker.iobrokerMod.Global.ioBroker

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
  /** The value of the state. */
  var `val`: js.Any
}

object State {
  @scala.inline
  def apply(
    ack: Boolean,
    from: String,
    lc: Double,
    ts: Double,
    `val`: js.Any,
    c: String = null,
    expire: Int | Double = null,
    q: StateQuality = null
  ): State = {
    val __obj = js.Dynamic.literal(ack = ack, from = from, lc = lc, ts = ts)
    __obj.updateDynamic("val")(`val`)
    if (c != null) __obj.updateDynamic("c")(c)
    if (expire != null) __obj.updateDynamic("expire")(expire.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q)
    __obj.asInstanceOf[State]
  }
}

