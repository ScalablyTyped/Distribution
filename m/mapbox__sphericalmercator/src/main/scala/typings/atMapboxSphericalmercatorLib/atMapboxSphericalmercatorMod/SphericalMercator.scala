package typings
package atMapboxSphericalmercatorLib.atMapboxSphericalmercatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SphericalMercator extends js.Object {
  def bbox(x: scala.Double, y: scala.Double, zoom: scala.Double): BoundingBox = js.native
  def bbox(x: scala.Double, y: scala.Double, zoom: scala.Double, tms_style: scala.Boolean): BoundingBox = js.native
  def bbox(x: scala.Double, y: scala.Double, zoom: scala.Double, tms_style: scala.Boolean, srs: Projection): BoundingBox = js.native
  def convert(bbox: BoundingBox): BoundingBox = js.native
  def convert(bbox: BoundingBox, to: Projection): BoundingBox = js.native
  def forward(ll: LatLngPoint): XYPoint = js.native
  def inverse(xy: XYPoint): LatLngPoint = js.native
  def ll(px: XYPoint, zoom: scala.Double): LatLngPoint = js.native
  def px(ll: LatLngPoint, zoom: scala.Double): XYPoint = js.native
  def xyz(bbox: BoundingBox, zoom: scala.Double): XYBounds = js.native
  def xyz(bbox: BoundingBox, zoom: scala.Double, tms_style: scala.Boolean): XYBounds = js.native
  def xyz(bbox: BoundingBox, zoom: scala.Double, tms_style: scala.Boolean, srs: Projection): XYBounds = js.native
}

