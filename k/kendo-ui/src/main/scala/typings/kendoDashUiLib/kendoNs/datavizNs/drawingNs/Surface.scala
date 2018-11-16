package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Surface")
@js.native
class Surface ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(options: SurfaceOptions) = this()
  var options: SurfaceOptions = js.native
  def clear(): scala.Unit = js.native
  def draw(element: kendoDashUiLib.kendoNs.drawingNs.Element): scala.Unit = js.native
  def eventTarget(e: js.Any): kendoDashUiLib.kendoNs.drawingNs.Element = js.native
  def hideTooltip(): scala.Unit = js.native
  def resize(): scala.Unit = js.native
  def resize(force: scala.Boolean): scala.Unit = js.native
  def showTooltip(element: kendoDashUiLib.kendoNs.drawingNs.Element): scala.Unit = js.native
  def showTooltip(element: kendoDashUiLib.kendoNs.drawingNs.Element, options: js.Any): scala.Unit = js.native
}

@JSGlobal("kendo.dataviz.drawing.Surface")
@js.native
object Surface extends js.Object {
  def create(element: kendoDashUiLib.JQuery): kendoDashUiLib.kendoNs.drawingNs.Surface = js.native
  def create(element: kendoDashUiLib.JQuery, options: js.Any): kendoDashUiLib.kendoNs.drawingNs.Surface = js.native
  def create(element: kendoDashUiLib.kendoNs.datavizNs.drawingNs.Element): kendoDashUiLib.kendoNs.drawingNs.Surface = js.native
  def create(element: kendoDashUiLib.kendoNs.datavizNs.drawingNs.Element, options: js.Any): kendoDashUiLib.kendoNs.drawingNs.Surface = js.native
}

