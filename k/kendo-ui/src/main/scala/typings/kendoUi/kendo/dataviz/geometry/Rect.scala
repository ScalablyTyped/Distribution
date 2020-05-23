package typings.kendoUi.kendo.dataviz.geometry

import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rect extends Observable {
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

