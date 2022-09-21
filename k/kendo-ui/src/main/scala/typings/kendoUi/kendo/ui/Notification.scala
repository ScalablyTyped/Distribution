package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification
  extends StObject
     with Widget {
  
  def error(data: String): Unit = js.native
  def error(data: js.Function): Unit = js.native
  def error(data: Any): Unit = js.native
  
  def getNotifications(): JQuery = js.native
  
  def hide(): Unit = js.native
  
  def info(data: String): Unit = js.native
  def info(data: js.Function): Unit = js.native
  def info(data: Any): Unit = js.native
  
  @JSName("options")
  var options_Notification: NotificationOptions = js.native
  
  def show(data: String, `type`: String): Unit = js.native
  def show(data: js.Function, `type`: String): Unit = js.native
  def show(data: Any, `type`: String): Unit = js.native
  
  def showText(data: String, `type`: String): Unit = js.native
  def showText(data: js.Function, `type`: String): Unit = js.native
  def showText(data: Any, `type`: String): Unit = js.native
  
  def success(data: String): Unit = js.native
  def success(data: js.Function): Unit = js.native
  def success(data: Any): Unit = js.native
  
  def warning(data: String): Unit = js.native
  def warning(data: js.Function): Unit = js.native
  def warning(data: Any): Unit = js.native
  
  var wrapper: JQuery = js.native
}
