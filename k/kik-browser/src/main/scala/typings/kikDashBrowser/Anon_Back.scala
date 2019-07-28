package typings.kikDashBrowser

import typings.kikDashBrowser.kikDashBrowserStrings.free
import typings.kikDashBrowser.kikDashBrowserStrings.landscape
import typings.kikDashBrowser.kikDashBrowserStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Back extends js.Object {
  var background: Boolean = js.native
  def back(callback: js.Function0[Boolean | Unit]): Unit = js.native
  def backlightTimeout(timeout: Boolean): Unit = js.native
  def getOrientationLock(): String = js.native
  def off(property: String, callback: js.Function0[Unit]): Unit = js.native
  def on(property: String, callback: js.Function0[Unit]): Unit = js.native
  def once(property: String, callback: js.Function0[Unit]): Unit = js.native
  def setOrientationLock(lock: String): Unit = js.native
  @JSName("setOrientationLock")
  def setOrientationLock_free(lock: free): Unit = js.native
  @JSName("setOrientationLock")
  def setOrientationLock_landscape(lock: landscape): Unit = js.native
  @JSName("setOrientationLock")
  def setOrientationLock_portrait(lock: portrait): Unit = js.native
  def statusBar(show: Boolean): Unit = js.native
  def trigger(property: String): Unit = js.native
  def trigger(property: String, data: js.Any): Unit = js.native
  def unbindBack(callback: js.Function0[Boolean | Unit]): Unit = js.native
}

