package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "bounds")
@js.native
object bounds extends js.Object {
  
  def apply(points: js.Array[Point_]): Bounds_ = js.native
  def apply(points: BoundsLiteral): Bounds_ = js.native
  def apply(topLeft: PointExpression, bottomRight: PointExpression): Bounds_ = js.native
}
