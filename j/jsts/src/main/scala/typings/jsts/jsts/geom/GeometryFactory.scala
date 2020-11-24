package typings.jsts.jsts.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  def createLineString(coordinates: js.Array[Coordinate]): LineString = js.native
  
  /**
    * Creates a LinearRing using the given Coordinates; a null or empty array
    * will create an empty LinearRing. Consecutive points must not be equal.
    *
    * @param {Coordinate[]}
    *          coordinates an array without null elements, or an empty array,
    * or null.
    * @return {LineString} A new LinearRing.
    */
  def createLinearRing(coordinates: js.Array[Coordinate]): LinearRing = js.native
  
  /**
    * Creates a Point using the given Coordinate; a null Coordinate will create an
    * empty Geometry.
    *
    * @param {Coordinate}
    *          coordinate Coordinate to base this Point on.
    * @return {Point} A new Point.
    */
  def createPoint(coordinates: Coordinate): Point = js.native
  
  /**
    * Creates a Polygon using the given LinearRing.
    *
    * @param {LinearRing} A LinearRing constructed by coordinates.
    * @return {Polygon} A new Polygon.
    */
  def createPolygon(shell: LinearRing, holes: js.Array[LinearRing]): Polygon = js.native
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
  
  @scala.inline
  implicit class GeometryFactoryOps[Self <: GeometryFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateLineString(value: js.Array[Coordinate] => LineString): Self = this.set("createLineString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateLinearRing(value: js.Array[Coordinate] => LinearRing): Self = this.set("createLinearRing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreatePoint(value: Coordinate => Point): Self = this.set("createPoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreatePolygon(value: (LinearRing, js.Array[LinearRing]) => Polygon): Self = this.set("createPolygon", js.Any.fromFunction2(value))
  }
}
