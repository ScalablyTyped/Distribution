package typings.iobroker

import typings.iobroker.mod._Global_.ioBroker.StateQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined iobroker.iobroker._Global_.ioBroker.State & {  id ? :string} */
trait Stateidstring extends js.Object {
  /** Direction flag: false for desired value and true for actual value. Default: false. */
  var ack: Boolean
  /** Optional comment */
  var c: js.UndefOr[String] = js.undefined
  /** Optional time in seconds after which the state is reset to null */
  var expire: js.UndefOr[Double] = js.undefined
  /** Name of the adapter instance which set the value, e.g. "system.adapter.web.0" */
  var from: String
  var id: js.UndefOr[String] = js.undefined
  /** Unix timestamp of the last time the value changed */
  var lc: Double
  /** Optional quality of the state value */
  var q: js.UndefOr[StateQuality] = js.undefined
  /** Unix timestamp. Default: current time */
  var ts: Double
  /** The value of the state. */
  var `val`: js.Any
}

object Stateidstring {
  @scala.inline
  def apply(
    ack: Boolean,
    from: String,
    lc: Double,
    ts: Double,
    `val`: js.Any,
    c: String = null,
    expire: Int | Double = null,
    id: String = null,
    q: StateQuality = null
  ): Stateidstring = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], lc = lc.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    if (expire != null) __obj.updateDynamic("expire")(expire.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stateidstring]
  }
}

