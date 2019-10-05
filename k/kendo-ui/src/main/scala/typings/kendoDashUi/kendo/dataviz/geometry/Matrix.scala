package typings.kendoDashUi.kendo.dataviz.geometry

import typings.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Matrix")
@js.native
class Matrix () extends Observable {
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var e: Double = js.native
  var f: Double = js.native
  var options: MatrixOptions = js.native
  def equals(other: typings.kendoDashUi.kendo.geometry.Matrix): Boolean = js.native
  def multiplyCopy(matrix: typings.kendoDashUi.kendo.geometry.Matrix): typings.kendoDashUi.kendo.geometry.Matrix = js.native
  def round(digits: Double): typings.kendoDashUi.kendo.geometry.Matrix = js.native
  def toArray(digits: Double): js.Any = js.native
  def toString(digits: Double, separator: String): String = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.geometry.Matrix")
@js.native
object Matrix extends js.Object {
  def rotate(angle: Double, x: Double, y: Double): typings.kendoDashUi.kendo.geometry.Matrix = js.native
  def scale(scaleX: Double, scaleY: Double): typings.kendoDashUi.kendo.geometry.Matrix = js.native
  def translate(x: Double, y: Double): typings.kendoDashUi.kendo.geometry.Matrix = js.native
  def unit(): typings.kendoDashUi.kendo.geometry.Matrix = js.native
}

