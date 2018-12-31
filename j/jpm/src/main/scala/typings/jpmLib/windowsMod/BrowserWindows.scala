package typings
package jpmLib.windowsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserWindows
  extends stdLib.Array[jpmLib.FFAddonSDKNs.BrowserWindow] {
  var activeWindow: jpmLib.FFAddonSDKNs.BrowserWindow = js.native
  @JSName("on")
  def on_activate(
    event: jpmLib.jpmLibStrings.activate,
    handler: js.Function1[/* window */ jpmLib.FFAddonSDKNs.BrowserWindow, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_close(
    event: jpmLib.jpmLibStrings.close,
    handler: js.Function1[/* window */ jpmLib.FFAddonSDKNs.BrowserWindow, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_deactivate(
    event: jpmLib.jpmLibStrings.deactivate,
    handler: js.Function1[/* window */ jpmLib.FFAddonSDKNs.BrowserWindow, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_open(
    event: jpmLib.jpmLibStrings.open,
    handler: js.Function1[/* window */ jpmLib.FFAddonSDKNs.BrowserWindow, _]
  ): scala.Unit = js.native
  /**
    * Open a new window
    * @param options.isPrivate determines whether the new window should be private or not
    */
  def open(options: java.lang.String): jpmLib.FFAddonSDKNs.BrowserWindow = js.native
  def open(options: jpmLib.Anon_OnActivate): jpmLib.FFAddonSDKNs.BrowserWindow = js.native
}

