package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ChatOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Chat")
@js.native
class Chat protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Chat {
  def this(element: Element) = this()
  def this(element: Element, options: ChatOptions) = this()
}
object Chat {
  
  @JSGlobal("kendo.ui.Chat")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Chat = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Chat]
  
  /* static member */
  @JSGlobal("kendo.ui.Chat.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Chat = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.Chat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
