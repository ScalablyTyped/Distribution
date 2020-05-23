package typings.kendoUi.kendo.geometry

import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rect extends Observable {
  var options: RectOptions = js.native
  var origin: Point = js.native
  var size: Size = js.native
  def bbox(matrix: Matrix): Rect = js.native
  def bottomLeft(): Point = js.native
  def bottomRight(): Point = js.native
  def center(): Point = js.native
  def equals(other: Rect): Boolean = js.native
  def getOrigin(): Point = js.native
  def getSize(): Size = js.native
  def height(): Double = js.native
  def setOrigin(value: js.Any): Rect = js.native
  def setOrigin(value: Point): Rect = js.native
  def setSize(value: js.Any): Rect = js.native
  def setSize(value: Size): Rect = js.native
  def topLeft(): Point = js.native
  def topRight(): Point = js.native
  def width(): Double = js.native
}

