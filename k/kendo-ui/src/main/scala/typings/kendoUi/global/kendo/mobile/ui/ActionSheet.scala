package typings.kendoUi.global.kendo.mobile.ui

import typings.kendoUi.kendo.mobile.ui.ActionSheetOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.ActionSheet")
@js.native
class ActionSheet protected ()
  extends StObject
     with typings.kendoUi.kendo.mobile.ui.ActionSheet {
  def this(element: Element) = this()
  def this(element: Element, options: ActionSheetOptions) = this()
}
object ActionSheet {
  
  @JSGlobal("kendo.mobile.ui.ActionSheet")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.mobile.ui.ActionSheet = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.mobile.ui.ActionSheet]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.ActionSheet.fn")
  @js.native
  def fn: typings.kendoUi.kendo.mobile.ui.ActionSheet = js.native
  inline def fn_=(x: typings.kendoUi.kendo.mobile.ui.ActionSheet): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
