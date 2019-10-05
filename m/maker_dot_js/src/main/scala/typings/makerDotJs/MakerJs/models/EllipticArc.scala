package typings.makerDotJs.MakerJs.models

import typings.makerDotJs.MakerJs.IModel
import typings.makerDotJs.MakerJs.IModelMap
import typings.makerDotJs.MakerJs.IPathArc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.EllipticArc")
@js.native
class EllipticArc protected () extends IModel {
  /**
    * Class for Elliptic Arc created by distorting a circular arc.
    *
    * @param arc The circular arc to use as the basis of the elliptic arc.
    * @param distortX The x scale of the ellipse.
    * @param distortY The y scale of the ellipse.
    * @param accuracy Optional accuracy of the underlying BezierCurve.
    */
  def this(arc: IPathArc, distortX: Double, distortY: Double) = this()
  def this(arc: IPathArc, distortX: Double, distortY: Double, accuracy: Double) = this()
  /**
    * Class for Elliptic Arc created by distorting a circular arc.
    *
    * @param arc The circular arc to use as the basis of the elliptic arc.
    * @param radiusX The x radius of the ellipse.
    * @param radiusY The y radius of the ellipse.
    * @param accuracy Optional accuracy of the underlying BezierCurve.
    */
  def this(startAngle: Double, endAngle: Double, radiusX: Double, radiusY: Double) = this()
  def this(startAngle: Double, endAngle: Double, radiusX: Double, radiusY: Double, accuracy: Double) = this()
  @JSName("models")
  var models_EllipticArc: IModelMap = js.native
}

