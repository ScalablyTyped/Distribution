package typings.iobroker.mod.global.ioBroker

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Omit<iobroker.iobroker.<global>.ioBroker.State, 'val'>> & std.Pick<iobroker.iobroker.<global>.ioBroker.State, 'val'> */
trait SettableState extends js.Object {
  var ack: js.UndefOr[Boolean] = js.undefined
  var c: js.UndefOr[String] = js.undefined
  var expire: js.UndefOr[Double] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var lc: js.UndefOr[Double] = js.undefined
  var q: js.UndefOr[StateQuality] = js.undefined
  var ts: js.UndefOr[Double] = js.undefined
  var user: js.UndefOr[String] = js.undefined
  var `val`: js.UndefOr[String | Double | Boolean | js.Array[_] | (Record[String, _])] = js.undefined
}

object SettableState {
  @scala.inline
  def apply(
    ack: js.UndefOr[Boolean] = js.undefined,
    c: String = null,
    expire: js.UndefOr[Double] = js.undefined,
    from: String = null,
    lc: js.UndefOr[Double] = js.undefined,
    q: StateQuality = null,
    ts: js.UndefOr[Double] = js.undefined,
    user: String = null,
    `val`: String | Double | Boolean | js.Array[_] | (Record[String, _]) = null
  ): SettableState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ack)) __obj.updateDynamic("ack")(ack.get.asInstanceOf[js.Any])
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    if (!js.isUndefined(expire)) __obj.updateDynamic("expire")(expire.get.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(lc)) __obj.updateDynamic("lc")(lc.get.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (!js.isUndefined(ts)) __obj.updateDynamic("ts")(ts.get.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (`val` != null) __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableState]
  }
}

