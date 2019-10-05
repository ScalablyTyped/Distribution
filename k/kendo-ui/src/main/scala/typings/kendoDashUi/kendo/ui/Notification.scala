package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Notification")
@js.native
class Notification protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: NotificationOptions) = this()
  @JSName("options")
  var options_Notification: NotificationOptions = js.native
  var wrapper: JQuery = js.native
  def error(data: String): Unit = js.native
  def error(data: js.Any): Unit = js.native
  def error(data: js.Function): Unit = js.native
  def getNotifications(): JQuery = js.native
  def hide(): Unit = js.native
  def info(data: String): Unit = js.native
  def info(data: js.Any): Unit = js.native
  def info(data: js.Function): Unit = js.native
  def show(data: String, `type`: String): Unit = js.native
  def show(data: js.Any, `type`: String): Unit = js.native
  def show(data: js.Function, `type`: String): Unit = js.native
  def showText(data: String, `type`: String): Unit = js.native
  def showText(data: js.Any, `type`: String): Unit = js.native
  def showText(data: js.Function, `type`: String): Unit = js.native
  def success(data: String): Unit = js.native
  def success(data: js.Any): Unit = js.native
  def success(data: js.Function): Unit = js.native
  def warning(data: String): Unit = js.native
  def warning(data: js.Any): Unit = js.native
  def warning(data: js.Function): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Notification")
@js.native
object Notification extends js.Object {
  var fn: Notification = js.native
  def extend(proto: js.Object): Notification = js.native
}

