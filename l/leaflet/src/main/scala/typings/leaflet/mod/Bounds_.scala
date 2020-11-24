package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Bounds")
@js.native
class Bounds_ protected () extends js.Object {
  def this(points: js.Array[Point_]) = this()
  def this(points: BoundsLiteral) = this()
  def this(topLeft: PointExpression, bottomRight: PointExpression) = this()
  
  def contains(pointOrBounds: BoundsExpression | PointExpression): Boolean = js.native
  
  def extend(point: PointExpression): this.type = js.native
  
  def getBottomLeft(): Point_ = js.native
  
  def getCenter(): Point_ = js.native
  def getCenter(round: Boolean): Point_ = js.native
  
  def getSize(): Point_ = js.native
  
  def getTopRight(): Point_ = js.native
  
  def intersects(otherBounds: BoundsExpression): Boolean = js.native
  
  var max: js.UndefOr[Point_] = js.native
  
  var min: js.UndefOr[Point_] = js.native
  
  def overlaps(otherBounds: BoundsExpression): Boolean = js.native
}
