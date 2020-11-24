package typings.heremaps.H.map

import typings.heremaps.H.geo.IPoint
import typings.heremaps.H.geo.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Polygon with a circular shape.
  */
@js.native
trait Circle_ extends Polygon {
  
  /**
    * To get the center point of this circle You must not modify the returned Point instance without calling setCenter immediately afterwards.
    * @returns {H.geo.Point}
    */
  def getCenter(): Point = js.native
  
  /**
    * To get the precision value of this circle
    * @returns {number}
    */
  def getPrecision(): Double = js.native
  
  /**
    * To get the length of the radius of the circle in meters.
    * @returns {number}
    */
  def getRadius(): Double = js.native
  
  /**
    * To set the geographical center point of this circle. If the specified center is an instance of H.geo.Point you must not modify this Point instance without calling setCenter
    * immediately afterwards.
    * @param center {H.geo.IPoint}
    */
  def setCenter(center: IPoint): Unit = js.native
  
  /**
    * To set the precision of this circle {@see H.map.Circle.Options#precision}
    * @param precision {number}
    */
  def setPrecision(precision: Double): Unit = js.native
  
  /**
    * To set the length of the radius of the circle in meters. The value is clamped to the of {@code[0 ... 20015089.27787877]} (half WGS84 mean circumference)
    * @param radius {number}
    */
  def setRadius(radius: Double): Unit = js.native
}
