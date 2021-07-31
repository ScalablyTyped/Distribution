package typings.kendoUi.global.kendo.data

import typings.kendoUi.kendo.data.BinderOptions
import typings.kendoUi.kendo.data.Bindings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.Binder")
@js.native
class Binder protected ()
  extends StObject
     with typings.kendoUi.kendo.data.Binder {
  def this(element: js.Any, bindings: Bindings) = this()
  def this(element: js.Any, bindings: Bindings, options: BinderOptions) = this()
}
object Binder {
  
  @JSGlobal("kendo.data.Binder")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(prototype: js.Object): typings.kendoUi.kendo.data.Binder = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(prototype.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.data.Binder]
  
  /* static member */
  @JSGlobal("kendo.data.Binder.fn")
  @js.native
  def fn: typings.kendoUi.kendo.data.Binder = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.data.Binder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
