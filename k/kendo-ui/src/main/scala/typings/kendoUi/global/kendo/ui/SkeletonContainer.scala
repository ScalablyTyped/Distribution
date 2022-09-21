package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.SkeletonContainerOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.SkeletonContainer")
@js.native
open class SkeletonContainer protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.SkeletonContainer {
  def this(element: Element) = this()
  def this(element: Element, options: SkeletonContainerOptions) = this()
}
object SkeletonContainer {
  
  @JSGlobal("kendo.ui.SkeletonContainer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.SkeletonContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.SkeletonContainer]
  
  /* static member */
  @JSGlobal("kendo.ui.SkeletonContainer.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.SkeletonContainer = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.SkeletonContainer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
