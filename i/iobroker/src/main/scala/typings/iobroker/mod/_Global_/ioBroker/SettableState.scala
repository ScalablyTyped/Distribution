package typings.iobroker.mod._Global_.ioBroker

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Omit<iobroker.iobroker._Global_.ioBroker.State, 'val'>> & std.Pick<iobroker.iobroker._Global_.ioBroker.State, 'val'> */
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
    expire: Int | Double = null,
    from: String = null,
    lc: Int | Double = null,
    q: StateQuality = null,
    ts: Int | Double = null,
    user: String = null,
    `val`: String | Double | Boolean | js.Array[_] | (Record[String, _]) = null
  ): SettableState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ack)) __obj.updateDynamic("ack")(ack.asInstanceOf[js.Any])
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    if (expire != null) __obj.updateDynamic("expire")(expire.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (lc != null) __obj.updateDynamic("lc")(lc.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (`val` != null) __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableState]
  }
}

