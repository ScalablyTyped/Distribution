package typings
package ibmDashMobilefirstLib.WLNs.GeoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.Geo")
@js.native
object ^ extends js.Object {
  def getDistanceBetweenCoordinates(
    coordinate1: ibmDashMobilefirstLib.WLNs.GeoNs.Coordinate,
    coordinate2: ibmDashMobilefirstLib.WLNs.GeoNs.Coordinate
  ): scala.Double = js.native
  def getDistanceToCircle(
    coordinate: ibmDashMobilefirstLib.WLNs.GeoNs.Coordinate,
    circle: ibmDashMobilefirstLib.WLNs.GeoNs.Circle,
    options: ibmDashMobilefirstLib.WLNs.GeoNs.DistanceOptions
  ): scala.Double = js.native
  def getDistanceToPolygon(
    coordinate: ibmDashMobilefirstLib.WLNs.GeoNs.Coordinate,
    polygon: js.Array[ibmDashMobilefirstLib.WLNs.GeoNs.Coordinate],
    options: ibmDashMobilefirstLib.WLNs.GeoNs.DistanceOptions
  ): scala.Double = js.native
  def isInsideCircle(
    coordinate: ibmDashMobilefirstLib.WLNs.GeoNs.Coordinate,
    circle: ibmDashMobilefirstLib.WLNs.GeoNs.Circle,
    options: ibmDashMobilefirstLib.WLNs.GeoNs.InsideOutsideOptions
  ): scala.Boolean = js.native
  def isInsidePolygon(
    coordinate: ibmDashMobilefirstLib.WLNs.GeoNs.Coordinate,
    polygon: js.Array[ibmDashMobilefirstLib.WLNs.GeoNs.Coordinate],
    options: ibmDashMobilefirstLib.WLNs.GeoNs.InsideOutsideOptions
  ): scala.Boolean = js.native
  def isOutsideCircle(
    coordinate: ibmDashMobilefirstLib.WLNs.GeoNs.Coordinate,
    circle: ibmDashMobilefirstLib.WLNs.GeoNs.Circle,
    options: ibmDashMobilefirstLib.WLNs.GeoNs.InsideOutsideOptions
  ): scala.Boolean = js.native
  def isOutsidePolygon(
    coordinate: ibmDashMobilefirstLib.WLNs.GeoNs.Coordinate,
    polygon: js.Array[ibmDashMobilefirstLib.WLNs.GeoNs.Coordinate],
    options: ibmDashMobilefirstLib.WLNs.GeoNs.InsideOutsideOptions
  ): scala.Boolean = js.native
}

