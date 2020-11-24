package typings.makerJs.global.MakerJs.models

import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MakerJs.models.Polygon")
@js.native
class Polygon protected ()
  extends typings.makerJs.MakerJs.models.Polygon {
  def this(numberOfSides: Double, radius: Double) = this()
  def this(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Double) = this()
  def this(
    numberOfSides: Double,
    radius: Double,
    firstCornerAngleInDegrees: js.UndefOr[scala.Nothing],
    circumscribed: Boolean
  ) = this()
  def this(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Double, circumscribed: Boolean) = this()
}
/* static members */
@JSGlobal("MakerJs.models.Polygon")
@js.native
object Polygon extends js.Object {
  
  def circumscribedRadius(radius: Double, angleInRadians: Double): Double = js.native
  
  def getPoints(numberOfSides: Double, radius: Double): js.Array[IPoint] = js.native
  def getPoints(
    numberOfSides: Double,
    radius: Double,
    firstCornerAngleInDegrees: js.UndefOr[scala.Nothing],
    circumscribed: Boolean
  ): js.Array[IPoint] = js.native
  def getPoints(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Double): js.Array[IPoint] = js.native
  def getPoints(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Double, circumscribed: Boolean): js.Array[IPoint] = js.native
}
