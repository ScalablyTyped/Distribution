package typings.kendoDashUi.kendo.dataviz.geometry

import typings.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Rect")
@js.native
class Rect protected () extends Observable {
  def this(origin: js.Any, size: js.Any) = this()
  def this(origin: js.Any, size: typings.kendoDashUi.kendo.geometry.Size) = this()
  def this(origin: typings.kendoDashUi.kendo.geometry.Point, size: js.Any) = this()
  def this(origin: typings.kendoDashUi.kendo.geometry.Point, size: typings.kendoDashUi.kendo.geometry.Size) = this()
  var options: RectOptions = js.native
  var origin: typings.kendoDashUi.kendo.geometry.Point = js.native
  var size: typings.kendoDashUi.kendo.geometry.Size = js.native
  def bbox(matrix: typings.kendoDashUi.kendo.geometry.Matrix): typings.kendoDashUi.kendo.geometry.Rect = js.native
  def bottomLeft(): typings.kendoDashUi.kendo.geometry.Point = js.native
  def bottomRight(): typings.kendoDashUi.kendo.geometry.Point = js.native
  def center(): typings.kendoDashUi.kendo.geometry.Point = js.native
  def equals(other: typings.kendoDashUi.kendo.geometry.Rect): Boolean = js.native
  def getOrigin(): typings.kendoDashUi.kendo.geometry.Point = js.native
  def getSize(): typings.kendoDashUi.kendo.geometry.Size = js.native
  def height(): Double = js.native
  def setOrigin(value: js.Any): typings.kendoDashUi.kendo.geometry.Rect = js.native
  def setOrigin(value: typings.kendoDashUi.kendo.geometry.Point): typings.kendoDashUi.kendo.geometry.Rect = js.native
  def setSize(value: js.Any): typings.kendoDashUi.kendo.geometry.Rect = js.native
  def setSize(value: typings.kendoDashUi.kendo.geometry.Size): typings.kendoDashUi.kendo.geometry.Rect = js.native
  def topLeft(): typings.kendoDashUi.kendo.geometry.Point = js.native
  def topRight(): typings.kendoDashUi.kendo.geometry.Point = js.native
  def width(): Double = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.geometry.Rect")
@js.native
object Rect extends js.Object {
  def fromPoints(pointA: typings.kendoDashUi.kendo.geometry.Point, pointB: typings.kendoDashUi.kendo.geometry.Point): typings.kendoDashUi.kendo.geometry.Rect = js.native
  def union(rectA: typings.kendoDashUi.kendo.geometry.Rect, rectB: typings.kendoDashUi.kendo.geometry.Rect): typings.kendoDashUi.kendo.geometry.Rect = js.native
}

