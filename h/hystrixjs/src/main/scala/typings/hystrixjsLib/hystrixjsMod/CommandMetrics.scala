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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addExecutionTime")(addExecutionTime)
    __obj.updateDynamic("decrementExecutionCount")(decrementExecutionCount)
    __obj.updateDynamic("getCurrentExecutionCount")(getCurrentExecutionCount)
    __obj.updateDynamic("getExecutionTime")(getExecutionTime)
    __obj.updateDynamic("getHealthCounts")(getHealthCounts)
    __obj.updateDynamic("getRollingCount")(getRollingCount)
    __obj.updateDynamic("incrementExecutionCount")(incrementExecutionCount)
    __obj.updateDynamic("markFailure")(markFailure)
    __obj.updateDynamic("markRejected")(markRejected)
    __obj.updateDynamic("markShortCircuited")(markShortCircuited)
    __obj.updateDynamic("markSuccess")(markSuccess)
    __obj.updateDynamic("markTimeout")(markTimeout)
    __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[CommandMetrics]
  }
}

