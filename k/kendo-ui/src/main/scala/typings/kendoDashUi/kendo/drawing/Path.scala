package typings.kendoDashUi.kendo.drawing

import typings.kendoDashUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing.Path")
@js.native
class Path () extends Element {
  def this(options: PathOptions) = this()
  @JSName("options")
  var options_Path: PathOptions = js.native
  var segments: js.Any = js.native
  def close(): Path = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: js.Any): Path = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: Point): Path = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: js.Any): Path = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: Point): Path = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: js.Any): Path = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: Point): Path = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: js.Any): Path = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Point): Path = js.native
  def fill(color: String): Path = js.native
  def fill(color: String, opacity: Double): Path = js.native
  def lineTo(x: js.Any): Path = js.native
  def lineTo(x: js.Any, y: Double): Path = js.native
  def lineTo(x: Double): Path = js.native
  def lineTo(x: Double, y: Double): Path = js.native
  def lineTo(x: Point): Path = js.native
  def lineTo(x: Point, y: Double): Path = js.native
  def moveTo(x: js.Any): Path = js.native
  def moveTo(x: js.Any, y: Double): Path = js.native
  def moveTo(x: Double): Path = js.native
  def moveTo(x: Double, y: Double): Path = js.native
  def moveTo(x: Point): Path = js.native
  def moveTo(x: Point, y: Double): Path = js.native
  def stroke(color: String): Path = js.native
  def stroke(color: String, width: Double): Path = js.native
  def stroke(color: String, width: Double, opacity: Double): Path = js.native
}

/* static members */
@JSGlobal("kendo.drawing.Path")
@js.native
object Path extends js.Object {
  def fromArc(arc: typings.kendoDashUi.kendo.geometry.Arc): Path = js.native
  def fromArc(arc: typings.kendoDashUi.kendo.geometry.Arc, options: js.Any): Path = js.native
  def fromPoints(points: js.Any): Path = js.native
  def fromPoints(points: js.Any, options: js.Any): Path = js.native
  def fromRect(rect: typings.kendoDashUi.kendo.geometry.Rect): Path = js.native
  def fromRect(rect: typings.kendoDashUi.kendo.geometry.Rect, options: js.Any): Path = js.native
  def parse(svgPath: String): MultiPath = js.native
  def parse(svgPath: String, options: js.Any): MultiPath = js.native
}

