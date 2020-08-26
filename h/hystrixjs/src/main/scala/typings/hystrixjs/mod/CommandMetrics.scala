package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandMetrics extends js.Object {
  def addExecutionTime(value: Double): Unit = js.native
  def decrementExecutionCount(): Unit = js.native
  def getCurrentExecutionCount(): Double = js.native
  def getExecutionTime(percentile: js.Any): Double = js.native
  def getHealthCounts(): HealthCounts = js.native
  def getRollingCount(`type`: js.Any): Double = js.native
  def incrementExecutionCount(): Unit = js.native
  def markFailure(): Unit = js.native
  def markRejected(): Unit = js.native
  def markShortCircuited(): Unit = js.native
  def markSuccess(): Unit = js.native
  def markTimeout(): Unit = js.native
  def reset(): Unit = js.native
}

object CommandMetrics {
  @scala.inline
  def apply(
    addExecutionTime: Double => Unit,
    decrementExecutionCount: () => Unit,
    getCurrentExecutionCount: () => Double,
    getExecutionTime: js.Any => Double,
    getHealthCounts: () => HealthCounts,
    getRollingCount: js.Any => Double,
    incrementExecutionCount: () => Unit,
    markFailure: () => Unit,
    markRejected: () => Unit,
    markShortCircuited: () => Unit,
    markSuccess: () => Unit,
    markTimeout: () => Unit,
    reset: () => Unit
  ): CommandMetrics = {
    val __obj = js.Dynamic.literal(addExecutionTime = js.Any.fromFunction1(addExecutionTime), decrementExecutionCount = js.Any.fromFunction0(decrementExecutionCount), getCurrentExecutionCount = js.Any.fromFunction0(getCurrentExecutionCount), getExecutionTime = js.Any.fromFunction1(getExecutionTime), getHealthCounts = js.Any.fromFunction0(getHealthCounts), getRollingCount = js.Any.fromFunction1(getRollingCount), incrementExecutionCount = js.Any.fromFunction0(incrementExecutionCount), markFailure = js.Any.fromFunction0(markFailure), markRejected = js.Any.fromFunction0(markRejected), markShortCircuited = js.Any.fromFunction0(markShortCircuited), markSuccess = js.Any.fromFunction0(markSuccess), markTimeout = js.Any.fromFunction0(markTimeout), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[CommandMetrics]
  }
  @scala.inline
  implicit class CommandMetricsOps[Self <: CommandMetrics] (val x: Self) extends AnyVal {
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
    def setAddExecutionTime(value: Double => Unit): Self = this.set("addExecutionTime", js.Any.fromFunction1(value))
    @scala.inline
    def setDecrementExecutionCount(value: () => Unit): Self = this.set("decrementExecutionCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCurrentExecutionCount(value: () => Double): Self = this.set("getCurrentExecutionCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetExecutionTime(value: js.Any => Double): Self = this.set("getExecutionTime", js.Any.fromFunction1(value))
    @scala.inline
    def setGetHealthCounts(value: () => HealthCounts): Self = this.set("getHealthCounts", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRollingCount(value: js.Any => Double): Self = this.set("getRollingCount", js.Any.fromFunction1(value))
    @scala.inline
    def setIncrementExecutionCount(value: () => Unit): Self = this.set("incrementExecutionCount", js.Any.fromFunction0(value))
    @scala.inline
    def setMarkFailure(value: () => Unit): Self = this.set("markFailure", js.Any.fromFunction0(value))
    @scala.inline
    def setMarkRejected(value: () => Unit): Self = this.set("markRejected", js.Any.fromFunction0(value))
    @scala.inline
    def setMarkShortCircuited(value: () => Unit): Self = this.set("markShortCircuited", js.Any.fromFunction0(value))
    @scala.inline
    def setMarkSuccess(value: () => Unit): Self = this.set("markSuccess", js.Any.fromFunction0(value))
    @scala.inline
    def setMarkTimeout(value: () => Unit): Self = this.set("markTimeout", js.Any.fromFunction0(value))
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
  
}

