package typings
package jpmLib.FFAddonSDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frame
  extends jpmLib.sdkUiToolbarMod.ToolbarItem {
  var url: stdLib.URL = js.native
  def destroy(): scala.Unit = js.native
  @JSName("off")
  def off_attach(event: jpmLib.jpmLibStrings.attach, handler: js.Function): scala.Unit = js.native
  @JSName("off")
  def off_detach(event: jpmLib.jpmLibStrings.detach, handler: js.Function): scala.Unit = js.native
  @JSName("off")
  def off_load(event: jpmLib.jpmLibStrings.load, handler: js.Function): scala.Unit = js.native
  @JSName("off")
  def off_message(event: jpmLib.jpmLibStrings.message, handler: js.Function): scala.Unit = js.native
  @JSName("off")
  def off_ready(event: jpmLib.jpmLibStrings.ready, handler: js.Function): scala.Unit = js.native
  @JSName("on")
  def on_attach(event: jpmLib.jpmLibStrings.attach, handler: js.Function1[/* event */ FrameEvent, _]): scala.Unit = js.native
  @JSName("on")
  def on_detach(event: jpmLib.jpmLibStrings.detach, handler: js.Function1[/* event */ FrameEvent, _]): scala.Unit = js.native
  @JSName("on")
  def on_load(event: jpmLib.jpmLibStrings.load, handler: js.Function1[/* event */ FrameEvent, _]): scala.Unit = js.native
  @JSName("on")
  def on_message(event: jpmLib.jpmLibStrings.message, handler: js.Function1[/* event */ FrameEvent, _]): scala.Unit = js.native
  @JSName("on")
  def on_ready(event: jpmLib.jpmLibStrings.ready, handler: js.Function1[/* event */ FrameEvent, _]): scala.Unit = js.native
  @JSName("once")
  def once_attach(event: jpmLib.jpmLibStrings.attach, handler: js.Function1[/* event */ FrameEvent, _]): scala.Unit = js.native
  @JSName("once")
  def once_detach(event: jpmLib.jpmLibStrings.detach, handler: js.Function1[/* event */ FrameEvent, _]): scala.Unit = js.native
  @JSName("once")
  def once_load(event: jpmLib.jpmLibStrings.load, handler: js.Function1[/* event */ FrameEvent, _]): scala.Unit = js.native
  @JSName("once")
  def once_message(event: jpmLib.jpmLibStrings.message, handler: js.Function1[/* event */ FrameEvent, _]): scala.Unit = js.native
  @JSName("once")
  def once_ready(event: jpmLib.jpmLibStrings.ready, handler: js.Function1[/* event */ FrameEvent, _]): scala.Unit = js.native
  def postMessage(message: java.lang.String, target: java.lang.String): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_attach(event: jpmLib.jpmLibStrings.attach, handler: js.Function): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_detach(event: jpmLib.jpmLibStrings.detach, handler: js.Function): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_load(event: jpmLib.jpmLibStrings.load, handler: js.Function): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_message(event: jpmLib.jpmLibStrings.message, handler: js.Function): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_ready(event: jpmLib.jpmLibStrings.ready, handler: js.Function): scala.Unit = js.native
}

