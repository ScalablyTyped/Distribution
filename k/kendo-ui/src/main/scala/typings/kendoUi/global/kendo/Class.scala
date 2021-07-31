package typings.kendoUi.global.kendo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.Class")
@js.native
class Class ()
  extends StObject
     with typings.kendoUi.kendo.Class
object Class {
  
  @JSGlobal("kendo.Class")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(prototype: js.Object): typings.kendoUi.kendo.Class = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(prototype.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.Class]
  
  /* static member */
  @JSGlobal("kendo.Class.fn")
  @js.native
  def fn: typings.kendoUi.kendo.Class = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.Class): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
