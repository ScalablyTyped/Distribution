package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandMetrics extends js.Object {
  def addExecutionTime(value: scala.Double): scala.Unit
  def decrementExecutionCount(): scala.Unit
  def getCurrentExecutionCount(): scala.Double
  def getExecutionTime(percentile: js.Any): scala.Double
  def getHealthCounts(): HealthCounts
  def getRollingCount(`type`: js.Any): scala.Double
  def incrementExecutionCount(): scala.Unit
  def markFailure(): scala.Unit
  def markRejected(): scala.Unit
  def markShortCircuited(): scala.Unit
  def markSuccess(): scala.Unit
  def markTimeout(): scala.Unit
  def reset(): scala.Unit
}

object CommandMetrics {
  @scala.inline
  def apply(
    addExecutionTime: scala.Double => scala.Unit,
    decrementExecutionCount: () => scala.Unit,
    getCurrentExecutionCount: () => scala.Double,
    getExecutionTime: js.Any => scala.Double,
    getHealthCounts: () => HealthCounts,
    getRollingCount: js.Any => scala.Double,
    incrementExecutionCount: () => scala.Unit,
    markFailure: () => scala.Unit,
    markRejected: () => scala.Unit,
    markShortCircuited: () => scala.Unit,
    markSuccess: () => scala.Unit,
    markTimeout: () => scala.Unit,
    reset: () => scala.Unit
  ): CommandMetrics = {
    val __obj = js.Dynamic.literal(addExecutionTime = js.Any.fromFunction1(addExecutionTime), decrementExecutionCount = js.Any.fromFunction0(decrementExecutionCount), getCurrentExecutionCount = js.Any.fromFunction0(getCurrentExecutionCount), getExecutionTime = js.Any.fromFunction1(getExecutionTime), getHealthCounts = js.Any.fromFunction0(getHealthCounts), getRollingCount = js.Any.fromFunction1(getRollingCount), incrementExecutionCount = js.Any.fromFunction0(incrementExecutionCount), markFailure = js.Any.fromFunction0(markFailure), markRejected = js.Any.fromFunction0(markRejected), markShortCircuited = js.Any.fromFunction0(markShortCircuited), markSuccess = js.Any.fromFunction0(markSuccess), markTimeout = js.Any.fromFunction0(markTimeout), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[CommandMetrics]
  }
}

