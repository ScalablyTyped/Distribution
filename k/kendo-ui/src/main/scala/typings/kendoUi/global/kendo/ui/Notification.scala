package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.NotificationOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Notification")
@js.native
class Notification protected ()
  extends typings.kendoUi.kendo.ui.Notification {
  def this(element: Element) = this()
  def this(element: Element, options: NotificationOptions) = this()
}
object Notification {
  
  @JSGlobal("kendo.ui.Notification")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Notification.extend")
  @js.native
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Notification = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Notification.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Notification = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Notification): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
