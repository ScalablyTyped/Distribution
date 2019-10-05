package typings.makerDotJs.MakerJs.models

import typings.makerDotJs.MakerJs.IModel
import typings.makerDotJs.MakerJs.IPathMap
import typings.makerDotJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Polygon")
@js.native
class Polygon protected () extends IModel {
  def this(numberOfSides: Double, radius: Double) = this()
  def this(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Double) = this()
  def this(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Double, circumscribed: Boolean) = this()
  @JSName("paths")
  var paths_Polygon: IPathMap = js.native
}

/* static members */
@JSGlobal("MakerJs.models.Polygon")
@js.native
object Polygon extends js.Object {
  def circumscribedRadius(radius: Double, angleInRadians: Double): Double = js.native
  def getPoints(numberOfSides: Double, radius: Double): js.Array[IPoint] = js.native
  def getPoints(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Double): js.Array[IPoint] = js.native
  def getPoints(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Double, circumscribed: Boolean): js.Array[IPoint] = js.native
}

