package typings.lifeomicAttempt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttemptContext extends js.Object {
  var aborted: Boolean = js.native
  var attemptNum: Double = js.native
  var attemptsRemaining: Double = js.native
  def abort(): Unit = js.native
}

object AttemptContext {
  @scala.inline
  def apply(abort: () => Unit, aborted: Boolean, attemptNum: Double, attemptsRemaining: Double): AttemptContext = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), aborted = aborted.asInstanceOf[js.Any], attemptNum = attemptNum.asInstanceOf[js.Any], attemptsRemaining = attemptsRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttemptContext]
  }
  @scala.inline
  implicit class AttemptContextOps[Self <: AttemptContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    @scala.inline
    def setAborted(value: Boolean): Self = this.set("aborted", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttemptNum(value: Double): Self = this.set("attemptNum", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttemptsRemaining(value: Double): Self = this.set("attemptsRemaining", value.asInstanceOf[js.Any])
  }
  
}

