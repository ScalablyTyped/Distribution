package typings.hoxy.anon

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
    down: js.UndefOr[Double] = js.undefined,
    latency: js.UndefOr[Double] = js.undefined,
    rate: js.UndefOr[Double] = js.undefined,
    up: js.UndefOr[Double] = js.undefined
  ): PartialSlow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(down)) __obj.updateDynamic("down")(down.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latency)) __obj.updateDynamic("latency")(latency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rate)) __obj.updateDynamic("rate")(rate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(up)) __obj.updateDynamic("up")(up.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSlow]
  }
}

