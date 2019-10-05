package typings.jpm.FFAddonSDK

import typings.jpm.jpmStrings.attach
import typings.jpm.jpmStrings.detach
import typings.jpm.jpmStrings.load
import typings.jpm.jpmStrings.message
import typings.jpm.jpmStrings.ready
import typings.jpm.sdkUiToolbarMod.ToolbarItem
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frame extends ToolbarItem {
  var url: URL = js.native
  def destroy(): Unit = js.native
  @JSName("off")
  def off_attach(event: attach, handler: js.Function): Unit = js.native
  @JSName("off")
  def off_detach(event: detach, handler: js.Function): Unit = js.native
  @JSName("off")
  def off_load(event: load, handler: js.Function): Unit = js.native
  @JSName("off")
  def off_message(event: message, handler: js.Function): Unit = js.native
  @JSName("off")
  def off_ready(event: ready, handler: js.Function): Unit = js.native
  @JSName("on")
  def on_attach(event: attach, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
  @JSName("on")
  def on_detach(event: detach, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
  @JSName("on")
  def on_load(event: load, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
  @JSName("on")
  def on_message(event: message, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
  @JSName("on")
  def on_ready(event: ready, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
  @JSName("once")
  def once_attach(event: attach, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
  @JSName("once")
  def once_detach(event: detach, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
  @JSName("once")
  def once_load(event: load, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
  @JSName("once")
  def once_message(event: message, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
  @JSName("once")
  def once_ready(event: ready, handler: js.Function1[/* event */ FrameEvent, _]): Unit = js.native
  def postMessage(message: String, target: String): Unit = js.native
  @JSName("removeListener")
  def removeListener_attach(event: attach, handler: js.Function): Unit = js.native
  @JSName("removeListener")
  def removeListener_detach(event: detach, handler: js.Function): Unit = js.native
  @JSName("removeListener")
  def removeListener_load(event: load, handler: js.Function): Unit = js.native
  @JSName("removeListener")
  def removeListener_message(event: message, handler: js.Function): Unit = js.native
  @JSName("removeListener")
  def removeListener_ready(event: ready, handler: js.Function): Unit = js.native
}

