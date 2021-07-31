package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.FileManagerOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.FileManager")
@js.native
class FileManager protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.FileManager {
  def this(element: Element) = this()
  def this(element: Element, options: FileManagerOptions) = this()
}
object FileManager {
  
  @JSGlobal("kendo.ui.FileManager")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.FileManager = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.FileManager]
  
  /* static member */
  @JSGlobal("kendo.ui.FileManager.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.FileManager = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.FileManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
