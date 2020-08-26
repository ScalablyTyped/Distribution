package typings.mapboxSphericalmercator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SphericalMercator extends js.Object {
  def bbox(x: Double, y: Double, zoom: Double): BoundingBox = js.native
  def bbox(x: Double, y: Double, zoom: Double, tms_style: js.UndefOr[scala.Nothing], srs: Projection): BoundingBox = js.native
  def bbox(x: Double, y: Double, zoom: Double, tms_style: Boolean): BoundingBox = js.native
  def bbox(x: Double, y: Double, zoom: Double, tms_style: Boolean, srs: Projection): BoundingBox = js.native
  def convert(bbox: BoundingBox): BoundingBox = js.native
  def convert(bbox: BoundingBox, to: Projection): BoundingBox = js.native
  def forward(ll: LatLngPoint): XYPoint = js.native
  def inverse(xy: XYPoint): LatLngPoint = js.native
  def ll(px: XYPoint, zoom: Double): LatLngPoint = js.native
  def px(ll: LatLngPoint, zoom: Double): XYPoint = js.native
  def xyz(bbox: BoundingBox, zoom: Double): XYBounds = js.native
  def xyz(bbox: BoundingBox, zoom: Double, tms_style: js.UndefOr[scala.Nothing], srs: Projection): XYBounds = js.native
  def xyz(bbox: BoundingBox, zoom: Double, tms_style: Boolean): XYBounds = js.native
  def xyz(bbox: BoundingBox, zoom: Double, tms_style: Boolean, srs: Projection): XYBounds = js.native
}

