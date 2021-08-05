package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.PDFViewerOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.PDFViewer")
@js.native
class PDFViewer protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.PDFViewer {
  def this(element: Element) = this()
  def this(element: Element, options: PDFViewerOptions) = this()
}
object PDFViewer {
  
  @JSGlobal("kendo.ui.PDFViewer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.PDFViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.PDFViewer]
  
  /* static member */
  @JSGlobal("kendo.ui.PDFViewer.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.PDFViewer = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.PDFViewer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
