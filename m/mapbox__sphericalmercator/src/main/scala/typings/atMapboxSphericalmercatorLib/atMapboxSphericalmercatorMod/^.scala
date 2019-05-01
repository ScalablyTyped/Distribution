package typings
package atMapboxSphericalmercatorLib.atMapboxSphericalmercatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mapbox/sphericalmercator", JSImport.Namespace)
@js.native
class ^ protected () extends SphericalMercator {
  def this(options: atMapboxSphericalmercatorLib.Anon_Size) = this()
  /* CompleteClass */
  override def bbox(x: scala.Double, y: scala.Double, zoom: scala.Double, tms_style: scala.Boolean, srs: Projection): BoundingBox = js.native
  /* CompleteClass */
  override def convert(bbox: BoundingBox, to: Projection): BoundingBox = js.native
  /* CompleteClass */
  override def forward(ll: LatLngPoint): XYPoint = js.native
  /* CompleteClass */
  override def inverse(xy: XYPoint): LatLngPoint = js.native
  /* CompleteClass */
  override def ll(px: XYPoint, zoom: scala.Double): LatLngPoint = js.native
  /* CompleteClass */
  override def px(ll: LatLngPoint, zoom: scala.Double): XYPoint = js.native
  /* CompleteClass */
  override def xyz(bbox: BoundingBox, zoom: scala.Double, tms_style: scala.Boolean, srs: Projection): XYBounds = js.native
}

