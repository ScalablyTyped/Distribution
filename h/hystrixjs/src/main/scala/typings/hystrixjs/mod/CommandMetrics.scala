package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandMetrics extends js.Object {
  def addExecutionTime(value: Double): Unit
  def decrementExecutionCount(): Unit
  def getCurrentExecutionCount(): Double
  def getExecutionTime(percentile: js.Any): Double
  def getHealthCounts(): HealthCounts
  def getRollingCount(`type`: js.Any): Double
  def incrementExecutionCount(): Unit
  def markFailure(): Unit
  def markRejected(): Unit
  def markShortCircuited(): Unit
  def markSuccess(): Unit
  def markTimeout(): Unit
  def reset(): Unit
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
}

