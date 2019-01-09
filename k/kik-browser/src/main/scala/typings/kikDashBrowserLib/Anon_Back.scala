package typings
package kikDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Back extends js.Object {
  var background: scala.Boolean = js.native
  def back(callback: js.Function0[scala.Boolean | scala.Unit]): scala.Unit = js.native
  def backlightTimeout(timeout: scala.Boolean): scala.Unit = js.native
  def getOrientationLock(): java.lang.String = js.native
  def off(property: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def on(property: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def once(property: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setOrientationLock(lock: java.lang.String): scala.Unit = js.native
  @JSName("setOrientationLock")
  def setOrientationLock_free(lock: kikDashBrowserLib.kikDashBrowserLibStrings.free): scala.Unit = js.native
  @JSName("setOrientationLock")
  def setOrientationLock_landscape(lock: kikDashBrowserLib.kikDashBrowserLibStrings.landscape): scala.Unit = js.native
  @JSName("setOrientationLock")
  def setOrientationLock_portrait(lock: kikDashBrowserLib.kikDashBrowserLibStrings.portrait): scala.Unit = js.native
  def statusBar(show: scala.Boolean): scala.Unit = js.native
  def trigger(property: java.lang.String): scala.Unit = js.native
  def trigger(property: java.lang.String, data: js.Any): scala.Unit = js.native
  def unbindBack(callback: js.Function0[scala.Boolean | scala.Unit]): scala.Unit = js.native
}

