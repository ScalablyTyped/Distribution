package typings
package makerDotJsLib.MakerJsNs.modelsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.EllipticArc")
@js.native
class EllipticArc protected ()
  extends makerDotJsLib.MakerJsNs.IModel {
  /**
           * Class for Elliptic Arc created by distorting a circular arc.
           *
           * @param arc The circular arc to use as the basis of the elliptic arc.
           * @param distortX The x scale of the ellipse.
           * @param distortY The y scale of the ellipse.
           * @param accuracy Optional accuracy of the underlying BezierCurve.
           */
  def this(arc: makerDotJsLib.MakerJsNs.IPathArc, distortX: scala.Double, distortY: scala.Double) = this()
  /**
           * Class for Elliptic Arc created by distorting a circular arc.
           *
           * @param arc The circular arc to use as the basis of the elliptic arc.
           * @param distortX The x scale of the ellipse.
           * @param distortY The y scale of the ellipse.
           * @param accuracy Optional accuracy of the underlying BezierCurve.
           */
  def this(arc: makerDotJsLib.MakerJsNs.IPathArc, distortX: scala.Double, distortY: scala.Double, accuracy: scala.Double) = this()
  /**
           * Class for Elliptic Arc created by distorting a circular arc.
           *
           * @param arc The circular arc to use as the basis of the elliptic arc.
           * @param radiusX The x radius of the ellipse.
           * @param radiusY The y radius of the ellipse.
           * @param accuracy Optional accuracy of the underlying BezierCurve.
           */
  def this(startAngle: scala.Double, endAngle: scala.Double, radiusX: scala.Double, radiusY: scala.Double) = this()
  /**
           * Class for Elliptic Arc created by distorting a circular arc.
           *
           * @param arc The circular arc to use as the basis of the elliptic arc.
           * @param radiusX The x radius of the ellipse.
           * @param radiusY The y radius of the ellipse.
           * @param accuracy Optional accuracy of the underlying BezierCurve.
           */
  def this(startAngle: scala.Double, endAngle: scala.Double, radiusX: scala.Double, radiusY: scala.Double, accuracy: scala.Double) = this()
  @JSName("models")
  var models_EllipticArc: makerDotJsLib.MakerJsNs.IModelMap = js.native
}

