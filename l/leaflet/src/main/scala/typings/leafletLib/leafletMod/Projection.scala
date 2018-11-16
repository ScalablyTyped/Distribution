package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projection extends js.Object {
  var bounds: Bounds = js.native
  def project(latlng: LatLng): Point = js.native
  def project(latlng: LatLngLiteral): Point = js.native
  def unproject(point: PointExpression): LatLng = js.native
}

