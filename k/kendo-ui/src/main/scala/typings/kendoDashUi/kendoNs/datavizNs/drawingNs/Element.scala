package typings.kendoDashUi.kendoNs.datavizNs.drawingNs

import typings.kendoDashUi.kendoNs.Class
import typings.kendoDashUi.kendoNs.geometryNs.Point
import typings.kendoDashUi.kendoNs.geometryNs.Transformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Element")
@js.native
class Element () extends Class {
  def this(options: ElementOptions) = this()
  var options: ElementOptions = js.native
  var parent: typings.kendoDashUi.kendoNs.drawingNs.Group = js.native
  def bbox(): typings.kendoDashUi.kendoNs.geometryNs.Rect = js.native
  def clip(): typings.kendoDashUi.kendoNs.drawingNs.Path = js.native
  def clip(clip: typings.kendoDashUi.kendoNs.drawingNs.Path): Unit = js.native
  def clippedBBox(): typings.kendoDashUi.kendoNs.geometryNs.Rect = js.native
  def containsPoint(point: Point): Boolean = js.native
  def opacity(): Double = js.native
  def opacity(opacity: Double): Unit = js.native
  def transform(): Transformation = js.native
  def transform(transform: Transformation): Unit = js.native
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}

