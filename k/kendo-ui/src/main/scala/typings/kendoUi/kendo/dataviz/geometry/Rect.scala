package typings.kendoUi.kendo.dataviz.geometry

import typings.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Rect")
@js.native
class Rect protected () extends Observable_ {
  def this(origin: js.Any, size: js.Any) = this()
  def this(origin: js.Any, size: typings.kendoUi.kendo.geometry.Size) = this()
  def this(origin: typings.kendoUi.kendo.geometry.Point, size: js.Any) = this()
  def this(origin: typings.kendoUi.kendo.geometry.Point, size: typings.kendoUi.kendo.geometry.Size) = this()
  var options: RectOptions = js.native
  var origin: typings.kendoUi.kendo.geometry.Point = js.native
  var size: typings.kendoUi.kendo.geometry.Size = js.native
  def bbox(matrix: typings.kendoUi.kendo.geometry.Matrix): typings.kendoUi.kendo.geometry.Rect = js.native
  def bottomLeft(): typings.kendoUi.kendo.geometry.Point = js.native
  def bottomRight(): typings.kendoUi.kendo.geometry.Point = js.native
  def center(): typings.kendoUi.kendo.geometry.Point = js.native
  def equals(other: typings.kendoUi.kendo.geometry.Rect): Boolean = js.native
  def getOrigin(): typings.kendoUi.kendo.geometry.Point = js.native
  def getSize(): typings.kendoUi.kendo.geometry.Size = js.native
  def height(): Double = js.native
  def setOrigin(value: js.Any): typings.kendoUi.kendo.geometry.Rect = js.native
  def setOrigin(value: typings.kendoUi.kendo.geometry.Point): typings.kendoUi.kendo.geometry.Rect = js.native
  def setSize(value: js.Any): typings.kendoUi.kendo.geometry.Rect = js.native
  def setSize(value: typings.kendoUi.kendo.geometry.Size): typings.kendoUi.kendo.geometry.Rect = js.native
  def topLeft(): typings.kendoUi.kendo.geometry.Point = js.native
  def topRight(): typings.kendoUi.kendo.geometry.Point = js.native
  def width(): Double = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.geometry.Rect")
@js.native
object Rect extends js.Object {
  def fromPoints(pointA: typings.kendoUi.kendo.geometry.Point, pointB: typings.kendoUi.kendo.geometry.Point): typings.kendoUi.kendo.geometry.Rect = js.native
  def union(rectA: typings.kendoUi.kendo.geometry.Rect, rectB: typings.kendoUi.kendo.geometry.Rect): typings.kendoUi.kendo.geometry.Rect = js.native
}

