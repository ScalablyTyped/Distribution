package typings.instagramPrivateApi.anon

import typings.lifeomicAttempt.mod.AttemptContext
import typings.lifeomicAttempt.mod.AttemptOptions
import typings.lifeomicAttempt.mod.BeforeAttempt
import typings.lifeomicAttempt.mod.CalculateDelay
import typings.lifeomicAttempt.mod.HandleError
import typings.lifeomicAttempt.mod.HandleTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@lifeomic/attempt.@lifeomic/attempt.AttemptOptions<any>> */
trait PartialAttemptOptionsany extends js.Object {
  var beforeAttempt: js.UndefOr[BeforeAttempt[_]] = js.undefined
  var calculateDelay: js.UndefOr[CalculateDelay[_]] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var factor: js.UndefOr[Double] = js.undefined
  var handleError: js.UndefOr[HandleError[_]] = js.undefined
  var handleTimeout: js.UndefOr[HandleTimeout[_]] = js.undefined
  var initialDelay: js.UndefOr[Double] = js.undefined
  var jitter: js.UndefOr[Boolean] = js.undefined
  var maxAttempts: js.UndefOr[Double] = js.undefined
  var maxDelay: js.UndefOr[Double] = js.undefined
  var minDelay: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialAttemptOptionsany {
  @scala.inline
  def apply(
    beforeAttempt: (/* context */ AttemptContext, /* options */ AttemptOptions[_]) => Unit = null,
    calculateDelay: (/* context */ AttemptContext, /* options */ AttemptOptions[_]) => Double = null,
    delay: js.UndefOr[Double] = js.undefined,
    factor: js.UndefOr[Double] = js.undefined,
    handleError: (/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[_]) => Unit = null,
    handleTimeout: (/* context */ AttemptContext, /* options */ AttemptOptions[_]) => js.Promise[_] = null,
    initialDelay: js.UndefOr[Double] = js.undefined,
    jitter: js.UndefOr[Boolean] = js.undefined,
    maxAttempts: js.UndefOr[Double] = js.undefined,
    maxDelay: js.UndefOr[Double] = js.undefined,
    minDelay: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): PartialAttemptOptionsany = {
    val __obj = js.Dynamic.literal()
    if (beforeAttempt != null) __obj.updateDynamic("beforeAttempt")(js.Any.fromFunction2(beforeAttempt))
    if (calculateDelay != null) __obj.updateDynamic("calculateDelay")(js.Any.fromFunction2(calculateDelay))
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor.get.asInstanceOf[js.Any])
    if (handleError != null) __obj.updateDynamic("handleError")(js.Any.fromFunction3(handleError))
    if (handleTimeout != null) __obj.updateDynamic("handleTimeout")(js.Any.fromFunction2(handleTimeout))
    if (!js.isUndefined(initialDelay)) __obj.updateDynamic("initialDelay")(initialDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(jitter)) __obj.updateDynamic("jitter")(jitter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAttempts)) __obj.updateDynamic("maxAttempts")(maxAttempts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDelay)) __obj.updateDynamic("maxDelay")(maxDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDelay)) __obj.updateDynamic("minDelay")(minDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAttemptOptionsany]
  }
}

