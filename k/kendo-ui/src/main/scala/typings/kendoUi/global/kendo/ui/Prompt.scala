package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.PromptOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Prompt")
@js.native
class Prompt protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Prompt {
  def this(element: Element) = this()
  def this(element: Element, options: PromptOptions) = this()
}
object Prompt {
  
  @JSGlobal("kendo.ui.Prompt")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Prompt = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Prompt]
  
  /* static member */
  @JSGlobal("kendo.ui.Prompt.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Prompt = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Prompt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
