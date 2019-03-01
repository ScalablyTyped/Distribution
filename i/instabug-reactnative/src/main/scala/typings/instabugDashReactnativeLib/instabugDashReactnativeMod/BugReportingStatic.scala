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
    setShakingThresholdForAndroid: js.Function1[scala.Double, scala.Unit],
    setShakingThresholdForiPad: js.Function1[scala.Double, scala.Unit],
    setShakingThresholdForiPhone: js.Function1[scala.Double, scala.Unit]
  ): BugReportingStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setShakingThresholdForAndroid")(setShakingThresholdForAndroid)
    __obj.updateDynamic("setShakingThresholdForiPad")(setShakingThresholdForiPad)
    __obj.updateDynamic("setShakingThresholdForiPhone")(setShakingThresholdForiPhone)
    __obj.asInstanceOf[BugReportingStatic]
  }
}

