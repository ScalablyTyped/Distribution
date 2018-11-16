package typings
package kendoDashUiLib.kendoNs.datavizNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Circle")
@js.native
class Circle protected ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(center: js.Any, radius: scala.Double) = this()
  def this(center: kendoDashUiLib.kendoNs.geometryNs.Point, radius: scala.Double) = this()
  var center: kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  var options: CircleOptions = js.native
  var radius: scala.Double = js.native
  def bbox(matrix: kendoDashUiLib.kendoNs.geometryNs.Matrix): kendoDashUiLib.kendoNs.geometryNs.Rect = js.native
  def equals(other: kendoDashUiLib.kendoNs.geometryNs.Circle): scala.Boolean = js.native
  def getCenter(): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def getRadius(): scala.Double = js.native
  def pointAt(angle: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def setCenter(value: js.Any): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def setCenter(value: kendoDashUiLib.kendoNs.geometryNs.Point): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def setRadius(value: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Circle = js.native
}

