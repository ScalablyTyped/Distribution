package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.Scroller")
@js.native
class Scroller protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ScrollerOptions) = this()
  @JSName("options")
  var options_Scroller: ScrollerOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def animatedScrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def contentResized(): scala.Unit = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def height(): scala.Double = js.native
  def pullHandled(): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def scrollHeight(): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollWidth(): scala.Unit = js.native
  def zoomOut(): scala.Unit = js.native
}

@JSGlobal("kendo.mobile.ui.Scroller")
@js.native
object Scroller extends js.Object {
  var fn: kendoDashUiLib.kendoNs.mobileNs.uiNs.Scroller = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.mobileNs.uiNs.Scroller = js.native
}

