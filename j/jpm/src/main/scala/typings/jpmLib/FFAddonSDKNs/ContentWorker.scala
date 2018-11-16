package typings
package jpmLib.FFAddonSDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentWorker
  extends ScalablyTyped.runtime.Instantiable1[/* options */ jpmLib.Anon_ContentScriptWindow, ContentWorker] {
  var port: Port = js.native
  var tab: Tab = js.native
  var url: stdLib.URL = js.native
  def destroy(): scala.Unit = js.native
  @JSName("on")
  def on_detach(event: jpmLib.jpmLibStrings.detach, handler: js.Function0[_]): scala.Unit = js.native
  @JSName("on")
  def on_error(event: jpmLib.jpmLibStrings.error, handler: js.Function0[_]): scala.Unit = js.native
  @JSName("on")
  def on_message(event: jpmLib.jpmLibStrings.message, handler: js.Function0[_]): scala.Unit = js.native
  def postMessage(): scala.Unit = js.native
  def postMessage(data: js.Any): scala.Unit = js.native
}

