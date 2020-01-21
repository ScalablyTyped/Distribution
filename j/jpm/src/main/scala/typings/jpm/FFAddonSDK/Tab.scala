package typings.jpm.FFAddonSDK

import typings.jpm.AnonContentScriptContentScriptFile
import typings.jpm.jpmStrings.activate
import typings.jpm.jpmStrings.close
import typings.jpm.jpmStrings.complete
import typings.jpm.jpmStrings.deactivate
import typings.jpm.jpmStrings.interactive
import typings.jpm.jpmStrings.load
import typings.jpm.jpmStrings.loading
import typings.jpm.jpmStrings.pageshow
import typings.jpm.jpmStrings.ready
import typings.jpm.jpmStrings.uninitialized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tab extends js.Object {
  var contentType: String = js.native
  var favicon: String = js.native
  var id: String = js.native
  var index: Double = js.native
  var isPinned: Boolean = js.native
  var readyState: uninitialized | loading | interactive | complete = js.native
  var title: String = js.native
  var url: String = js.native
  var window: BrowserWindow = js.native
  def activate(): Unit = js.native
  def attach(options: AnonContentScriptContentScriptFile): ContentWorker = js.native
  def close(): Unit = js.native
  def close(afterClose: js.Function0[_]): Unit = js.native
  def getThumbnail(): String = js.native
  @JSName("on")
  def on_activate(event: activate, handler: js.Function1[/* tab */ this.type, _]): Unit = js.native
  @JSName("on")
  def on_close(event: close, handler: js.Function1[/* tab */ this.type, _]): Unit = js.native
  @JSName("on")
  def on_deactivate(event: deactivate, handler: js.Function1[/* tab */ this.type, _]): Unit = js.native
  @JSName("on")
  def on_load(event: load, handler: js.Function1[/* tab */ this.type, _]): Unit = js.native
  @JSName("on")
  def on_pageshow(event: pageshow, handler: js.Function1[/* tab */ this.type, _]): Unit = js.native
  @JSName("on")
  def on_ready(event: ready, handler: js.Function1[/* tab */ this.type, _]): Unit = js.native
  def pin(): Unit = js.native
  def reload(): Unit = js.native
  def unpin(): Unit = js.native
}

