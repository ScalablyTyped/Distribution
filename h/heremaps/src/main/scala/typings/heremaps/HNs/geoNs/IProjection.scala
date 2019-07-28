package typings.heremaps.HNs.geoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProjection extends js.Object {
  def geoToPoint(geoPoint: IPoint): typings.heremaps.HNs.mathNs.Point = js.native
  def geoToPoint(geoPoint: IPoint, opt_out: typings.heremaps.HNs.mathNs.Point): typings.heremaps.HNs.mathNs.Point = js.native
  def latLngToPoint(lat: Double, lng: Double): typings.heremaps.HNs.mathNs.Point = js.native
  def latLngToPoint(lat: Double, lng: Double, opt_out: typings.heremaps.HNs.mathNs.Point): typings.heremaps.HNs.mathNs.Point = js.native
  def pointToGeo(point: typings.heremaps.HNs.mathNs.IPoint): Point = js.native
  def pointToGeo(point: typings.heremaps.HNs.mathNs.IPoint, opt_out: Point): Point = js.native
  def xyToGeo(x: Double, y: Double): Point = js.native
  def xyToGeo(x: Double, y: Double, opt_out: Point): Point = js.native
}

