package typings.kendoUi.kendo.geometry

import typings.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.geometry.Matrix")
@js.native
class Matrix () extends Observable_ {
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var e: Double = js.native
  var f: Double = js.native
  var options: MatrixOptions = js.native
  def equals(other: Matrix): Boolean = js.native
  def multiplyCopy(matrix: Matrix): Matrix = js.native
  def round(digits: Double): Matrix = js.native
  def toArray(digits: Double): js.Any = js.native
  def toString(digits: Double, separator: String): String = js.native
}

/* static members */
@JSGlobal("kendo.geometry.Matrix")
@js.native
object Matrix extends js.Object {
  def rotate(angle: Double, x: Double, y: Double): Matrix = js.native
  def scale(scaleX: Double, scaleY: Double): Matrix = js.native
  def translate(x: Double, y: Double): Matrix = js.native
  def unit(): Matrix = js.native
}

