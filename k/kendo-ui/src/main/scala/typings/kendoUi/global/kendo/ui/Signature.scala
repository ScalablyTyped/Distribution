package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.SignatureOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Signature")
@js.native
open class Signature protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Signature {
  def this(element: Element) = this()
  def this(element: Element, options: SignatureOptions) = this()
}
object Signature {
  
  @JSGlobal("kendo.ui.Signature")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Signature]
  
  /* static member */
  @JSGlobal("kendo.ui.Signature.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Signature = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.Signature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
