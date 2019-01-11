package typings
package kendoDashUiLib.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing")
@js.native
object ^ extends js.Object {
  def align(elements: js.Any, rect: kendoDashUiLib.kendoNs.geometryNs.Rect, alignment: java.lang.String): scala.Unit = js.native
  def drawDOM(element: kendoDashUiLib.JQuery, options: js.Any): kendoDashUiLib.JQueryPromise[_] = js.native
  def exportImage(group: kendoDashUiLib.kendoNs.drawingNs.Group, options: js.Any): kendoDashUiLib.JQueryPromise[_] = js.native
  def exportPDF(
    group: kendoDashUiLib.kendoNs.drawingNs.Group,
    options: kendoDashUiLib.kendoNs.drawingNs.PDFOptions
  ): kendoDashUiLib.JQueryPromise[_] = js.native
  def exportSVG(group: kendoDashUiLib.kendoNs.drawingNs.Group, options: js.Any): kendoDashUiLib.JQueryPromise[_] = js.native
  def fit(element: kendoDashUiLib.kendoNs.drawingNs.Element, rect: kendoDashUiLib.kendoNs.geometryNs.Rect): scala.Unit = js.native
  def stack(elements: js.Any): scala.Unit = js.native
  def vAlign(elements: js.Any, rect: kendoDashUiLib.kendoNs.geometryNs.Rect, alignment: java.lang.String): scala.Unit = js.native
  def vStack(elements: js.Any): scala.Unit = js.native
  def vWrap(elements: js.Any, rect: kendoDashUiLib.kendoNs.geometryNs.Rect): js.Any = js.native
  def wrap(elements: js.Any, rect: kendoDashUiLib.kendoNs.geometryNs.Rect): js.Any = js.native
}

