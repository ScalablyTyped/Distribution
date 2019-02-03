package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.TabStrip")
@js.native
class TabStrip protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: TabStripOptions) = this()
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  @JSName("options")
  var options_TabStrip: TabStripOptions = js.native
  var tabGroup: kendoDashUiLib.JQuery = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def activateTab(item: kendoDashUiLib.JQuery): scala.Unit = js.native
  def append(tab: js.Any): TabStrip = js.native
  def contentElement(itemIndex: scala.Double): stdLib.Element = js.native
  def contentHolder(itemIndex: scala.Double): stdLib.Element = js.native
  def deactivateTab(item: kendoDashUiLib.JQuery): scala.Unit = js.native
  def disable(element: java.lang.String): TabStrip = js.native
  def disable(element: kendoDashUiLib.JQuery): TabStrip = js.native
  def disable(element: stdLib.Element): TabStrip = js.native
  def enable(element: java.lang.String): TabStrip = js.native
  def enable(element: java.lang.String, enable: scala.Boolean): TabStrip = js.native
  def enable(element: kendoDashUiLib.JQuery): TabStrip = js.native
  def enable(element: kendoDashUiLib.JQuery, enable: scala.Boolean): TabStrip = js.native
  def enable(element: stdLib.Element): TabStrip = js.native
  def enable(element: stdLib.Element, enable: scala.Boolean): TabStrip = js.native
  def insertAfter(item: java.lang.String, referenceTab: java.lang.String): TabStrip = js.native
  def insertAfter(item: java.lang.String, referenceTab: kendoDashUiLib.JQuery): TabStrip = js.native
  def insertAfter(item: java.lang.String, referenceTab: stdLib.Element): TabStrip = js.native
  def insertAfter(item: js.Any, referenceTab: java.lang.String): TabStrip = js.native
  def insertAfter(item: js.Any, referenceTab: kendoDashUiLib.JQuery): TabStrip = js.native
  def insertAfter(item: js.Any, referenceTab: stdLib.Element): TabStrip = js.native
  def insertAfter(item: kendoDashUiLib.JQuery, referenceTab: java.lang.String): TabStrip = js.native
  def insertAfter(item: kendoDashUiLib.JQuery, referenceTab: kendoDashUiLib.JQuery): TabStrip = js.native
  def insertAfter(item: kendoDashUiLib.JQuery, referenceTab: stdLib.Element): TabStrip = js.native
  def insertAfter(item: stdLib.Element, referenceTab: java.lang.String): TabStrip = js.native
  def insertAfter(item: stdLib.Element, referenceTab: kendoDashUiLib.JQuery): TabStrip = js.native
  def insertAfter(item: stdLib.Element, referenceTab: stdLib.Element): TabStrip = js.native
  def insertBefore(item: java.lang.String, referenceTab: java.lang.String): TabStrip = js.native
  def insertBefore(item: java.lang.String, referenceTab: kendoDashUiLib.JQuery): TabStrip = js.native
  def insertBefore(item: java.lang.String, referenceTab: stdLib.Element): TabStrip = js.native
  def insertBefore(item: js.Any, referenceTab: java.lang.String): TabStrip = js.native
  def insertBefore(item: js.Any, referenceTab: kendoDashUiLib.JQuery): TabStrip = js.native
  def insertBefore(item: js.Any, referenceTab: stdLib.Element): TabStrip = js.native
  def insertBefore(item: kendoDashUiLib.JQuery, referenceTab: java.lang.String): TabStrip = js.native
  def insertBefore(item: kendoDashUiLib.JQuery, referenceTab: kendoDashUiLib.JQuery): TabStrip = js.native
  def insertBefore(item: kendoDashUiLib.JQuery, referenceTab: stdLib.Element): TabStrip = js.native
  def insertBefore(item: stdLib.Element, referenceTab: java.lang.String): TabStrip = js.native
  def insertBefore(item: stdLib.Element, referenceTab: kendoDashUiLib.JQuery): TabStrip = js.native
  def insertBefore(item: stdLib.Element, referenceTab: stdLib.Element): TabStrip = js.native
  def items(): stdLib.HTMLCollection = js.native
  def reload(element: java.lang.String): TabStrip = js.native
  def reload(element: kendoDashUiLib.JQuery): TabStrip = js.native
  def reload(element: stdLib.Element): TabStrip = js.native
  def remove(element: java.lang.String): TabStrip = js.native
  def remove(element: kendoDashUiLib.JQuery): TabStrip = js.native
  def remove(element: scala.Double): TabStrip = js.native
  def select(): kendoDashUiLib.JQuery = js.native
  def select(element: java.lang.String): scala.Unit = js.native
  def select(element: kendoDashUiLib.JQuery): scala.Unit = js.native
  def select(element: scala.Double): scala.Unit = js.native
  def select(element: stdLib.Element): scala.Unit = js.native
  def setDataSource(dataSource: js.Any): scala.Unit = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.TabStrip")
@js.native
object TabStrip extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.TabStrip = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.TabStrip = js.native
}

