package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.DropTargetOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.DropTarget")
@js.native
class DropTarget protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.DropTarget {
  def this(element: Element) = this()
  def this(element: Element, options: DropTargetOptions) = this()
}
object DropTarget {
  
  @JSGlobal("kendo.ui.DropTarget")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def destroyGroup(groupName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyGroup")(groupName.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
