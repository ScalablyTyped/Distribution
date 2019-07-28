package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryOptions extends js.Object {
  var factor: js.UndefOr[Double] = js.undefined
  var initialRetryTime: js.UndefOr[Double] = js.undefined
  var maxInFlightRequests: js.UndefOr[Double | Null] = js.undefined
  var maxRetryTime: js.UndefOr[Double] = js.undefined
  var multiplier: js.UndefOr[Double] = js.undefined
  var retries: js.UndefOr[Double] = js.undefined
}

object RetryOptions {
  @scala.inline
  def apply(
    factor: Int | Double = null,
    initialRetryTime: Int | Double = null,
    maxInFlightRequests: Int | Double = null,
    maxRetryTime: Int | Double = null,
    multiplier: Int | Double = null,
    retries: Int | Double = null
  ): RetryOptions = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (initialRetryTime != null) __obj.updateDynamic("initialRetryTime")(initialRetryTime.asInstanceOf[js.Any])
    if (maxInFlightRequests != null) __obj.updateDynamic("maxInFlightRequests")(maxInFlightRequests.asInstanceOf[js.Any])
    if (maxRetryTime != null) __obj.updateDynamic("maxRetryTime")(maxRetryTime.asInstanceOf[js.Any])
    if (multiplier != null) __obj.updateDynamic("multiplier")(multiplier.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryOptions]
  }
}

