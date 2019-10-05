package typings.kendoDashUi.kendo.dataviz.drawing

import typings.kendoDashUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.MultiPath")
@js.native
class MultiPath ()
  extends typings.kendoDashUi.kendo.drawing.Element {
  def this(options: MultiPathOptions) = this()
  @JSName("options")
  var options_MultiPath: MultiPathOptions = js.native
  var paths: js.Any = js.native
  def close(): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: js.Any): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: Point): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: js.Any): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: Point): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: js.Any): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: Point): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: js.Any): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Point): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def fill(color: String): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def fill(color: String, opacity: Double): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: js.Any): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: js.Any, y: Double): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Double): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Double, y: Double): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Point): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Point, y: Double): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: js.Any): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: js.Any, y: Double): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Double): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Double, y: Double): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Point): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Point, y: Double): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def stroke(color: String): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def stroke(color: String, width: Double): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
  def stroke(color: String, width: Double, opacity: Double): typings.kendoDashUi.kendo.drawing.MultiPath = js.native
}

