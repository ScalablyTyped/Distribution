package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.FontIconOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.FontIcon")
@js.native
open class FontIcon protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.FontIcon {
  def this(element: Element) = this()
  def this(element: Element, options: FontIconOptions) = this()
}
object FontIcon {
  
  @JSGlobal("kendo.ui.FontIcon")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Wizard = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Wizard]
  
  /* static member */
  @JSGlobal("kendo.ui.FontIcon.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.FontIcon = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.FontIcon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
