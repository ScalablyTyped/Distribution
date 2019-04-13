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
  override def bbox(
    x: scala.Double,
    y: scala.Double,
    zoom: scala.Double,
    tms_style: scala.Boolean,
    srs: atMapboxSphericalmercatorLib.Projection
  ): atMapboxSphericalmercatorLib.BoundingBox = js.native
  /* CompleteClass */
  override def convert(bbox: atMapboxSphericalmercatorLib.BoundingBox, to: atMapboxSphericalmercatorLib.Projection): atMapboxSphericalmercatorLib.BoundingBox = js.native
  /* CompleteClass */
  override def forward(ll: atMapboxSphericalmercatorLib.LatLngPoint): atMapboxSphericalmercatorLib.XYPoint = js.native
  /* CompleteClass */
  override def inverse(xy: atMapboxSphericalmercatorLib.XYPoint): atMapboxSphericalmercatorLib.LatLngPoint = js.native
  /* CompleteClass */
  override def ll(px: atMapboxSphericalmercatorLib.XYPoint, zoom: scala.Double): atMapboxSphericalmercatorLib.LatLngPoint = js.native
  /* CompleteClass */
  override def px(ll: atMapboxSphericalmercatorLib.LatLngPoint, zoom: scala.Double): atMapboxSphericalmercatorLib.XYPoint = js.native
  /* CompleteClass */
  override def xyz(
    bbox: atMapboxSphericalmercatorLib.BoundingBox,
    zoom: scala.Double,
    tms_style: scala.Boolean,
    srs: atMapboxSphericalmercatorLib.Projection
  ): XYBounds = js.native
}

