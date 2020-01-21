package typings.instagramPrivateApi

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
    delay: Int | Double = null,
    factor: Int | Double = null,
    handleError: (/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[_]) => Unit = null,
    handleTimeout: (/* context */ AttemptContext, /* options */ AttemptOptions[_]) => js.Promise[_] = null,
    initialDelay: Int | Double = null,
    jitter: js.UndefOr[Boolean] = js.undefined,
    maxAttempts: Int | Double = null,
    maxDelay: Int | Double = null,
    minDelay: Int | Double = null,
    timeout: Int | Double = null
  ): PartialAttemptOptionsany = {
    val __obj = js.Dynamic.literal()
    if (beforeAttempt != null) __obj.updateDynamic("beforeAttempt")(js.Any.fromFunction2(beforeAttempt))
    if (calculateDelay != null) __obj.updateDynamic("calculateDelay")(js.Any.fromFunction2(calculateDelay))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (handleError != null) __obj.updateDynamic("handleError")(js.Any.fromFunction3(handleError))
    if (handleTimeout != null) __obj.updateDynamic("handleTimeout")(js.Any.fromFunction2(handleTimeout))
    if (initialDelay != null) __obj.updateDynamic("initialDelay")(initialDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(jitter)) __obj.updateDynamic("jitter")(jitter.asInstanceOf[js.Any])
    if (maxAttempts != null) __obj.updateDynamic("maxAttempts")(maxAttempts.asInstanceOf[js.Any])
    if (maxDelay != null) __obj.updateDynamic("maxDelay")(maxDelay.asInstanceOf[js.Any])
    if (minDelay != null) __obj.updateDynamic("minDelay")(minDelay.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAttemptOptionsany]
  }
}

