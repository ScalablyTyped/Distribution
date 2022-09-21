package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.LoaderOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Loader")
@js.native
open class Loader protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Loader {
  def this(element: Element) = this()
  def this(element: Element, options: LoaderOptions) = this()
}
object Loader {
  
  @JSGlobal("kendo.ui.Loader")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Loader = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Loader]
  
  /* static member */
  @JSGlobal("kendo.ui.Loader.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Loader = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.Loader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
