package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryOptions extends js.Object {
  var factor: js.UndefOr[scala.Double] = js.undefined
  var initialRetryTime: js.UndefOr[scala.Double] = js.undefined
  var maxRetryTime: js.UndefOr[scala.Double] = js.undefined
  var multiplier: js.UndefOr[scala.Double] = js.undefined
  var retries: js.UndefOr[scala.Double] = js.undefined
}

object RetryOptions {
  @scala.inline
  def apply(
    factor: scala.Int | scala.Double = null,
    initialRetryTime: scala.Int | scala.Double = null,
    maxRetryTime: scala.Int | scala.Double = null,
    multiplier: scala.Int | scala.Double = null,
    retries: scala.Int | scala.Double = null
  ): RetryOptions = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (initialRetryTime != null) __obj.updateDynamic("initialRetryTime")(initialRetryTime.asInstanceOf[js.Any])
    if (maxRetryTime != null) __obj.updateDynamic("maxRetryTime")(maxRetryTime.asInstanceOf[js.Any])
    if (multiplier != null) __obj.updateDynamic("multiplier")(multiplier.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryOptions]
  }
}

