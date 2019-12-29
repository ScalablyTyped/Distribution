package typings.jpm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set one-off and periodic timers
  */
@JSImport("sdk/timers", JSImport.Namespace)
@js.native
object sdkTimersMod extends js.Object {
  def clearInterval(intervalID: INTERVAL_ID): Unit = js.native
  def clearTimeout(timerID: TIMEOUT_ID): Unit = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, _], timeoutMS: Double): INTERVAL_ID = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, _], timeoutMS: Double): TIMEOUT_ID = js.native
  type INTERVAL_ID = Double
  type TIMEOUT_ID = Double
}

