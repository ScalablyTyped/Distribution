package typings
package kendoDashUiLib.kendoNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.geometry.Circle")
@js.native
class Circle protected ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(center: js.Any, radius: scala.Double) = this()
  def this(center: Point, radius: scala.Double) = this()
  var center: Point = js.native
  var options: CircleOptions = js.native
  var radius: scala.Double = js.native
  def bbox(matrix: Matrix): Rect = js.native
  def equals(other: Circle): scala.Boolean = js.native
  def getCenter(): Point = js.native
  def getRadius(): scala.Double = js.native
  def pointAt(angle: scala.Double): Point = js.native
  def setCenter(value: js.Any): Point = js.native
  def setCenter(value: Point): Point = js.native
  def setRadius(value: scala.Double): Circle = js.native
}

