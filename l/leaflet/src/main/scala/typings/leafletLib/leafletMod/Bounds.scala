package typings
package leafletLib.leafletMod

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
  def contains(pointOrBounds: BoundsExpression | PointExpression): scala.Boolean = js.native
  def extend(point: PointExpression): this.type = js.native
  def getBottomLeft(): Point = js.native
  def getCenter(): Point = js.native
  def getCenter(round: scala.Boolean): Point = js.native
  def getSize(): Point = js.native
  def getTopRight(): Point = js.native
  def intersects(otherBounds: BoundsExpression): scala.Boolean = js.native
  def overlaps(otherBounds: BoundsExpression): scala.Boolean = js.native
}

