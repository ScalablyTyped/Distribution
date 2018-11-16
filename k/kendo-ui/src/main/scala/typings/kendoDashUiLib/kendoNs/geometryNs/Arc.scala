package typings
package kendoDashUiLib.kendoNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.geometry.Arc")
@js.native
class Arc protected ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(center: js.Any) = this()
  def this(center: Point) = this()
  def this(center: js.Any, options: ArcOptions) = this()
  def this(center: Point, options: ArcOptions) = this()
  var anticlockwise: scala.Boolean = js.native
  var center: Point = js.native
  var endAngle: scala.Double = js.native
  var options: ArcOptions = js.native
  var radiusX: scala.Double = js.native
  var radiusY: scala.Double = js.native
  var startAngle: scala.Double = js.native
  def bbox(matrix: Matrix): Rect = js.native
  def getAnticlockwise(): scala.Boolean = js.native
  def getCenter(): Point = js.native
  def getEndAngle(): scala.Double = js.native
  def getRadiusX(): scala.Double = js.native
  def getRadiusY(): scala.Double = js.native
  def getStartAngle(): scala.Double = js.native
  def pointAt(angle: scala.Double): Point = js.native
  def setAnticlockwise(value: scala.Boolean): Arc = js.native
  def setCenter(value: Point): Arc = js.native
  def setEndAngle(value: scala.Double): Arc = js.native
  def setRadiusX(value: scala.Double): Arc = js.native
  def setRadiusY(value: scala.Double): Arc = js.native
  def setStartAngle(value: scala.Double): Arc = js.native
}

