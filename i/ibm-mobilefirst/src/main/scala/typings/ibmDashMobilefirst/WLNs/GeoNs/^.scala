package typings.ibmDashMobilefirst.WLNs.GeoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.Geo")
@js.native
object ^ extends js.Object {
  def getDistanceBetweenCoordinates(coordinate1: Coordinate, coordinate2: Coordinate): Double = js.native
  def getDistanceToCircle(coordinate: Coordinate, circle: Circle, options: DistanceOptions): Double = js.native
  def getDistanceToPolygon(coordinate: Coordinate, polygon: js.Array[Coordinate], options: DistanceOptions): Double = js.native
  def isInsideCircle(coordinate: Coordinate, circle: Circle, options: InsideOutsideOptions): Boolean = js.native
  def isInsidePolygon(coordinate: Coordinate, polygon: js.Array[Coordinate], options: InsideOutsideOptions): Boolean = js.native
  def isOutsideCircle(coordinate: Coordinate, circle: Circle, options: InsideOutsideOptions): Boolean = js.native
  def isOutsidePolygon(coordinate: Coordinate, polygon: js.Array[Coordinate], options: InsideOutsideOptions): Boolean = js.native
}

