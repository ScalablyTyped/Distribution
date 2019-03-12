package typings
package instabugDashReactnativeLib.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BugReportingStatic extends js.Object {
  def setShakingThresholdForAndroid(shakingThreshold: scala.Double): scala.Unit
  def setShakingThresholdForiPad(shakingThreshold: scala.Double): scala.Unit
  def setShakingThresholdForiPhone(shakingThreshold: scala.Double): scala.Unit
}

object BugReportingStatic {
  @scala.inline
  def apply(
    setShakingThresholdForAndroid: scala.Double => scala.Unit,
    setShakingThresholdForiPad: scala.Double => scala.Unit,
    setShakingThresholdForiPhone: scala.Double => scala.Unit
  ): BugReportingStatic = {
    val __obj = js.Dynamic.literal(setShakingThresholdForAndroid = js.Any.fromFunction1(setShakingThresholdForAndroid), setShakingThresholdForiPad = js.Any.fromFunction1(setShakingThresholdForiPad), setShakingThresholdForiPhone = js.Any.fromFunction1(setShakingThresholdForiPhone))
  
    __obj.asInstanceOf[BugReportingStatic]
  }
}

