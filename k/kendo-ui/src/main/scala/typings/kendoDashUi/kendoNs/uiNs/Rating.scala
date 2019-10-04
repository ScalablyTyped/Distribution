package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Rating")
@js.native
class Rating protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: RatingOptions) = this()
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

/* static members */
@JSGlobal("kendo.ui.Rating")
@js.native
object Rating extends js.Object {
  var fn: Rating = js.native
  def extend(proto: js.Object): Rating = js.native
}

