package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Element")
@js.native
class Element ()
  extends kendoDashUiLib.kendoNs.Class {
  def this(options: ElementOptions) = this()
  var options: ElementOptions = js.native
  var parent: kendoDashUiLib.kendoNs.drawingNs.Group = js.native
  def bbox(): kendoDashUiLib.kendoNs.geometryNs.Rect = js.native
  def clip(): kendoDashUiLib.kendoNs.drawingNs.Path = js.native
  def clip(clip: kendoDashUiLib.kendoNs.drawingNs.Path): scala.Unit = js.native
  def clippedBBox(): kendoDashUiLib.kendoNs.geometryNs.Rect = js.native
  def containsPoint(point: kendoDashUiLib.kendoNs.geometryNs.Point): scala.Boolean = js.native
  def opacity(): scala.Double = js.native
  def opacity(opacity: scala.Double): scala.Unit = js.native
  def transform(): kendoDashUiLib.kendoNs.geometryNs.Transformation = js.native
  def transform(transform: kendoDashUiLib.kendoNs.geometryNs.Transformation): scala.Unit = js.native
  def visible(): scala.Boolean = js.native
  def visible(visible: scala.Boolean): scala.Unit = js.native
}

