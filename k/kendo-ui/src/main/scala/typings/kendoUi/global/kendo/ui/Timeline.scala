package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.TimelineOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Timeline")
@js.native
class Timeline protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Timeline {
  def this(element: Element) = this()
  def this(element: Element, options: TimelineOptions) = this()
}
object Timeline {
  
  @JSGlobal("kendo.ui.Timeline")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Timeline = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Timeline]
  
  /* static member */
  @JSGlobal("kendo.ui.Timeline.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Timeline = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.Timeline): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
