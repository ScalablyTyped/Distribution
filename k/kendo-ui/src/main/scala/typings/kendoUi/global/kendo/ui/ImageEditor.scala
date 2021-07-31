package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ImageEditorOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ImageEditor")
@js.native
class ImageEditor protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.ImageEditor {
  def this(element: Element) = this()
  def this(element: Element, options: ImageEditorOptions) = this()
}
object ImageEditor {
  
  @JSGlobal("kendo.ui.ImageEditor")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.ImageEditor = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.ImageEditor]
  
  /* static member */
  @JSGlobal("kendo.ui.ImageEditor.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.ImageEditor = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.ImageEditor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
