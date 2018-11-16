package typings
package heremapsLib.HNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * A Polygon with a circular shape.
         */
@JSGlobal("H.map.Circle")
@js.native
class Circle protected () extends Polygon {
  /**
             * Constructor
             * @param center {H.geo.IPoint} - The geographical coordinates of the circle's center
             * @param radius {number} - The radius of the circle in meters
             * @param opt_options {H.map.Circle.Options=} - An object that specifies circle options and their initial values (among these, precision has a significant impact on the shape of the circle
             */
  def this(center: heremapsLib.HNs.geoNs.IPoint, radius: scala.Double) = this()
  /**
             * Constructor
             * @param center {H.geo.IPoint} - The geographical coordinates of the circle's center
             * @param radius {number} - The radius of the circle in meters
             * @param opt_options {H.map.Circle.Options=} - An object that specifies circle options and their initial values (among these, precision has a significant impact on the shape of the circle
             */
  def this(center: heremapsLib.HNs.geoNs.IPoint, radius: scala.Double, opt_options: heremapsLib.HNs.mapNs.CircleNs.Options) = this()
  /**
             * To get the center point of this circle You must not modify the returned Point instance without calling setCenter immediately afterwards.
             * @returns {H.geo.Point}
             */
  def getCenter(): heremapsLib.HNs.geoNs.Point = js.native
  /**
             * To get the precision value of this circle
             * @returns {number}
             */
  def getPrecision(): scala.Double = js.native
  /**
             * To get the length of the radius of the circle in meters.
             * @returns {number}
             */
  def getRadius(): scala.Double = js.native
  /**
             * To set the geographical center point of this circle. If the specified center is an instance of H.geo.Point you must not modify this Point instance without calling setCenter
             * immediately afterwards.
             * @param center {H.geo.IPoint}
             */
  def setCenter(center: heremapsLib.HNs.geoNs.IPoint): scala.Unit = js.native
  /**
             * To set the precision of this circle {@see H.map.Circle.Options#precision}
             * @param precision {number}
             */
  def setPrecision(precision: scala.Double): scala.Unit = js.native
  /**
             * To set the length of the radius of the circle in meters. The value is clamped to the of {@code[0 ... 20015089.27787877]} (half WGS84 mean circumference)
             * @param radius {number}
             */
  def setRadius(radius: scala.Double): scala.Unit = js.native
}

