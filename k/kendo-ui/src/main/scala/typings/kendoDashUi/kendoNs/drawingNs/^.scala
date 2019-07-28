package typings.kendoDashUi.kendoNs.drawingNs

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing")
@js.native
object ^ extends js.Object {
  def align(elements: js.Any, rect: typings.kendoDashUi.kendoNs.geometryNs.Rect, alignment: String): Unit = js.native
  def drawDOM(element: JQuery, options: js.Any): JQueryPromise[_] = js.native
  def exportImage(group: Group, options: js.Any): JQueryPromise[_] = js.native
  def exportPDF(group: Group, options: PDFOptions): JQueryPromise[_] = js.native
  def exportSVG(group: Group, options: js.Any): JQueryPromise[_] = js.native
  def fit(element: Element, rect: typings.kendoDashUi.kendoNs.geometryNs.Rect): Unit = js.native
  def stack(elements: js.Any): Unit = js.native
  def vAlign(elements: js.Any, rect: typings.kendoDashUi.kendoNs.geometryNs.Rect, alignment: String): Unit = js.native
  def vStack(elements: js.Any): Unit = js.native
  def vWrap(elements: js.Any, rect: typings.kendoDashUi.kendoNs.geometryNs.Rect): js.Any = js.native
  def wrap(elements: js.Any, rect: typings.kendoDashUi.kendoNs.geometryNs.Rect): js.Any = js.native
}

