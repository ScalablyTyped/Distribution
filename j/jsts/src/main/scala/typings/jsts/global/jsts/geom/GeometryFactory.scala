package typings.jsts.global.jsts.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsts.geom.GeometryFactory")
@js.native
/**
  * Constructs a GeometryFactory that generates Geometries having a floating PrecisionModel and a spatial-reference ID of 0.
  */
class GeometryFactory ()
  extends typings.jsts.jsts.geom.GeometryFactory {
  def this(precisionModel: typings.jsts.jsts.geom.PrecisionModel) = this()
  /**
    * Creates a LineString using the given Coordinates; a null or empty array will
    * create an empty LineString. Consecutive points must not be equal.
    *
    * @param {Coordinate[]}
    *          coordinates an array without null elements, or an empty array, or
    *          null.
    * @return {LineString} A new LineString.
    */
  /* CompleteClass */
  override def createLineString(coordinates: js.Array[typings.jsts.jsts.geom.Coordinate]): typings.jsts.jsts.geom.LineString = js.native
  /**
    * Creates a LinearRing using the given Coordinates; a null or empty array
    * will create an empty LinearRing. Consecutive points must not be equal.
    *
    * @param {Coordinate[]}
    *          coordinates an array without null elements, or an empty array,
    * or null.
    * @return {LineString} A new LinearRing.
    */
  /* CompleteClass */
  override def createLinearRing(coordinates: js.Array[typings.jsts.jsts.geom.Coordinate]): typings.jsts.jsts.geom.LinearRing = js.native
  /**
    * Creates a Point using the given Coordinate; a null Coordinate will create an
    * empty Geometry.
    *
    * @param {Coordinate}
    *          coordinate Coordinate to base this Point on.
    * @return {Point} A new Point.
    */
  /* CompleteClass */
  override def createPoint(coordinates: typings.jsts.jsts.geom.Coordinate): typings.jsts.jsts.geom.Point = js.native
  /**
    * Creates a Polygon using the given LinearRing.
    *
    * @param {LinearRing} A LinearRing constructed by coordinates.
    * @return {Polygon} A new Polygon.
    */
  /* CompleteClass */
  override def createPolygon(shell: typings.jsts.jsts.geom.LinearRing, holes: js.Array[typings.jsts.jsts.geom.LinearRing]): typings.jsts.jsts.geom.Polygon = js.native
}

