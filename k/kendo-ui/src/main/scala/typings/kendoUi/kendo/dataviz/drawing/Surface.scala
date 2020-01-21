package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Surface")
@js.native
class Surface () extends Observable_ {
  def this(options: SurfaceOptions) = this()
  var element: JQuery = js.native
  var options: SurfaceOptions = js.native
  def clear(): Unit = js.native
  def draw(element: typings.kendoUi.kendo.drawing.Element): Unit = js.native
  def eventTarget(e: js.Any): typings.kendoUi.kendo.drawing.Element = js.native
  def hideTooltip(): Unit = js.native
  def resize(): Unit = js.native
  def resize(force: Boolean): Unit = js.native
  def showTooltip(element: typings.kendoUi.kendo.drawing.Element): Unit = js.native
  def showTooltip(element: typings.kendoUi.kendo.drawing.Element, options: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.drawing.Surface")
@js.native
object Surface extends js.Object {
  def create(element: JQuery): typings.kendoUi.kendo.drawing.Surface = js.native
  def create(element: JQuery, options: js.Any): typings.kendoUi.kendo.drawing.Surface = js.native
  def create(element: Element): typings.kendoUi.kendo.drawing.Surface = js.native
  def create(element: Element, options: js.Any): typings.kendoUi.kendo.drawing.Surface = js.native
}

