package typings.kendoDashUi.kendoNs.datavizNs.geometryNs

import typings.kendoDashUi.kendoNs.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Rect")
@js.native
class Rect protected () extends Observable {
  def this(origin: js.Any, size: js.Any) = this()
  def this(origin: js.Any, size: typings.kendoDashUi.kendoNs.geometryNs.Size) = this()
  def this(origin: typings.kendoDashUi.kendoNs.geometryNs.Point, size: js.Any) = this()
  def this(
    origin: typings.kendoDashUi.kendoNs.geometryNs.Point,
    size: typings.kendoDashUi.kendoNs.geometryNs.Size
  ) = this()
  var options: RectOptions = js.native
  var origin: typings.kendoDashUi.kendoNs.geometryNs.Point = js.native
  var size: typings.kendoDashUi.kendoNs.geometryNs.Size = js.native
  def bbox(matrix: typings.kendoDashUi.kendoNs.geometryNs.Matrix): typings.kendoDashUi.kendoNs.geometryNs.Rect = js.native
  def bottomLeft(): typings.kendoDashUi.kendoNs.geometryNs.Point = js.native
  def bottomRight(): typings.kendoDashUi.kendoNs.geometryNs.Point = js.native
  def center(): typings.kendoDashUi.kendoNs.geometryNs.Point = js.native
  def equals(other: typings.kendoDashUi.kendoNs.geometryNs.Rect): Boolean = js.native
  def getOrigin(): typings.kendoDashUi.kendoNs.geometryNs.Point = js.native
  def getSize(): typings.kendoDashUi.kendoNs.geometryNs.Size = js.native
  def height(): Double = js.native
  def setOrigin(value: js.Any): typings.kendoDashUi.kendoNs.geometryNs.Rect = js.native
  def setOrigin(value: typings.kendoDashUi.kendoNs.geometryNs.Point): typings.kendoDashUi.kendoNs.geometryNs.Rect = js.native
  def setSize(value: js.Any): typings.kendoDashUi.kendoNs.geometryNs.Rect = js.native
  def setSize(value: typings.kendoDashUi.kendoNs.geometryNs.Size): typings.kendoDashUi.kendoNs.geometryNs.Rect = js.native
  def topLeft(): typings.kendoDashUi.kendoNs.geometryNs.Point = js.native
  def topRight(): typings.kendoDashUi.kendoNs.geometryNs.Point = js.native
  def width(): Double = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.geometry.Rect")
@js.native
object Rect extends js.Object {
  def fromPoints(
    pointA: typings.kendoDashUi.kendoNs.geometryNs.Point,
    pointB: typings.kendoDashUi.kendoNs.geometryNs.Point
  ): typings.kendoDashUi.kendoNs.geometryNs.Rect = js.native
  def union(
    rectA: typings.kendoDashUi.kendoNs.geometryNs.Rect,
    rectB: typings.kendoDashUi.kendoNs.geometryNs.Rect
  ): typings.kendoDashUi.kendoNs.geometryNs.Rect = js.native
}

