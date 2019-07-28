package typings.kendoDashUi.kendoNs.datavizNs.drawingNs

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendoNs.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Surface")
@js.native
class Surface () extends Observable {
  def this(options: SurfaceOptions) = this()
  var element: JQuery = js.native
  var options: SurfaceOptions = js.native
  def clear(): Unit = js.native
  def draw(element: typings.kendoDashUi.kendoNs.drawingNs.Element): Unit = js.native
  def eventTarget(e: js.Any): typings.kendoDashUi.kendoNs.drawingNs.Element = js.native
  def hideTooltip(): Unit = js.native
  def resize(): Unit = js.native
  def resize(force: Boolean): Unit = js.native
  def showTooltip(element: typings.kendoDashUi.kendoNs.drawingNs.Element): Unit = js.native
  def showTooltip(element: typings.kendoDashUi.kendoNs.drawingNs.Element, options: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.drawing.Surface")
@js.native
object Surface extends js.Object {
  def create(element: JQuery): typings.kendoDashUi.kendoNs.drawingNs.Surface = js.native
  def create(element: JQuery, options: js.Any): typings.kendoDashUi.kendoNs.drawingNs.Surface = js.native
  def create(element: Element): typings.kendoDashUi.kendoNs.drawingNs.Surface = js.native
  def create(element: Element, options: js.Any): typings.kendoDashUi.kendoNs.drawingNs.Surface = js.native
}

