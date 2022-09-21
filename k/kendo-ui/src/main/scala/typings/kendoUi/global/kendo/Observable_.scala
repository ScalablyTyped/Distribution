package typings.kendoUi.global.kendo

import typings.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.Observable")
@js.native
open class Observable_ ()
  extends StObject
     with Observable
object Observable_ {
  
  @JSGlobal("kendo.Observable")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(prototype: js.Object): Observable = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(prototype.asInstanceOf[js.Any]).asInstanceOf[Observable]
  
  /* static member */
  @JSGlobal("kendo.Observable.fn")
  @js.native
  def fn: Observable = js.native
  inline def fn_=(x: Observable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
