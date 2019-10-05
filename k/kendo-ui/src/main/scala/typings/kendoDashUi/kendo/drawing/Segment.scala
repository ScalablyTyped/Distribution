package typings.kendoDashUi.kendo.drawing

import typings.kendoDashUi.kendo.Class
import typings.kendoDashUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing.Segment")
@js.native
class Segment protected () extends Class {
  def this(anchor: Point, controlIn: Point, controlOut: Point) = this()
  var options: SegmentOptions = js.native
  def anchor(): Point = js.native
  def anchor(value: Point): Unit = js.native
  def controlIn(): Point = js.native
  def controlIn(value: Point): Unit = js.native
  def controlOut(): Point = js.native
  def controlOut(value: Point): Unit = js.native
}

