package typings.jpm.sdkTimersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sdk/timers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearInterval(intervalID: INTERVAL_ID): Unit = js.native
  def clearTimeout(timerID: TIMEOUT_ID): Unit = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, _], timeoutMS: Double): INTERVAL_ID = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, _], timeoutMS: Double): TIMEOUT_ID = js.native
}

