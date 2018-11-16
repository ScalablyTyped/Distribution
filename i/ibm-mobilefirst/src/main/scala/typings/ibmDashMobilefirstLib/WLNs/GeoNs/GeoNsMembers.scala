package typings
package ibmDashMobilefirstLib.WLNs.GeoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.Geo")
@js.native
object GeoNsMembers extends js.Object {
  def getDistanceBetweenCoordinates(coordinate1: Coordinate, coordinate2: Coordinate): scala.Double = js.native
  def getDistanceToCircle(coordinate: Coordinate, circle: Circle, options: DistanceOptions): scala.Double = js.native
  def getDistanceToPolygon(coordinate: Coordinate, polygon: js.Array[Coordinate], options: DistanceOptions): scala.Double = js.native
  def isInsideCircle(coordinate: Coordinate, circle: Circle, options: InsideOutsideOptions): scala.Boolean = js.native
  def isInsidePolygon(coordinate: Coordinate, polygon: js.Array[Coordinate], options: InsideOutsideOptions): scala.Boolean = js.native
  def isOutsideCircle(coordinate: Coordinate, circle: Circle, options: InsideOutsideOptions): scala.Boolean = js.native
  def isOutsidePolygon(coordinate: Coordinate, polygon: js.Array[Coordinate], options: InsideOutsideOptions): scala.Boolean = js.native
}

