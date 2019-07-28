package typings.instabugDashReactnative.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BugReportingStatic extends js.Object {
  def setShakingThresholdForAndroid(shakingThreshold: Double): Unit
  def setShakingThresholdForiPad(shakingThreshold: Double): Unit
  def setShakingThresholdForiPhone(shakingThreshold: Double): Unit
}

object BugReportingStatic {
  @scala.inline
  def apply(
    setShakingThresholdForAndroid: Double => Unit,
    setShakingThresholdForiPad: Double => Unit,
    setShakingThresholdForiPhone: Double => Unit
  ): BugReportingStatic = {
    val __obj = js.Dynamic.literal(setShakingThresholdForAndroid = js.Any.fromFunction1(setShakingThresholdForAndroid), setShakingThresholdForiPad = js.Any.fromFunction1(setShakingThresholdForiPad), setShakingThresholdForiPhone = js.Any.fromFunction1(setShakingThresholdForiPhone))
  
    __obj.asInstanceOf[BugReportingStatic]
  }
}

