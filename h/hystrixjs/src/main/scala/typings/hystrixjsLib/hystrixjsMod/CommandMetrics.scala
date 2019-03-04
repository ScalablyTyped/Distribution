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
    addExecutionTime: js.Function1[scala.Double, scala.Unit],
    decrementExecutionCount: js.Function0[scala.Unit],
    getCurrentExecutionCount: js.Function0[scala.Double],
    getExecutionTime: js.Function1[js.Any, scala.Double],
    getHealthCounts: js.Function0[HealthCounts],
    getRollingCount: js.Function1[js.Any, scala.Double],
    incrementExecutionCount: js.Function0[scala.Unit],
    markFailure: js.Function0[scala.Unit],
    markRejected: js.Function0[scala.Unit],
    markShortCircuited: js.Function0[scala.Unit],
    markSuccess: js.Function0[scala.Unit],
    markTimeout: js.Function0[scala.Unit],
    reset: js.Function0[scala.Unit]
  ): CommandMetrics = {
    val __obj = js.Dynamic.literal(addExecutionTime = addExecutionTime, decrementExecutionCount = decrementExecutionCount, getCurrentExecutionCount = getCurrentExecutionCount, getExecutionTime = getExecutionTime, getHealthCounts = getHealthCounts, getRollingCount = getRollingCount, incrementExecutionCount = incrementExecutionCount, markFailure = markFailure, markRejected = markRejected, markShortCircuited = markShortCircuited, markSuccess = markSuccess, markTimeout = markTimeout, reset = reset)
  
    __obj.asInstanceOf[CommandMetrics]
  }
}

