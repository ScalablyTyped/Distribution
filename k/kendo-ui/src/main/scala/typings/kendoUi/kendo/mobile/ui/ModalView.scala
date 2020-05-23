package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalView
  extends typings.kendoUi.kendo.ui.Widget {
  @JSName("options")
  var options_ModalView: ModalViewOptions = js.native
  var wrapper: JQuery = js.native
  def close(): Unit = js.native
  def open(): Unit = js.native
  def open(target: JQuery): Unit = js.native
}

