package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitView
  extends typings.kendoUi.kendo.ui.Widget {
  @JSName("options")
  var options_SplitView: SplitViewOptions = js.native
  var wrapper: JQuery = js.native
  def collapsePanes(): Unit = js.native
  def expandPanes(): Unit = js.native
}

