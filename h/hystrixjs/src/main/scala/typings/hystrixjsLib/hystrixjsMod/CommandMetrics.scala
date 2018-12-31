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

