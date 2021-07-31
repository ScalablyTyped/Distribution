package typings.kendoUi.global.kendo.mobile.ui

import typings.kendoUi.kendo.mobile.ui.LoaderOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.Loader")
@js.native
class Loader protected ()
  extends StObject
     with typings.kendoUi.kendo.mobile.ui.Loader {
  def this(element: Element) = this()
  def this(element: Element, options: LoaderOptions) = this()
}
object Loader {
  
  @JSGlobal("kendo.mobile.ui.Loader")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.mobile.ui.Loader = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.mobile.ui.Loader]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.Loader.fn")
  @js.native
  def fn: typings.kendoUi.kendo.mobile.ui.Loader = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.mobile.ui.Loader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
