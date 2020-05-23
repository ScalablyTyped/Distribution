package typings.luminoPolling.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@lumino/polling.@lumino/polling.IPoll.Frequency> */
trait PartialFrequency extends js.Object {
  var backoff: js.UndefOr[Boolean | Double] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
}

object PartialFrequency {
  @scala.inline
  def apply(
    backoff: Boolean | Double = null,
    interval: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined
  ): PartialFrequency = {
    val __obj = js.Dynamic.literal()
    if (backoff != null) __obj.updateDynamic("backoff")(backoff.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFrequency]
  }
}

