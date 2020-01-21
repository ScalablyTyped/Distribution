package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IFindChainsOptions
import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import typings.makerJs.MakerJs.IPathBezierSeed
import typings.makerJs.MakerJs.IPathMap
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.BezierCurve")
@js.native
class BezierCurve protected () extends IModel {
  def this(points: js.Array[IPoint]) = this()
  def this(seed: IPathBezierSeed) = this()
  def this(points: js.Array[IPoint], accuracy: Double) = this()
  def this(seed: IPathBezierSeed, accuracy: Double) = this()
  def this(seed: IPathBezierSeed, isChild: Boolean) = this()
  def this(origin: IPoint, controls: js.Array[IPoint], end: IPoint) = this()
  def this(origin: IPoint, control: IPoint, end: IPoint) = this()
  def this(seed: IPathBezierSeed, isChild: Boolean, accuracy: Double) = this()
  def this(origin: IPoint, control1: IPoint, control2: IPoint, end: IPoint) = this()
  def this(origin: IPoint, controls: js.Array[IPoint], end: IPoint, accuracy: Double) = this()
  def this(origin: IPoint, control: IPoint, end: IPoint, accuracy: Double) = this()
  def this(origin: IPoint, control1: IPoint, control2: IPoint, end: IPoint, accuracy: Double) = this()
  var accuracy: Double = js.native
  @JSName("models")
  var models_BezierCurve: IModelMap = js.native
  @JSName("origin")
  var origin_BezierCurve: IPoint = js.native
  @JSName("paths")
  var paths_BezierCurve: IPathMap = js.native
  var seed: IPathBezierSeed = js.native
  @JSName("type")
  var type_BezierCurve: String = js.native
}

/* static members */
@JSGlobal("MakerJs.models.BezierCurve")
@js.native
object BezierCurve extends js.Object {
  var typeName: String = js.native
  def computeLength(seed: IPathBezierSeed): Double = js.native
  def computePoint(seed: IPathBezierSeed, t: Double): IPoint = js.native
  def getBezierSeeds(curve: BezierCurve): js.Array[IPathBezierSeed] = js.native
  def getBezierSeeds(curve: BezierCurve, options: IFindChainsOptions): js.Array[IPathBezierSeed] = js.native
}

