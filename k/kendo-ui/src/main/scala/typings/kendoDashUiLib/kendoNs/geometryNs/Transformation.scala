package typings
package kendoDashUiLib.kendoNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.geometry.Transformation")
@js.native
class Transformation ()
  extends kendoDashUiLib.kendoNs.Observable {
  var options: TransformationOptions = js.native
  def equals(other: Transformation): scala.Boolean = js.native
  def matrix(): Matrix = js.native
  def multiply(transformation: Transformation): Transformation = js.native
  def rotate(angle: scala.Double, center: js.Any): Transformation = js.native
  def rotate(angle: scala.Double, center: Point): Transformation = js.native
  def scale(scaleX: scala.Double, scaleY: scala.Double): Transformation = js.native
  def translate(x: scala.Double, y: scala.Double): Transformation = js.native
}

