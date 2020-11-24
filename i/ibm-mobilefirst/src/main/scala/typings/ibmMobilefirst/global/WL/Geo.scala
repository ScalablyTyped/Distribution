package typings.ibmMobilefirst.global.WL

import typings.ibmMobilefirst.WL.Geo.Circle
import typings.ibmMobilefirst.WL.Geo.Coordinate
import typings.ibmMobilefirst.WL.Geo.DistanceOptions
import typings.ibmMobilefirst.WL.Geo.InsideOutsideOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("WL.Geo")
@js.native
object Geo extends js.Object {
  
  def getDistanceBetweenCoordinates(coordinate1: Coordinate, coordinate2: Coordinate): Double = js.native
  
  def getDistanceToCircle(coordinate: Coordinate, circle: Circle, options: DistanceOptions): Double = js.native
  
  def getDistanceToPolygon(coordinate: Coordinate, polygon: js.Array[Coordinate], options: DistanceOptions): Double = js.native
  
  def isInsideCircle(coordinate: Coordinate, circle: Circle, options: InsideOutsideOptions): Boolean = js.native
  
  def isInsidePolygon(coordinate: Coordinate, polygon: js.Array[Coordinate], options: InsideOutsideOptions): Boolean = js.native
  
  def isOutsideCircle(coordinate: Coordinate, circle: Circle, options: InsideOutsideOptions): Boolean = js.native
  
  def isOutsidePolygon(coordinate: Coordinate, polygon: js.Array[Coordinate], options: InsideOutsideOptions): Boolean = js.native
}
