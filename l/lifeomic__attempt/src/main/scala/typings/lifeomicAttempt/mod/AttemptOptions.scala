package typings.lifeomicAttempt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttemptOptions[T] extends js.Object {
  val beforeAttempt: BeforeAttempt[T] | Null
  val calculateDelay: CalculateDelay[T] | Null
  val delay: Double
  val factor: Double
  val handleError: HandleError[T] | Null
  val handleTimeout: HandleTimeout[T] | Null
  val initialDelay: Double
  val jitter: Boolean
  val maxAttempts: Double
  val maxDelay: Double
  val minDelay: Double
  val timeout: Double
}

object AttemptOptions {
  @scala.inline
  def apply[T](
    delay: Double,
    factor: Double,
    initialDelay: Double,
    jitter: Boolean,
    maxAttempts: Double,
    maxDelay: Double,
    minDelay: Double,
    timeout: Double,
    beforeAttempt: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit = null,
    calculateDelay: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Double = null,
    handleError: (/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit = null,
    handleTimeout: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => js.Promise[T] = null
  ): AttemptOptions[T] = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], factor = factor.asInstanceOf[js.Any], initialDelay = initialDelay.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], maxAttempts = maxAttempts.asInstanceOf[js.Any], maxDelay = maxDelay.asInstanceOf[js.Any], minDelay = minDelay.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], beforeAttempt = js.Any.fromFunction2(beforeAttempt), calculateDelay = js.Any.fromFunction2(calculateDelay), handleError = js.Any.fromFunction3(handleError), handleTimeout = js.Any.fromFunction2(handleTimeout))
    __obj.asInstanceOf[AttemptOptions[T]]
  }
}

