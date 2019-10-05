package typings.kendoDashUi.kendo.dataviz.drawing

import typings.kendoDashUi.kendo.Class
import typings.kendoDashUi.kendo.geometry.Point
import typings.kendoDashUi.kendo.geometry.Transformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Element")
@js.native
class Element () extends Class {
  def this(options: ElementOptions) = this()
  var options: ElementOptions = js.native
  var parent: typings.kendoDashUi.kendo.drawing.Group = js.native
  def bbox(): typings.kendoDashUi.kendo.geometry.Rect = js.native
  def clip(): typings.kendoDashUi.kendo.drawing.Path = js.native
  def clip(clip: typings.kendoDashUi.kendo.drawing.Path): Unit = js.native
  def clippedBBox(): typings.kendoDashUi.kendo.geometry.Rect = js.native
  def containsPoint(point: Point): Boolean = js.native
  def opacity(): Double = js.native
  def opacity(opacity: Double): Unit = js.native
  def transform(): Transformation = js.native
  def transform(transform: Transformation): Unit = js.native
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}

