package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressBar extends Widget {
  @JSName("options")
  var options_ProgressBar: ProgressBarOptions = js.native
  var progressStatus: JQuery = js.native
  var progressWrapper: JQuery = js.native
  var wrapper: JQuery = js.native
  def enable(enable: Boolean): Unit = js.native
  def value(): Double = js.native
  def value(value: Double): Unit = js.native
}

