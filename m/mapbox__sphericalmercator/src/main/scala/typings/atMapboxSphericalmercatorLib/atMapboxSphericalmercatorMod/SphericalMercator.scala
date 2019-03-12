package typings
package atMapboxSphericalmercatorLib.atMapboxSphericalmercatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SphericalMercator extends js.Object {
  def bbox(
    x: scala.Double,
    y: scala.Double,
    zoom: scala.Double,
    tms_style: scala.Boolean,
    srs: atMapboxSphericalmercatorLib.Projection
  ): atMapboxSphericalmercatorLib.BoundingBox
  def convert(bbox: atMapboxSphericalmercatorLib.BoundingBox, to: atMapboxSphericalmercatorLib.Projection): atMapboxSphericalmercatorLib.BoundingBox
  def forward(ll: atMapboxSphericalmercatorLib.LatLngPoint): atMapboxSphericalmercatorLib.XYPoint
  def inverse(xy: atMapboxSphericalmercatorLib.XYPoint): atMapboxSphericalmercatorLib.LatLngPoint
  def ll(px: atMapboxSphericalmercatorLib.XYPoint, zoom: scala.Double): atMapboxSphericalmercatorLib.LatLngPoint
  def px(ll: atMapboxSphericalmercatorLib.LatLngPoint, zoom: scala.Double): atMapboxSphericalmercatorLib.XYPoint
  def xyz(
    bbox: atMapboxSphericalmercatorLib.BoundingBox,
    zoom: scala.Double,
    tms_style: scala.Boolean,
    srs: atMapboxSphericalmercatorLib.Projection
  ): XYBounds
}

object SphericalMercator {
  @scala.inline
  def apply(
    bbox: (scala.Double, scala.Double, scala.Double, scala.Boolean, atMapboxSphericalmercatorLib.Projection) => atMapboxSphericalmercatorLib.BoundingBox,
    convert: (atMapboxSphericalmercatorLib.BoundingBox, atMapboxSphericalmercatorLib.Projection) => atMapboxSphericalmercatorLib.BoundingBox,
    forward: atMapboxSphericalmercatorLib.LatLngPoint => atMapboxSphericalmercatorLib.XYPoint,
    inverse: atMapboxSphericalmercatorLib.XYPoint => atMapboxSphericalmercatorLib.LatLngPoint,
    ll: (atMapboxSphericalmercatorLib.XYPoint, scala.Double) => atMapboxSphericalmercatorLib.LatLngPoint,
    px: (atMapboxSphericalmercatorLib.LatLngPoint, scala.Double) => atMapboxSphericalmercatorLib.XYPoint,
    xyz: (atMapboxSphericalmercatorLib.BoundingBox, scala.Double, scala.Boolean, atMapboxSphericalmercatorLib.Projection) => XYBounds
  ): SphericalMercator = {
    val __obj = js.Dynamic.literal(bbox = js.Any.fromFunction5(bbox), convert = js.Any.fromFunction2(convert), forward = js.Any.fromFunction1(forward), inverse = js.Any.fromFunction1(inverse), ll = js.Any.fromFunction2(ll), px = js.Any.fromFunction2(px), xyz = js.Any.fromFunction4(xyz))
  
    __obj.asInstanceOf[SphericalMercator]
  }
}

