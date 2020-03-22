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
    delay: Int | Double = null,
    factor: Int | Double = null,
    handleError: (/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit = null,
    handleTimeout: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => js.Promise[T] = null,
    initialDelay: Int | Double = null,
    jitter: js.UndefOr[Boolean] = js.undefined,
    maxAttempts: Int | Double = null,
    maxDelay: Int | Double = null,
    minDelay: Int | Double = null,
    timeout: Int | Double = null
  ): PartialAttemptOptions[T] = {
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
    __obj.asInstanceOf[PartialAttemptOptions[T]]
  }
}

