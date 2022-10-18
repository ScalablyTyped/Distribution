package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Bounds")
@js.native
open class Bounds_ () extends StObject {
  def this(points: js.Array[Point_]) = this()
  def this(points: BoundsLiteral) = this()
  def this(topLeft: PointExpression, bottomRight: PointExpression) = this()
  
  def contains(pointOrBounds: BoundsExpression | PointExpression): Boolean = js.native
  
  // Returns a new Bounds
  def equals(otherBounds: BoundsExpression): Boolean = js.native
  
  // tslint:disable:unified-signatures
  def extend(point: BoundsExpression | PointExpression): this.type = js.native
  
  def getBottomLeft(): Point_ = js.native
  
  def getBottomRight(): Point_ = js.native
  
  // tslint:enable:unified-signatures
  def getCenter(): Point_ = js.native
  def getCenter(round: Boolean): Point_ = js.native
  
  def getSize(): Point_ = js.native
  
  def getTopLeft(): Point_ = js.native
  
  def getTopRight(): Point_ = js.native
  
  def intersects(otherBounds: BoundsExpression): Boolean = js.native
  
  def isValid(): Boolean = js.native
  
  var max: js.UndefOr[Point_] = js.native
  
  var min: js.UndefOr[Point_] = js.native
  
  def overlaps(otherBounds: BoundsExpression): Boolean = js.native
  
  def pad(bufferRatio: Double): Bounds_ = js.native
}
