package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.TouchOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Touch")
@js.native
class Touch protected ()
  extends typings.kendoUi.kendo.ui.Touch {
  def this(element: Element) = this()
  def this(element: Element, options: TouchOptions) = this()
}
object Touch {
  
  @JSGlobal("kendo.ui.Touch")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Touch.extend")
  @js.native
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Touch = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Touch.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Touch = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Touch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
