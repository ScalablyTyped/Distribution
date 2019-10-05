package typings.heremaps.H.geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProjection extends js.Object {
  def geoToPoint(geoPoint: IPoint): typings.heremaps.H.math.Point = js.native
  def geoToPoint(geoPoint: IPoint, opt_out: typings.heremaps.H.math.Point): typings.heremaps.H.math.Point = js.native
  def latLngToPoint(lat: Double, lng: Double): typings.heremaps.H.math.Point = js.native
  def latLngToPoint(lat: Double, lng: Double, opt_out: typings.heremaps.H.math.Point): typings.heremaps.H.math.Point = js.native
  def pointToGeo(point: typings.heremaps.H.math.IPoint): Point = js.native
  def pointToGeo(point: typings.heremaps.H.math.IPoint, opt_out: Point): Point = js.native
  def xyToGeo(x: Double, y: Double): Point = js.native
  def xyToGeo(x: Double, y: Double, opt_out: Point): Point = js.native
}

