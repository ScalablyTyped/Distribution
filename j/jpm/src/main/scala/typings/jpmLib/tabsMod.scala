package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Open, manipulate, and access tabs, and receive tab events
 */
@JSImport("sdk/tabs", JSImport.Namespace)
@js.native
object tabsMod extends js.Object {
  val activeTab: jpmLib.FFAddonSDKNs.Tab = js.native
  val length: scala.Double = js.native
  @JSName("on")
  def on_activate(event: jpmLib.jpmLibStrings.activate, handler: js.Function1[/* tab */ jpmLib.FFAddonSDKNs.Tab, _]): scala.Unit = js.native
  @JSName("on")
  def on_close(event: jpmLib.jpmLibStrings.close, handler: js.Function1[/* tab */ jpmLib.FFAddonSDKNs.Tab, _]): scala.Unit = js.native
  @JSName("on")
  def on_deactivate(
    event: jpmLib.jpmLibStrings.deactivate,
    handler: js.Function1[/* tab */ jpmLib.FFAddonSDKNs.Tab, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_load(event: jpmLib.jpmLibStrings.load, handler: js.Function1[/* tab */ jpmLib.FFAddonSDKNs.Tab, _]): scala.Unit = js.native
  @JSName("on")
  def on_open(event: jpmLib.jpmLibStrings.open, handler: js.Function1[/* tab */ jpmLib.FFAddonSDKNs.Tab, _]): scala.Unit = js.native
  @JSName("on")
  def on_pageshow(event: jpmLib.jpmLibStrings.pageshow, handler: js.Function1[/* tab */ jpmLib.FFAddonSDKNs.Tab, _]): scala.Unit = js.native
  @JSName("on")
  def on_ready(event: jpmLib.jpmLibStrings.ready, handler: js.Function1[/* tab */ jpmLib.FFAddonSDKNs.Tab, _]): scala.Unit = js.native
  def open(options: java.lang.String): scala.Unit = js.native
  def open(options: jpmLib.Anon_InNewWindow): scala.Unit = js.native
}

