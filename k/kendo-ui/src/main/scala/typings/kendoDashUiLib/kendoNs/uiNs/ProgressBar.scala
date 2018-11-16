package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.ProgressBar")
@js.native
class ProgressBar protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ProgressBarOptions) = this()
  @JSName("options")
  var options_ProgressBar: ProgressBarOptions = js.native
  var progressStatus: kendoDashUiLib.JQuery = js.native
  var progressWrapper: kendoDashUiLib.JQuery = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def enable(enable: scala.Boolean): scala.Unit = js.native
  def value(): scala.Double = js.native
  def value(value: scala.Double): scala.Unit = js.native
}

@JSGlobal("kendo.ui.ProgressBar")
@js.native
object ProgressBar extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.ProgressBar = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.ProgressBar = js.native
}

