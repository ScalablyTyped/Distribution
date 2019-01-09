package typings
package jpmLib.FFAddonSDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tab extends js.Object {
  var contentType: java.lang.String = js.native
  var favicon: java.lang.String = js.native
  var id: java.lang.String = js.native
  var index: scala.Double = js.native
  var isPinned: scala.Boolean = js.native
  var readyState: jpmLib.jpmLibStrings.uninitialized | jpmLib.jpmLibStrings.loading | jpmLib.jpmLibStrings.interactive | jpmLib.jpmLibStrings.complete = js.native
  var title: java.lang.String = js.native
  var url: java.lang.String = js.native
  var window: BrowserWindow = js.native
  def activate(): scala.Unit = js.native
  def attach(options: jpmLib.Anon_ContentScriptContentScriptFile): ContentWorker = js.native
  def close(): scala.Unit = js.native
  def close(afterClose: js.Function0[_]): scala.Unit = js.native
  def getThumbnail(): java.lang.String = js.native
  @JSName("on")
  def on_activate(event: jpmLib.jpmLibStrings.activate, handler: js.Function1[/* tab */ this.type, _]): scala.Unit = js.native
  @JSName("on")
  def on_close(event: jpmLib.jpmLibStrings.close, handler: js.Function1[/* tab */ this.type, _]): scala.Unit = js.native
  @JSName("on")
  def on_deactivate(event: jpmLib.jpmLibStrings.deactivate, handler: js.Function1[/* tab */ this.type, _]): scala.Unit = js.native
  @JSName("on")
  def on_load(event: jpmLib.jpmLibStrings.load, handler: js.Function1[/* tab */ this.type, _]): scala.Unit = js.native
  @JSName("on")
  def on_pageshow(event: jpmLib.jpmLibStrings.pageshow, handler: js.Function1[/* tab */ this.type, _]): scala.Unit = js.native
  @JSName("on")
  def on_ready(event: jpmLib.jpmLibStrings.ready, handler: js.Function1[/* tab */ this.type, _]): scala.Unit = js.native
  def pin(): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  def unpin(): scala.Unit = js.native
}

