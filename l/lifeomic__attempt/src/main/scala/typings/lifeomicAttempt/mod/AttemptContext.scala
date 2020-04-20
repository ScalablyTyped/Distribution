package typings.lifeomicAttempt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttemptContext extends js.Object {
  var aborted: Boolean
  var attemptNum: Double
  var attemptsRemaining: Double
  def abort(): Unit
}

object AttemptContext {
  @scala.inline
  def apply(abort: () => Unit, aborted: Boolean, attemptNum: Double, attemptsRemaining: Double): AttemptContext = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), aborted = aborted.asInstanceOf[js.Any], attemptNum = attemptNum.asInstanceOf[js.Any], attemptsRemaining = attemptsRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttemptContext]
  }
}

