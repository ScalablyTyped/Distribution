package typings.makerJs.global.MakerJs.models

import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MakerJs.models.Ellipse")
@js.native
class Ellipse protected ()
  extends typings.makerJs.MakerJs.models.Ellipse {
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
}
