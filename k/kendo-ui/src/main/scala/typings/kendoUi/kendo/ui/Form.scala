package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Form extends Widget {
  @JSName("options")
  var options_Form: FormOptions = js.native
  var wrapper: JQuery = js.native
  def clear(): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def validate(): Unit = js.native
}

