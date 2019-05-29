package typings
package jpmLib.sdkPageDashWorkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageWorker extends js.Object {
  var allow: js.UndefOr[jpmLib.Anon_Script] = js.native
  var contentScript: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
  var contentScriptFile: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
  var contentURL: js.UndefOr[java.lang.String] = js.native
  var include: js.UndefOr[java.lang.String | (js.Array[stdLib.RegExp | java.lang.String]) | stdLib.RegExp] = js.native
  var port: jpmLib.FFAddonSDKNs.Port = js.native
  def destroy(): scala.Unit = js.native
  def on(
    event: jpmLib.jpmLibStrings.error,
    handler: js.Function1[/* arg */ js.UndefOr[jpmLib.jpmLibStrings.message | stdLib.Error], _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_message(
    event: jpmLib.jpmLibStrings.message,
    handler: js.Function1[/* arg */ js.UndefOr[jpmLib.jpmLibStrings.message | stdLib.Error], _]
  ): scala.Unit = js.native
  def postMessage(message: java.lang.String): scala.Unit = js.native
  def removeListener(event: java.lang.String, listener: js.Function): scala.Unit = js.native
}

