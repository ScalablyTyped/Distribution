package typings
package atMapboxSphericalmercatorLib.atMapboxSphericalmercatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SphericalMercator extends js.Object {
  def bbox(x: scala.Double, y: scala.Double, zoom: scala.Double, tms_style: scala.Boolean, srs: Projection): BoundingBox
  def convert(bbox: BoundingBox, to: Projection): BoundingBox
  def forward(ll: LatLngPoint): XYPoint
  def inverse(xy: XYPoint): LatLngPoint
  def ll(px: XYPoint, zoom: scala.Double): LatLngPoint
  def px(ll: LatLngPoint, zoom: scala.Double): XYPoint
  def xyz(bbox: BoundingBox, zoom: scala.Double, tms_style: scala.Boolean, srs: Projection): XYBounds
}

object SphericalMercator {
  @scala.inline
  def apply(
    bbox: (scala.Double, scala.Double, scala.Double, scala.Boolean, Projection) => BoundingBox,
    convert: (BoundingBox, Projection) => BoundingBox,
    forward: LatLngPoint => XYPoint,
    inverse: XYPoint => LatLngPoint,
    ll: (XYPoint, scala.Double) => LatLngPoint,
    px: (LatLngPoint, scala.Double) => XYPoint,
    xyz: (BoundingBox, scala.Double, scala.Boolean, Projection) => XYBounds
  ): SphericalMercator = {
    val __obj = js.Dynamic.literal(bbox = js.Any.fromFunction5(bbox), convert = js.Any.fromFunction2(convert), forward = js.Any.fromFunction1(forward), inverse = js.Any.fromFunction1(inverse), ll = js.Any.fromFunction2(ll), px = js.Any.fromFunction2(px), xyz = js.Any.fromFunction4(xyz))
  
    __obj.asInstanceOf[SphericalMercator]
  }
}

