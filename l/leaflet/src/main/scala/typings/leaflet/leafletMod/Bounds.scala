package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Bounds")
@js.native
class Bounds protected () extends js.Object {
  def this(points: js.Array[Point]) = this()
  def this(points: BoundsLiteral) = this()
  def this(topLeft: PointExpression, bottomRight: PointExpression) = this()
  var max: js.UndefOr[Point] = js.native
  var min: js.UndefOr[Point] = js.native
  def contains(pointOrBounds: BoundsExpression | PointExpression): Boolean = js.native
  def extend(point: PointExpression): this.type = js.native
  def getBottomLeft(): Point = js.native
  def getCenter(): Point = js.native
  def getCenter(round: Boolean): Point = js.native
  def getSize(): Point = js.native
  def getTopRight(): Point = js.native
  def intersects(otherBounds: BoundsExpression): Boolean = js.native
  def overlaps(otherBounds: BoundsExpression): Boolean = js.native
}

@JSImport("leaflet", "bounds")
@js.native
object bounds extends js.Object {
  def apply(points: js.Array[Point]): Bounds = js.native
  def apply(points: BoundsLiteral): Bounds = js.native
  def apply(topLeft: PointExpression, bottomRight: PointExpression): Bounds = js.native
}

