package typings.kendoUi.kendo.dataviz.geometry

import typings.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Matrix")
@js.native
class Matrix () extends Observable_ {
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var e: Double = js.native
  var f: Double = js.native
  var options: MatrixOptions = js.native
  def equals(other: typings.kendoUi.kendo.geometry.Matrix): Boolean = js.native
  def multiplyCopy(matrix: typings.kendoUi.kendo.geometry.Matrix): typings.kendoUi.kendo.geometry.Matrix = js.native
  def round(digits: Double): typings.kendoUi.kendo.geometry.Matrix = js.native
  def toArray(digits: Double): js.Any = js.native
  def toString(digits: Double, separator: String): String = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.geometry.Matrix")
@js.native
object Matrix extends js.Object {
  def rotate(angle: Double, x: Double, y: Double): typings.kendoUi.kendo.geometry.Matrix = js.native
  def scale(scaleX: Double, scaleY: Double): typings.kendoUi.kendo.geometry.Matrix = js.native
  def translate(x: Double, y: Double): typings.kendoUi.kendo.geometry.Matrix = js.native
  def unit(): typings.kendoUi.kendo.geometry.Matrix = js.native
}

