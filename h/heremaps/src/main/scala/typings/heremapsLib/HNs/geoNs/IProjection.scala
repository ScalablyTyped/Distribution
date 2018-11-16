package typings
package heremapsLib.HNs.geoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProjection extends js.Object {
  def geoToPoint(geoPoint: IPoint): heremapsLib.HNs.mathNs.Point = js.native
  def geoToPoint(geoPoint: IPoint, opt_out: heremapsLib.HNs.mathNs.Point): heremapsLib.HNs.mathNs.Point = js.native
  def latLngToPoint(lat: scala.Double, lng: scala.Double): heremapsLib.HNs.mathNs.Point = js.native
  def latLngToPoint(lat: scala.Double, lng: scala.Double, opt_out: heremapsLib.HNs.mathNs.Point): heremapsLib.HNs.mathNs.Point = js.native
  def pointToGeo(point: heremapsLib.HNs.mathNs.IPoint): Point = js.native
  def pointToGeo(point: heremapsLib.HNs.mathNs.IPoint, opt_out: Point): Point = js.native
  def xyToGeo(x: scala.Double, y: scala.Double): Point = js.native
  def xyToGeo(x: scala.Double, y: scala.Double, opt_out: Point): Point = js.native
}

