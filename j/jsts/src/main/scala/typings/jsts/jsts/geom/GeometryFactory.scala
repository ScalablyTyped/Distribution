package typings.jsts.jsts.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryFactory extends js.Object {
  /**
    * Creates a LineString using the given Coordinates; a null or empty array will
    * create an empty LineString. Consecutive points must not be equal.
    *
    * @param {Coordinate[]}
    *          coordinates an array without null elements, or an empty array, or
    *          null.
    * @return {LineString} A new LineString.
    */
  def createLineString(coordinates: js.Array[Coordinate]): LineString
  /**
    * Creates a LinearRing using the given Coordinates; a null or empty array
    * will create an empty LinearRing. Consecutive points must not be equal.
    *
    * @param {Coordinate[]}
    *          coordinates an array without null elements, or an empty array,
    * or null.
    * @return {LineString} A new LinearRing.
    */
  def createLinearRing(coordinates: js.Array[Coordinate]): LinearRing
  /**
    * Creates a Point using the given Coordinate; a null Coordinate will create an
    * empty Geometry.
    *
    * @param {Coordinate}
    *          coordinate Coordinate to base this Point on.
    * @return {Point} A new Point.
    */
  def createPoint(coordinates: Coordinate): Point
  /**
    * Creates a Polygon using the given LinearRing.
    *
    * @param {LinearRing} A LinearRing constructed by coordinates.
    * @return {Polygon} A new Polygon.
    */
  def createPolygon(shell: LinearRing, holes: js.Array[LinearRing]): Polygon
}

object GeometryFactory {
  @scala.inline
  def apply(
    createLineString: js.Array[Coordinate] => LineString,
    createLinearRing: js.Array[Coordinate] => LinearRing,
    createPoint: Coordinate => Point,
    createPolygon: (LinearRing, js.Array[LinearRing]) => Polygon
  ): GeometryFactory = {
    val __obj = js.Dynamic.literal(createLineString = js.Any.fromFunction1(createLineString), createLinearRing = js.Any.fromFunction1(createLinearRing), createPoint = js.Any.fromFunction1(createPoint), createPolygon = js.Any.fromFunction2(createPolygon))
    __obj.asInstanceOf[GeometryFactory]
  }
}

