package typings.kendoDashUi.kendo.dataviz.drawing

import typings.kendoDashUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Path")
@js.native
class Path ()
  extends typings.kendoDashUi.kendo.drawing.Element {
  def this(options: PathOptions) = this()
  @JSName("options")
  var options_Path: PathOptions = js.native
  var segments: js.Any = js.native
  def close(): typings.kendoDashUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: js.Any): typings.kendoDashUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: Point): typings.kendoDashUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: js.Any): typings.kendoDashUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: Point): typings.kendoDashUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: js.Any): typings.kendoDashUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: Point): typings.kendoDashUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: js.Any): typings.kendoDashUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Point): typings.kendoDashUi.kendo.drawing.Path = js.native
  def fill(color: String): typings.kendoDashUi.kendo.drawing.Path = js.native
  def fill(color: String, opacity: Double): typings.kendoDashUi.kendo.drawing.Path = js.native
  def lineTo(x: js.Any): typings.kendoDashUi.kendo.drawing.Path = js.native
  def lineTo(x: js.Any, y: Double): typings.kendoDashUi.kendo.drawing.Path = js.native
  def lineTo(x: Double): typings.kendoDashUi.kendo.drawing.Path = js.native
  def lineTo(x: Double, y: Double): typings.kendoDashUi.kendo.drawing.Path = js.native
  def lineTo(x: Point): typings.kendoDashUi.kendo.drawing.Path = js.native
  def lineTo(x: Point, y: Double): typings.kendoDashUi.kendo.drawing.Path = js.native
  def moveTo(x: js.Any): typings.kendoDashUi.kendo.drawing.Path = js.native
  def moveTo(x: js.Any, y: Double): typings.kendoDashUi.kendo.drawing.Path = js.native
  def moveTo(x: Double): typings.kendoDashUi.kendo.drawing.Path = js.native
  def moveTo(x: Double, y: Double): typings.kendoDashUi.kendo.drawing.Path = js.native
  def moveTo(x: Point): typings.kendoDashUi.kendo.drawing.Path = js.native
  def moveTo(x: Point, y: Double): typings.kendoDashUi.kendo.drawing.Path = js.native
  def stroke(color: String): typings.kendoDashUi.kendo.drawing.Path = js.native
  def stroke(color: String, width: Double): typings.kendoDashUi.kendo.drawing.Path = js.native
  def stroke(color: String, width: Double, opacity: Double): typings.kendoDashUi.kendo.drawing.Path = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.drawing.Path")
@js.native
object Path extends js.Object {
  def fromArc(arc: typings.kendoDashUi.kendo.geometry.Arc): typings.kendoDashUi.kendo.drawing.Path = js.native
  def fromArc(arc: typings.kendoDashUi.kendo.geometry.Arc, options: js.Any): typings.kendoDashUi.kendo.drawing.Path = js.native
  def fromPoints(points: js.Any): typings.kendoDashUi.kendo.drawing.Path = js.native
  def fromPoints(points: js.Any, options: js.Any): typings.kendoDashUi.kendo.drawing.Path = js.native
  def fromRect(rect: typings.kendoDashUi.kendo.geometry.Rect): typings.kendoDashUi.kendo.drawing.Path = js.native
  def fromRect(rect: typings.kendoDashUi.kendo.geometry.Rect, options: js.Any): typings.kendoDashUi.kendo.drawing.Path = js.native
  def parse(svgPath: String): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def parse(svgPath: String, options: js.Any): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
}

