package typings.jsts.jstsNs.geomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsts.geom.GeometryFactory")
@js.native
/**
  * Constructs a GeometryFactory that generates Geometries having a floating PrecisionModel and a spatial-reference ID of 0.
  */
class GeometryFactory () extends js.Object {
  def this(precisionModel: PrecisionModel) = this()
  /**
    * Creates a LineString using the given Coordinates; a null or empty array will
    * create an empty LineString. Consecutive points must not be equal.
    *
    * @param {Coordinate[]}
    *          coordinates an array without null elements, or an empty array, or
    *          null.
    * @return {LineString} A new LineString.
    */
  def createLineString(coordinates: js.Array[Coordinate]): LineString = js.native
  /**
    * Creates a Point using the given Coordinate; a null Coordinate will create an
    * empty Geometry.
    *
    * @param {Coordinate}
    *          coordinate Coordinate to base this Point on.
    * @return {Point} A new Point.
    */
  def createPoint(coordinates: Coordinate): Point = js.native
}

