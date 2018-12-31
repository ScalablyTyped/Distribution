package typings
package makerDotJsLib.MakerJsNs.modelsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Ellipse")
@js.native
class Ellipse protected ()
  extends makerDotJsLib.MakerJsNs.IModel {
  /**
    * Class for Ellipse created with 2 radii.
    *
    * @param radiusX The x radius of the ellipse.
    * @param radiusY The y radius of the ellipse.
    * @param accuracy Optional accuracy of the underlying BezierCurve.
    */
  def this(radiusX: scala.Double, radiusY: scala.Double) = this()
  /**
    * Class for Ellipse created at a specific origin and 2 radii.
    *
    * @param origin The center of the ellipse.
    * @param radiusX The x radius of the ellipse.
    * @param radiusY The y radius of the ellipse.
    * @param accuracy Optional accuracy of the underlying BezierCurve.
    */
  def this(origin: makerDotJsLib.MakerJsNs.IPoint, radiusX: scala.Double, radiusY: scala.Double) = this()
  def this(radiusX: scala.Double, radiusY: scala.Double, accuracy: scala.Double) = this()
  /**
    * Class for Ellipse created at a specific x, y and 2 radii.
    *
    * @param cx The x coordinate of the center of the ellipse.
    * @param cy The y coordinate of the center of the ellipse.
    * @param rX The x radius of the ellipse.
    * @param rY The y radius of the ellipse.
    * @param accuracy Optional accuracy of the underlying BezierCurve.
    */
  def this(cx: scala.Double, cy: scala.Double, rx: scala.Double, ry: scala.Double) = this()
  def this(origin: makerDotJsLib.MakerJsNs.IPoint, radiusX: scala.Double, radiusY: scala.Double, accuracy: scala.Double) = this()
  def this(cx: scala.Double, cy: scala.Double, rx: scala.Double, ry: scala.Double, accuracy: scala.Double) = this()
  @JSName("models")
  var models_Ellipse: makerDotJsLib.MakerJsNs.IModelMap = js.native
  @JSName("origin")
  var origin_Ellipse: makerDotJsLib.MakerJsNs.IPoint = js.native
}

