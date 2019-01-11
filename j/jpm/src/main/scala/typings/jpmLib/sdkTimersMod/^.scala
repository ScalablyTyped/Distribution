package typings
package jpmLib.sdkTimersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sdk/timers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearInterval(intervalID: jpmLib.sdkTimersMod.INTERVAL_ID): scala.Unit = js.native
  def clearTimeout(timerID: jpmLib.sdkTimersMod.TIMEOUT_ID): scala.Unit = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, _], timeoutMS: scala.Double): jpmLib.sdkTimersMod.INTERVAL_ID = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, _], timeoutMS: scala.Double): jpmLib.sdkTimersMod.TIMEOUT_ID = js.native
}

