package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rating extends Widget {
  var container: JQuery = js.native
  @JSName("options")
  var options_Rating: RatingOptions = js.native
  var wrapper: JQuery = js.native
  def enable(enable: Boolean): Unit = js.native
  def readonly(enable: Boolean): Unit = js.native
  def reset(): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def value(value: Double): Unit = js.native
}

