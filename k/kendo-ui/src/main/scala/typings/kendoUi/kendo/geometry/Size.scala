package typings.kendoUi.kendo.geometry

import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Size extends Observable {
  var height: Double = js.native
  var options: SizeOptions = js.native
  var width: Double = js.native
  def equals(other: Size): Boolean = js.native
  def getHeight(): Double = js.native
  def getWidth(): Double = js.native
  def setHeight(value: Double): Size = js.native
  def setWidth(value: Double): Size = js.native
}

