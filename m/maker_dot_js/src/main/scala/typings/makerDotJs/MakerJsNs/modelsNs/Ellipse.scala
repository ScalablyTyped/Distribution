package typings.makerDotJs.MakerJsNs.modelsNs

import typings.makerDotJs.MakerJsNs.IModel
import typings.makerDotJs.MakerJsNs.IModelMap
import typings.makerDotJs.MakerJsNs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Ellipse")
@js.native
class Ellipse protected () extends IModel {
  /**
    * Class for Ellipse created with 2 radii.
    *
    * @param radiusX The x radius of the ellipse.
    * @param radiusY The y radius of the ellipse.
    * @param accuracy Optional accuracy of the underlying BezierCurve.
    */
  def this(radiusX: Double, radiusY: Double) = this()
  /**
    * Class for Ellipse created at a specific origin and 2 radii.
    *
    * @param origin The center of the ellipse.
    * @param radiusX The x radius of the ellipse.
    * @param radiusY The y radius of the ellipse.
    * @param accuracy Optional accuracy of the underlying BezierCurve.
    */
  def this(origin: IPoint, radiusX: Double, radiusY: Double) = this()
  def this(radiusX: Double, radiusY: Double, accuracy: Double) = this()
  /**
    * Class for Ellipse created at a specific x, y and 2 radii.
    *
    * @param cx The x coordinate of the center of the ellipse.
    * @param cy The y coordinate of the center of the ellipse.
    * @param rX The x radius of the ellipse.
    * @param rY The y radius of the ellipse.
    * @param accuracy Optional accuracy of the underlying BezierCurve.
    */
  def this(cx: Double, cy: Double, rx: Double, ry: Double) = this()
  def this(origin: IPoint, radiusX: Double, radiusY: Double, accuracy: Double) = this()
  def this(cx: Double, cy: Double, rx: Double, ry: Double, accuracy: Double) = this()
  @JSName("models")
  var models_Ellipse: IModelMap = js.native
  @JSName("origin")
  var origin_Ellipse: IPoint = js.native
}

