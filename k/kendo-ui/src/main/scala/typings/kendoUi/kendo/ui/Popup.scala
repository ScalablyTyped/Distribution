package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popup extends Widget {
  @JSName("options")
  var options_Popup: PopupOptions = js.native
  var wrapper: JQuery = js.native
  def close(): Unit = js.native
  def open(): Unit = js.native
  def position(): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def toggle(): Unit = js.native
  def toggle(toggle: Boolean): Unit = js.native
  def visible(): Boolean = js.native
}

