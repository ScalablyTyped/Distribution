package typings.kendoDashUi.kendo.mobile.ui

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.TabStrip")
@js.native
class TabStrip protected ()
  extends typings.kendoDashUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: Element, options: TabStripOptions) = this()
  @JSName("options")
  var options_TabStrip: TabStripOptions = js.native
  var wrapper: JQuery = js.native
  def badge(tab: String, value: String): String = js.native
  def badge(tab: String, value: Boolean): String = js.native
  def badge(tab: Double, value: String): String = js.native
  def badge(tab: Double, value: Boolean): String = js.native
  def clear(): Unit = js.native
  def currentItem(): JQuery = js.native
  def switchByFullUrl(url: String): Unit = js.native
  def switchTo(url: String): Unit = js.native
  def switchTo(url: Double): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.TabStrip")
@js.native
object TabStrip extends js.Object {
  var fn: TabStrip = js.native
  def extend(proto: js.Object): TabStrip = js.native
}

