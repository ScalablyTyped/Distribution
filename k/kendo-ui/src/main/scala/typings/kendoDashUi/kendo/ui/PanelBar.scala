package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendo.data.Node
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.PanelBar")
@js.native
class PanelBar protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: PanelBarOptions) = this()
  @JSName("options")
  var options_PanelBar: PanelBarOptions = js.native
  var wrapper: JQuery = js.native
  def append(item: String): PanelBar = js.native
  def append(item: String, referenceItem: String): PanelBar = js.native
  def append(item: String, referenceItem: JQuery): PanelBar = js.native
  def append(item: String, referenceItem: Element): PanelBar = js.native
  def append(item: js.Any): PanelBar = js.native
  def append(item: js.Any, referenceItem: String): PanelBar = js.native
  def append(item: js.Any, referenceItem: JQuery): PanelBar = js.native
  def append(item: js.Any, referenceItem: Element): PanelBar = js.native
  def append(item: JQuery): PanelBar = js.native
  def append(item: JQuery, referenceItem: String): PanelBar = js.native
  def append(item: JQuery, referenceItem: JQuery): PanelBar = js.native
  def append(item: JQuery, referenceItem: Element): PanelBar = js.native
  def append(item: Element): PanelBar = js.native
  def append(item: Element, referenceItem: String): PanelBar = js.native
  def append(item: Element, referenceItem: JQuery): PanelBar = js.native
  def append(item: Element, referenceItem: Element): PanelBar = js.native
  def clearSelection(): Unit = js.native
  def collapse(element: String, useAnimation: Boolean): PanelBar = js.native
  def collapse(element: JQuery, useAnimation: Boolean): PanelBar = js.native
  def collapse(element: Element, useAnimation: Boolean): PanelBar = js.native
  def dataItem(node: String): Node = js.native
  def dataItem(node: JQuery): Node = js.native
  def dataItem(node: Element): Node = js.native
  def enable(element: String, enable: Boolean): Unit = js.native
  def enable(element: JQuery, enable: Boolean): Unit = js.native
  def enable(element: Element, enable: Boolean): Unit = js.native
  def expand(element: String, useAnimation: Boolean): PanelBar = js.native
  def expand(element: JQuery, useAnimation: Boolean): PanelBar = js.native
  def expand(element: Element, useAnimation: Boolean): PanelBar = js.native
  def insertAfter(item: String, referenceItem: String): Unit = js.native
  def insertAfter(item: String, referenceItem: JQuery): Unit = js.native
  def insertAfter(item: String, referenceItem: Element): Unit = js.native
  def insertAfter(item: js.Any, referenceItem: String): Unit = js.native
  def insertAfter(item: js.Any, referenceItem: JQuery): Unit = js.native
  def insertAfter(item: js.Any, referenceItem: Element): Unit = js.native
  def insertAfter(item: JQuery, referenceItem: String): Unit = js.native
  def insertAfter(item: JQuery, referenceItem: JQuery): Unit = js.native
  def insertAfter(item: JQuery, referenceItem: Element): Unit = js.native
  def insertAfter(item: Element, referenceItem: String): Unit = js.native
  def insertAfter(item: Element, referenceItem: JQuery): Unit = js.native
  def insertAfter(item: Element, referenceItem: Element): Unit = js.native
  def insertBefore(item: String, referenceItem: String): PanelBar = js.native
  def insertBefore(item: String, referenceItem: JQuery): PanelBar = js.native
  def insertBefore(item: String, referenceItem: Element): PanelBar = js.native
  def insertBefore(item: js.Any, referenceItem: String): PanelBar = js.native
  def insertBefore(item: js.Any, referenceItem: JQuery): PanelBar = js.native
  def insertBefore(item: js.Any, referenceItem: Element): PanelBar = js.native
  def insertBefore(item: JQuery, referenceItem: String): PanelBar = js.native
  def insertBefore(item: JQuery, referenceItem: JQuery): PanelBar = js.native
  def insertBefore(item: JQuery, referenceItem: Element): PanelBar = js.native
  def insertBefore(item: Element, referenceItem: String): PanelBar = js.native
  def insertBefore(item: Element, referenceItem: JQuery): PanelBar = js.native
  def insertBefore(item: Element, referenceItem: Element): PanelBar = js.native
  def reload(element: String): Unit = js.native
  def reload(element: JQuery): Unit = js.native
  def reload(element: Element): Unit = js.native
  def remove(element: String): Unit = js.native
  def remove(element: JQuery): Unit = js.native
  def remove(element: Element): Unit = js.native
  def select(): JQuery = js.native
  def select(element: String): Unit = js.native
  def select(element: JQuery): Unit = js.native
  def select(element: Element): Unit = js.native
  @JSName("select")
  def select_Unit(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.PanelBar")
@js.native
object PanelBar extends js.Object {
  var fn: PanelBar = js.native
  def extend(proto: js.Object): PanelBar = js.native
}

