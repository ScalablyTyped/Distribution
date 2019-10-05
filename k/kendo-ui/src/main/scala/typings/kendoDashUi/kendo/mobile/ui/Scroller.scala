package typings.kendoDashUi.kendo.mobile.ui

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.Scroller")
@js.native
class Scroller protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ScrollerOptions) = this()
  @JSName("options")
  var options_Scroller: ScrollerOptions = js.native
  var wrapper: JQuery = js.native
  def animatedScrollTo(x: Double, y: Double): Unit = js.native
  def contentResized(): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def height(): Double = js.native
  def pullHandled(): Unit = js.native
  def reset(): Unit = js.native
  def scrollHeight(): Unit = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
  def scrollWidth(): Unit = js.native
  def zoomOut(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.Scroller")
@js.native
object Scroller extends js.Object {
  var fn: Scroller = js.native
  def extend(proto: js.Object): Scroller = js.native
}

