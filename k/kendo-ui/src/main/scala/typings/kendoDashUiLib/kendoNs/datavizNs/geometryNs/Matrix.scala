package typings
package kendoDashUiLib.kendoNs.datavizNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Matrix")
@js.native
class Matrix ()
  extends kendoDashUiLib.kendoNs.Observable {
  var a: scala.Double = js.native
  var b: scala.Double = js.native
  var c: scala.Double = js.native
  var d: scala.Double = js.native
  var e: scala.Double = js.native
  var f: scala.Double = js.native
  var options: MatrixOptions = js.native
  def equals(other: kendoDashUiLib.kendoNs.geometryNs.Matrix): scala.Boolean = js.native
  def multiplyCopy(matrix: kendoDashUiLib.kendoNs.geometryNs.Matrix): kendoDashUiLib.kendoNs.geometryNs.Matrix = js.native
  def round(digits: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Matrix = js.native
  def toArray(digits: scala.Double): js.Any = js.native
  def toString(digits: scala.Double, separator: java.lang.String): java.lang.String = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.geometry.Matrix")
@js.native
object Matrix extends js.Object {
  def rotate(angle: scala.Double, x: scala.Double, y: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Matrix = js.native
  def scale(scaleX: scala.Double, scaleY: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Matrix = js.native
  def translate(x: scala.Double, y: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Matrix = js.native
  def unit(): kendoDashUiLib.kendoNs.geometryNs.Matrix = js.native
}

