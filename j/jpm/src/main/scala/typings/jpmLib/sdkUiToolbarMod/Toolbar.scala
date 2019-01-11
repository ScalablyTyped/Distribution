package typings
package jpmLib.sdkUiToolbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Toolbar extends js.Object {
  var hidden: scala.Boolean = js.native
  var items: js.Array[ToolbarItem] = js.native
  var title: java.lang.String = js.native
  def destroy(): scala.Unit = js.native
  @JSName("off")
  def off_attach(event: jpmLib.jpmLibStrings.attach, handler: js.Function): scala.Unit = js.native
  @JSName("off")
  def off_detach(event: jpmLib.jpmLibStrings.detach, handler: js.Function): scala.Unit = js.native
  @JSName("off")
  def off_hide(event: jpmLib.jpmLibStrings.hide, handler: js.Function): scala.Unit = js.native
  @JSName("off")
  def off_show(event: jpmLib.jpmLibStrings.show, handler: js.Function): scala.Unit = js.native
  @JSName("on")
  def on_attach(event: jpmLib.jpmLibStrings.attach, handler: js.Function1[/* toolbar */ this.type, _]): scala.Unit = js.native
  @JSName("on")
  def on_detach(event: jpmLib.jpmLibStrings.detach, handler: js.Function1[/* toolbar */ this.type, _]): scala.Unit = js.native
  @JSName("on")
  def on_hide(event: jpmLib.jpmLibStrings.hide, handler: js.Function1[/* toolbar */ this.type, _]): scala.Unit = js.native
  @JSName("on")
  def on_show(event: jpmLib.jpmLibStrings.show, handler: js.Function1[/* toolbar */ this.type, _]): scala.Unit = js.native
  @JSName("once")
  def once_attach(event: jpmLib.jpmLibStrings.attach, handler: js.Function1[/* toolbar */ this.type, _]): scala.Unit = js.native
  @JSName("once")
  def once_detach(event: jpmLib.jpmLibStrings.detach, handler: js.Function1[/* toolbar */ this.type, _]): scala.Unit = js.native
  @JSName("once")
  def once_hide(event: jpmLib.jpmLibStrings.hide, handler: js.Function1[/* toolbar */ this.type, _]): scala.Unit = js.native
  @JSName("once")
  def once_show(event: jpmLib.jpmLibStrings.show, handler: js.Function1[/* toolbar */ this.type, _]): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_attach(event: jpmLib.jpmLibStrings.attach, handler: js.Function): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_detach(event: jpmLib.jpmLibStrings.detach, handler: js.Function): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_hide(event: jpmLib.jpmLibStrings.hide, handler: js.Function): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_show(event: jpmLib.jpmLibStrings.show, handler: js.Function): scala.Unit = js.native
}

