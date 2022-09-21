package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.CaptchaOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Captcha")
@js.native
open class Captcha protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Captcha {
  def this(element: Element) = this()
  def this(element: Element, options: CaptchaOptions) = this()
}
object Captcha {
  
  @JSGlobal("kendo.ui.Captcha")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Captcha = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Captcha]
  
  /* static member */
  @JSGlobal("kendo.ui.Captcha.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Captcha = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.Captcha): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
