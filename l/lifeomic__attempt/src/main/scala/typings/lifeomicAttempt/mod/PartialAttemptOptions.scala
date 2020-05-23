package typings.lifeomicAttempt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {readonly [ P in keyof @lifeomic/attempt.@lifeomic/attempt.AttemptOptions<T> ]:? @lifeomic/attempt.@lifeomic/attempt.AttemptOptions<T>[P]} */
trait PartialAttemptOptions[T] extends js.Object {
  val beforeAttempt: js.UndefOr[BeforeAttempt[T]] = js.undefined
  val calculateDelay: js.UndefOr[CalculateDelay[T]] = js.undefined
  val delay: js.UndefOr[Double] = js.undefined
  val factor: js.UndefOr[Double] = js.undefined
  val handleError: js.UndefOr[HandleError[T]] = js.undefined
  val handleTimeout: js.UndefOr[HandleTimeout[T]] = js.undefined
  val initialDelay: js.UndefOr[Double] = js.undefined
  val jitter: js.UndefOr[Boolean] = js.undefined
  val maxAttempts: js.UndefOr[Double] = js.undefined
  val maxDelay: js.UndefOr[Double] = js.undefined
  val minDelay: js.UndefOr[Double] = js.undefined
  val timeout: js.UndefOr[Double] = js.undefined
}

object PartialAttemptOptions {
  @scala.inline
  def apply[T](
    beforeAttempt: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit = null,
    calculateDelay: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Double = null,
    delay: js.UndefOr[Double] = js.undefined,
    factor: js.UndefOr[Double] = js.undefined,
    handleError: (/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit = null,
    handleTimeout: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => js.Promise[T] = null,
    initialDelay: js.UndefOr[Double] = js.undefined,
    jitter: js.UndefOr[Boolean] = js.undefined,
    maxAttempts: js.UndefOr[Double] = js.undefined,
    maxDelay: js.UndefOr[Double] = js.undefined,
    minDelay: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): PartialAttemptOptions[T] = {
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
    __obj.asInstanceOf[PartialAttemptOptions[T]]
  }
}

