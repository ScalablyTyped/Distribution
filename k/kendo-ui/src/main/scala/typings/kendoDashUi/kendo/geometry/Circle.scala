package typings.kendoDashUi.kendo.geometry

import typings.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.geometry.Circle")
@js.native
class Circle protected () extends Observable {
  def this(center: js.Any, radius: Double) = this()
  def this(center: Point, radius: Double) = this()
  var center: Point = js.native
  var options: CircleOptions = js.native
  var radius: Double = js.native
  def bbox(matrix: Matrix): Rect = js.native
  def equals(other: Circle): Boolean = js.native
  def getCenter(): Point = js.native
  def getRadius(): Double = js.native
  def pointAt(angle: Double): Point = js.native
  def setCenter(value: js.Any): Point = js.native
  def setCenter(value: Point): Point = js.native
  def setRadius(value: Double): Circle = js.native
}

