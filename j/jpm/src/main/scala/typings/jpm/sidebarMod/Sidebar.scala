package typings.jpm.sidebarMod

import typings.jpm.AnonId
import typings.jpm.FFAddonSDK.BrowserWindow
import typings.jpm.jpmStrings.attach
import typings.jpm.jpmStrings.detach
import typings.jpm.jpmStrings.hide
import typings.jpm.jpmStrings.ready
import typings.jpm.jpmStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sidebar extends js.Object {
  var id: String = js.native
  var title: String = js.native
  var url: String = js.native
  def dispose(): Unit = js.native
  def hide(): Unit = js.native
  def hide(window: BrowserWindow): Unit = js.native
  @JSName("on")
  def on_attach(event: attach, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  @JSName("on")
  def on_detach(event: detach, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  @JSName("on")
  def on_hide(event: hide, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  @JSName("on")
  def on_ready(event: ready, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  @JSName("on")
  def on_show(event: show, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  @JSName("once")
  def once_attach(event: attach, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  @JSName("once")
  def once_detach(event: detach, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  @JSName("once")
  def once_hide(event: hide, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  @JSName("once")
  def once_ready(event: ready, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  @JSName("once")
  def once_show(event: show, handler: js.Function1[/* worker */ SidebarWorker, _]): Unit = js.native
  @JSName("removeListener")
  def removeListener_attach(event: attach, handler: js.Function): Unit = js.native
  @JSName("removeListener")
  def removeListener_detach(event: detach, handler: js.Function): Unit = js.native
  @JSName("removeListener")
  def removeListener_hide(event: hide, handler: js.Function): Unit = js.native
  @JSName("removeListener")
  def removeListener_ready(event: ready, handler: js.Function): Unit = js.native
  @JSName("removeListener")
  def removeListener_show(event: show, handler: js.Function): Unit = js.native
  def show(): Unit = js.native
  def show(window: BrowserWindow): Unit = js.native
}

@JSImport("sdk/ui/sidebar", "Sidebar")
@js.native
object Sidebar extends js.Object {
  def apply(options: AnonId): Sidebar = js.native
}

