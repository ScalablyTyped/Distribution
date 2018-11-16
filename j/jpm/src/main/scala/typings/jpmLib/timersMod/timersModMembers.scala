package typings
package jpmLib.timersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sdk/timers", JSImport.Namespace)
@js.native
object timersModMembers extends js.Object {
  def clearInterval(intervalID: INTERVAL_ID): scala.Unit = js.native
  def clearTimeout(timerID: TIMEOUT_ID): scala.Unit = js.native
  def setInterval(callback: js.Function1[/* repeated */js.Any, _], timeoutMS: scala.Double): INTERVAL_ID = js.native
  def setTimeout(callback: js.Function1[/* repeated */js.Any, _], timeoutMS: scala.Double): TIMEOUT_ID = js.native
}

