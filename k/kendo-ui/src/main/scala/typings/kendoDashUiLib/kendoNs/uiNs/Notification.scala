package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Notification")
@js.native
class Notification protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: NotificationOptions) = this()
  @JSName("options")
  var options_Notification: NotificationOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def error(data: java.lang.String): scala.Unit = js.native
  def error(data: js.Any): scala.Unit = js.native
  def error(data: js.Function): scala.Unit = js.native
  def getNotifications(): kendoDashUiLib.JQuery = js.native
  def hide(): scala.Unit = js.native
  def info(data: java.lang.String): scala.Unit = js.native
  def info(data: js.Any): scala.Unit = js.native
  def info(data: js.Function): scala.Unit = js.native
  def show(data: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  def show(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def show(data: js.Function, `type`: java.lang.String): scala.Unit = js.native
  def showText(data: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  def showText(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def showText(data: js.Function, `type`: java.lang.String): scala.Unit = js.native
  def success(data: java.lang.String): scala.Unit = js.native
  def success(data: js.Any): scala.Unit = js.native
  def success(data: js.Function): scala.Unit = js.native
  def warning(data: java.lang.String): scala.Unit = js.native
  def warning(data: js.Any): scala.Unit = js.native
  def warning(data: js.Function): scala.Unit = js.native
}

@JSGlobal("kendo.ui.Notification")
@js.native
object Notification extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Notification = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Notification = js.native
}

