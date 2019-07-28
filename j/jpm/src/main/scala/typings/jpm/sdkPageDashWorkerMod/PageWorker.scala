package typings.jpm.sdkPageDashWorkerMod

import typings.jpm.Anon_Script
import typings.jpm.FFAddonSDKNs.Port
import typings.jpm.jpmStrings.error
import typings.jpm.jpmStrings.message
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageWorker extends js.Object {
  var allow: js.UndefOr[Anon_Script] = js.native
  var contentScript: js.UndefOr[String | js.Array[String]] = js.native
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
  var contentURL: js.UndefOr[String] = js.native
  var include: js.UndefOr[String | (js.Array[RegExp | String]) | RegExp] = js.native
  var port: Port = js.native
  def destroy(): Unit = js.native
  def on(event: error, handler: js.Function1[/* arg */ js.UndefOr[message | Error], _]): Unit = js.native
  @JSName("on")
  def on_message(event: message, handler: js.Function1[/* arg */ js.UndefOr[message | Error], _]): Unit = js.native
  def postMessage(message: String): Unit = js.native
  def removeListener(event: String, listener: js.Function): Unit = js.native
}

