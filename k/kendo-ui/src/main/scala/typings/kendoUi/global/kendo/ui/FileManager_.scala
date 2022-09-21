package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.FileManagerOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.FileManager")
@js.native
open class FileManager_ protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.FileManager_ {
  def this(element: Element) = this()
  def this(element: Element, options: FileManagerOptions) = this()
}
object FileManager_ {
  
  @JSGlobal("kendo.ui.FileManager")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.FileManager_ = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.FileManager_]
  
  /* static member */
  @JSGlobal("kendo.ui.FileManager.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.FileManager_ = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.FileManager_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
