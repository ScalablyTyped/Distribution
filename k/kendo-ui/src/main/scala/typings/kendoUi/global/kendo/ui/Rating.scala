package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.RatingOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Rating")
@js.native
class Rating protected ()
  extends typings.kendoUi.kendo.ui.Rating {
  def this(element: Element) = this()
  def this(element: Element, options: RatingOptions) = this()
}
object Rating {
  
  @JSGlobal("kendo.ui.Rating")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Rating.extend")
  @js.native
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Rating = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Rating.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Rating = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Rating): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
