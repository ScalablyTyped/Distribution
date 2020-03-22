package typings.iobroker

import typings.iobroker.mod._Global_.ioBroker.StateQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<iobroker.iobroker._Global_.ioBroker.State> */
trait PartialState extends js.Object {
  var ack: js.UndefOr[Boolean] = js.undefined
  var c: js.UndefOr[String] = js.undefined
  var expire: js.UndefOr[Double] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var lc: js.UndefOr[Double] = js.undefined
  var q: js.UndefOr[StateQuality] = js.undefined
  var ts: js.UndefOr[Double] = js.undefined
  var `val`: js.UndefOr[js.Any] = js.undefined
}

object PartialState {
  @scala.inline
  def apply(
    ack: js.UndefOr[Boolean] = js.undefined,
    c: String = null,
    expire: Int | Double = null,
    from: String = null,
    lc: Int | Double = null,
    q: StateQuality = null,
    ts: Int | Double = null,
    `val`: js.Any = null
  ): PartialState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ack)) __obj.updateDynamic("ack")(ack.asInstanceOf[js.Any])
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    if (expire != null) __obj.updateDynamic("expire")(expire.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (lc != null) __obj.updateDynamic("lc")(lc.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    if (`val` != null) __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialState]
  }
}

