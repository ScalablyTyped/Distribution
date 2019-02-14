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

