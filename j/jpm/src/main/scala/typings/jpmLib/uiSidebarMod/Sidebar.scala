package typings
package jpmLib.uiSidebarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sidebar extends js.Object {
  var id: java.lang.String = js.native
  var title: java.lang.String = js.native
  var url: java.lang.String = js.native
  def dispose(): scala.Unit = js.native
  def hide(): scala.Unit = js.native
  def hide(window: jpmLib.FFAddonSDKNs.BrowserWindow): scala.Unit = js.native
  @JSName("on")
  def on_attach(event: jpmLib.jpmLibStrings.attach, handler: js.Function1[/* worker */ SidebarWorker, _]): scala.Unit = js.native
  @JSName("on")
  def on_detach(event: jpmLib.jpmLibStrings.detach, handler: js.Function1[/* worker */ SidebarWorker, _]): scala.Unit = js.native
  @JSName("on")
  def on_hide(event: jpmLib.jpmLibStrings.hide, handler: js.Function1[/* worker */ SidebarWorker, _]): scala.Unit = js.native
  @JSName("on")
  def on_ready(event: jpmLib.jpmLibStrings.ready, handler: js.Function1[/* worker */ SidebarWorker, _]): scala.Unit = js.native
  @JSName("on")
  def on_show(event: jpmLib.jpmLibStrings.show, handler: js.Function1[/* worker */ SidebarWorker, _]): scala.Unit = js.native
  @JSName("once")
  def once_attach(event: jpmLib.jpmLibStrings.attach, handler: js.Function1[/* worker */ SidebarWorker, _]): scala.Unit = js.native
  @JSName("once")
  def once_detach(event: jpmLib.jpmLibStrings.detach, handler: js.Function1[/* worker */ SidebarWorker, _]): scala.Unit = js.native
  @JSName("once")
  def once_hide(event: jpmLib.jpmLibStrings.hide, handler: js.Function1[/* worker */ SidebarWorker, _]): scala.Unit = js.native
  @JSName("once")
  def once_ready(event: jpmLib.jpmLibStrings.ready, handler: js.Function1[/* worker */ SidebarWorker, _]): scala.Unit = js.native
  @JSName("once")
  def once_show(event: jpmLib.jpmLibStrings.show, handler: js.Function1[/* worker */ SidebarWorker, _]): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_attach(event: jpmLib.jpmLibStrings.attach, handler: js.Function): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_detach(event: jpmLib.jpmLibStrings.detach, handler: js.Function): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_hide(event: jpmLib.jpmLibStrings.hide, handler: js.Function): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_ready(event: jpmLib.jpmLibStrings.ready, handler: js.Function): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_show(event: jpmLib.jpmLibStrings.show, handler: js.Function): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def show(window: jpmLib.FFAddonSDKNs.BrowserWindow): scala.Unit = js.native
}

