package typings
package makerDotJsLib.MakerJsNs.modelsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Polygon")
@js.native
class Polygon protected ()
  extends makerDotJsLib.MakerJsNs.IModel {
  def this(numberOfSides: scala.Double, radius: scala.Double) = this()
  def this(numberOfSides: scala.Double, radius: scala.Double, firstCornerAngleInDegrees: scala.Double) = this()
  def this(numberOfSides: scala.Double, radius: scala.Double, firstCornerAngleInDegrees: scala.Double, circumscribed: scala.Boolean) = this()
  @JSName("paths")
  var paths_Polygon: makerDotJsLib.MakerJsNs.IPathMap = js.native
}

/* static members */
@JSGlobal("MakerJs.models.Polygon")
@js.native
object Polygon extends js.Object {
  def circumscribedRadius(radius: scala.Double, angleInRadians: scala.Double): scala.Double = js.native
  def getPoints(numberOfSides: scala.Double, radius: scala.Double): js.Array[makerDotJsLib.MakerJsNs.IPoint] = js.native
  def getPoints(numberOfSides: scala.Double, radius: scala.Double, firstCornerAngleInDegrees: scala.Double): js.Array[makerDotJsLib.MakerJsNs.IPoint] = js.native
  def getPoints(
    numberOfSides: scala.Double,
    radius: scala.Double,
    firstCornerAngleInDegrees: scala.Double,
    circumscribed: scala.Boolean
  ): js.Array[makerDotJsLib.MakerJsNs.IPoint] = js.native
}

