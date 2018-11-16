package typings
package kendoDashUiLib.kendoNs.datavizNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Point")
@js.native
class Point protected ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(x: scala.Double, y: scala.Double) = this()
  var options: PointOptions = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def distanceTo(point: kendoDashUiLib.kendoNs.geometryNs.Point): scala.Double = js.native
  def equals(other: kendoDashUiLib.kendoNs.geometryNs.Point): scala.Boolean = js.native
  def getX(): scala.Double = js.native
  def getY(): scala.Double = js.native
  def move(x: scala.Double, y: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def rotate(angle: scala.Double, center: js.Any): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def rotate(angle: scala.Double, center: kendoDashUiLib.kendoNs.geometryNs.Point): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def round(digits: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def scale(scaleX: scala.Double, scaleY: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def scaleCopy(scaleX: scala.Double, scaleY: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def setX(value: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def setY(value: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def toArray(digits: scala.Double): js.Any = js.native
  def toString(digits: scala.Double, separator: java.lang.String): java.lang.String = js.native
  def transform(tansformation: kendoDashUiLib.kendoNs.geometryNs.Transformation): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def transformCopy(tansformation: kendoDashUiLib.kendoNs.geometryNs.Transformation): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def translate(dx: scala.Double, dy: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def translateWith(vector: js.Any): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def translateWith(vector: kendoDashUiLib.kendoNs.geometryNs.Point): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
}

@JSGlobal("kendo.dataviz.geometry.Point")
@js.native
object Point extends js.Object {
  def create(x: js.Any, y: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def create(x: kendoDashUiLib.kendoNs.geometryNs.Point, y: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def create(x: scala.Double, y: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def max(): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def maxPoint(): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def min(): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def minPoint(): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
}

