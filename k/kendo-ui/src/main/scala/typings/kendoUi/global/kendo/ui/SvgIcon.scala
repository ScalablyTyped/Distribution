package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.FontIconOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.SvgIcon")
@js.native
open class SvgIcon protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.SvgIcon {
  def this(element: Element) = this()
  def this(element: Element, options: FontIconOptions) = this()
}
object SvgIcon {
  
  @JSGlobal("kendo.ui.SvgIcon")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Wizard = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Wizard]
  
  /* static member */
  @JSGlobal("kendo.ui.SvgIcon.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.FontIcon = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.FontIcon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
