package typings.atLifeomicAttempt.atLifeomicAttemptMod

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
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), aborted = aborted, attemptNum = attemptNum, attemptsRemaining = attemptsRemaining)
  
    __obj.asInstanceOf[AttemptContext]
  }
}

