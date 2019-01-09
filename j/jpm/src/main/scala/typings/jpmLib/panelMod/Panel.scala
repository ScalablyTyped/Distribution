package typings
package jpmLib.panelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Panel extends js.Object {
  var allow: js.UndefOr[jpmLib.Anon_Script] = js.native
  var contentScript: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
  var contentScriptFile: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
  var contentScriptOptions: js.UndefOr[js.Any] = js.native
  var contentScriptWhen: jpmLib.jpmLibStrings.start | jpmLib.jpmLibStrings.ready | jpmLib.jpmLibStrings.end = js.native
  var contentURL: js.UndefOr[java.lang.String | stdLib.URL] = js.native
  var focus: scala.Boolean = js.native
  var height: scala.Double = js.native
  var isShowing: scala.Boolean = js.native
  var port: jpmLib.FFAddonSDKNs.Port = js.native
  var width: scala.Double = js.native
  def destroy(): scala.Unit = js.native
  def hide(): scala.Unit = js.native
  @JSName("on")
  def on_error(
    event: jpmLib.jpmLibStrings.error,
    handler: js.Function1[/* arg */ js.UndefOr[stdLib.Error | js.Any], _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_hide(
    event: jpmLib.jpmLibStrings.hide,
    handler: js.Function1[/* arg */ js.UndefOr[stdLib.Error | js.Any], _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_message(
    event: jpmLib.jpmLibStrings.message,
    handler: js.Function1[/* arg */ js.UndefOr[stdLib.Error | js.Any], _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_show(
    event: jpmLib.jpmLibStrings.show,
    handler: js.Function1[/* arg */ js.UndefOr[stdLib.Error | js.Any], _]
  ): scala.Unit = js.native
  def postMessage(message: java.lang.String): scala.Unit = js.native
  def removeListener(event: java.lang.String, listener: js.Function): scala.Unit = js.native
  def resize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def show(options: jpmLib.Anon_Focus): scala.Unit = js.native
}

