package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.UploadOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Upload")
@js.native
class Upload protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Upload {
  def this(element: Element) = this()
  def this(element: Element, options: UploadOptions) = this()
}
object Upload {
  
  @JSGlobal("kendo.ui.Upload")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Upload = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Upload]
  
  /* static member */
  @JSGlobal("kendo.ui.Upload.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Upload = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Upload): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
