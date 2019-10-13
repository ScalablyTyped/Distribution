package typings.kendoDashUi.kendo.mobile.ui

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.SplitView")
@js.native
class SplitView protected ()
  extends typings.kendoDashUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: Element, options: SplitViewOptions) = this()
  @JSName("options")
  var options_SplitView: SplitViewOptions = js.native
  var wrapper: JQuery = js.native
  def collapsePanes(): Unit = js.native
  def expandPanes(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.SplitView")
@js.native
object SplitView extends js.Object {
  var fn: SplitView = js.native
  def extend(proto: js.Object): SplitView = js.native
}

