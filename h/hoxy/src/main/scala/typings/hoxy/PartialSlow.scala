package typings.hoxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<hoxy.hoxy.Slow> */
trait PartialSlow extends js.Object {
  var down: js.UndefOr[Double] = js.undefined
  var latency: js.UndefOr[Double] = js.undefined
  var rate: js.UndefOr[Double] = js.undefined
  var up: js.UndefOr[Double] = js.undefined
}

object PartialSlow {
  @scala.inline
  def apply(
    down: Int | Double = null,
    latency: Int | Double = null,
    rate: Int | Double = null,
    up: Int | Double = null
  ): PartialSlow = {
    val __obj = js.Dynamic.literal()
    if (down != null) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    if (latency != null) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSlow]
  }
}

