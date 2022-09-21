package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.BreadcrumbOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Breadcrumb")
@js.native
open class Breadcrumb protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Breadcrumb {
  def this(element: Element) = this()
  def this(element: Element, options: BreadcrumbOptions) = this()
}
object Breadcrumb {
  
  @JSGlobal("kendo.ui.Breadcrumb")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Breadcrumb = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Breadcrumb]
  
  /* static member */
  @JSGlobal("kendo.ui.Breadcrumb.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Breadcrumb = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.Breadcrumb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
