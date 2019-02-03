package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.TabStrip")
@js.native
class TabStrip protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: TabStripOptions) = this()
  @JSName("options")
  var options_TabStrip: TabStripOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def badge(tab: java.lang.String, value: java.lang.String): java.lang.String = js.native
  def badge(tab: java.lang.String, value: scala.Boolean): java.lang.String = js.native
  def badge(tab: scala.Double, value: java.lang.String): java.lang.String = js.native
  def badge(tab: scala.Double, value: scala.Boolean): java.lang.String = js.native
  def clear(): scala.Unit = js.native
  def currentItem(): kendoDashUiLib.JQuery = js.native
  def switchByFullUrl(url: java.lang.String): scala.Unit = js.native
  def switchTo(url: java.lang.String): scala.Unit = js.native
  def switchTo(url: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.TabStrip")
@js.native
object TabStrip extends js.Object {
  var fn: kendoDashUiLib.kendoNs.mobileNs.uiNs.TabStrip = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.mobileNs.uiNs.TabStrip = js.native
}

