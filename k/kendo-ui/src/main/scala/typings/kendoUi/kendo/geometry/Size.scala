package typings.kendoUi.kendo.geometry

import typings.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.geometry.Size")
@js.native
class Size () extends Observable_ {
  var height: Double = js.native
  var options: SizeOptions = js.native
  var width: Double = js.native
  def equals(other: Size): Boolean = js.native
  def getHeight(): Double = js.native
  def getWidth(): Double = js.native
  def setHeight(value: Double): Size = js.native
  def setWidth(value: Double): Size = js.native
}

/* static members */
@JSGlobal("kendo.geometry.Size")
@js.native
object Size extends js.Object {
  def create(width: js.Any, height: Double): Size = js.native
  def create(width: Double, height: Double): Size = js.native
  def create(width: Size, height: Double): Size = js.native
}

