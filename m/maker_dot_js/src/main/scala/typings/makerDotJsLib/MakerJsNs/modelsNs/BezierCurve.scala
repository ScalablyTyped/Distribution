package typings
package makerDotJsLib.MakerJsNs.modelsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.BezierCurve")
@js.native
class BezierCurve protected ()
  extends makerDotJsLib.MakerJsNs.IModel {
  def this(points: js.Array[makerDotJsLib.MakerJsNs.IPoint]) = this()
  def this(seed: makerDotJsLib.MakerJsNs.IPathBezierSeed) = this()
  def this(points: js.Array[makerDotJsLib.MakerJsNs.IPoint], accuracy: scala.Double) = this()
  def this(seed: makerDotJsLib.MakerJsNs.IPathBezierSeed, accuracy: scala.Double) = this()
  def this(seed: makerDotJsLib.MakerJsNs.IPathBezierSeed, isChild: scala.Boolean) = this()
  def this(origin: makerDotJsLib.MakerJsNs.IPoint, control: makerDotJsLib.MakerJsNs.IPoint, end: makerDotJsLib.MakerJsNs.IPoint) = this()
  def this(origin: makerDotJsLib.MakerJsNs.IPoint, controls: js.Array[makerDotJsLib.MakerJsNs.IPoint], end: makerDotJsLib.MakerJsNs.IPoint) = this()
  def this(seed: makerDotJsLib.MakerJsNs.IPathBezierSeed, isChild: scala.Boolean, accuracy: scala.Double) = this()
  def this(origin: makerDotJsLib.MakerJsNs.IPoint, control1: makerDotJsLib.MakerJsNs.IPoint, control2: makerDotJsLib.MakerJsNs.IPoint, end: makerDotJsLib.MakerJsNs.IPoint) = this()
  def this(origin: makerDotJsLib.MakerJsNs.IPoint, control: makerDotJsLib.MakerJsNs.IPoint, end: makerDotJsLib.MakerJsNs.IPoint, accuracy: scala.Double) = this()
  def this(origin: makerDotJsLib.MakerJsNs.IPoint, controls: js.Array[makerDotJsLib.MakerJsNs.IPoint], end: makerDotJsLib.MakerJsNs.IPoint, accuracy: scala.Double) = this()
  def this(origin: makerDotJsLib.MakerJsNs.IPoint, control1: makerDotJsLib.MakerJsNs.IPoint, control2: makerDotJsLib.MakerJsNs.IPoint, end: makerDotJsLib.MakerJsNs.IPoint, accuracy: scala.Double) = this()
  var accuracy: scala.Double = js.native
  @JSName("models")
  var models_BezierCurve: makerDotJsLib.MakerJsNs.IModelMap = js.native
  @JSName("origin")
  var origin_BezierCurve: makerDotJsLib.MakerJsNs.IPoint = js.native
  @JSName("paths")
  var paths_BezierCurve: makerDotJsLib.MakerJsNs.IPathMap = js.native
  var seed: makerDotJsLib.MakerJsNs.IPathBezierSeed = js.native
  @JSName("type")
  var type_BezierCurve: java.lang.String = js.native
}

/* static members */
@JSGlobal("MakerJs.models.BezierCurve")
@js.native
object BezierCurve extends js.Object {
  var typeName: java.lang.String = js.native
  def computeLength(seed: makerDotJsLib.MakerJsNs.IPathBezierSeed): scala.Double = js.native
  def computePoint(seed: makerDotJsLib.MakerJsNs.IPathBezierSeed, t: scala.Double): makerDotJsLib.MakerJsNs.IPoint = js.native
  def getBezierSeeds(curve: makerDotJsLib.MakerJsNs.modelsNs.BezierCurve): js.Array[makerDotJsLib.MakerJsNs.IPathBezierSeed] = js.native
  def getBezierSeeds(
    curve: makerDotJsLib.MakerJsNs.modelsNs.BezierCurve,
    options: makerDotJsLib.MakerJsNs.IFindChainsOptions
  ): js.Array[makerDotJsLib.MakerJsNs.IPathBezierSeed] = js.native
}

