package typings.jsts.jsts.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineString extends Geometry {
  
  /**
    * @return {jsts.geom.Coordinate} The n'th coordinate of this
    *         jsts.geom.LineString.
    * @param {int}
    *          n index.
    */
  def getCoordinateN(n: Double): Coordinate = js.native
  
  /**
    * @return {jsts.geom.Point} The last point of this
    *         jsts.geom.LineString.
    */
  def getEndPoint(): Point = js.native
  
  /**
    * @return {jsts.geom.Point} The n'th point of this
    *         jsts.geom.LineString.
    * @param {int}
    *          n index.
    */
  def getPointN(n: Double): Point = js.native
  
  /**
    * @return {jsts.geom.Point} The first point of this
    *         jsts.geom.LineString.
    */
  def getStartPoint(): Point = js.native
  
  /**
    * @return {Boolean} true if LineString is Closed.
    */
  def isClosed(): Boolean = js.native
  
  /**
    * @return {Boolean} true if LineString is a Ring.
    */
  def isRing(): Boolean = js.native
}
object LineString {
  
  @scala.inline
  def apply(
    apply: js.Any => Unit,
    buffer: (Double, Double, Double) => Geometry,
    checkNotGeometryCollection: Geometry => Unit,
    compare: (js.Array[_], js.Array[_]) => Double,
    compareTo: Geometry => Double,
    compareToSameClass: Geometry => Double,
    computeEnvelopeInternal: () => Envelope,
    contains: Geometry => Boolean,
    convexHull: () => Geometry,
    coveredBy: Geometry => Boolean,
    covers: Geometry => Boolean,
    crosses: Geometry => Boolean,
    difference: Geometry => Geometry,
    disjoint: Geometry => Boolean,
    distance: Geometry => Double,
    envelope: Envelope,
    equal: (Coordinate, Coordinate, Double) => Boolean,
    equals: js.Object => Boolean,
    equalsExact: (Geometry, Double) => Boolean,
    equalsNorm: Geometry => Boolean,
    equalsTopo: Geometry => Boolean,
    getArea: () => Double,
    getBoundary: () => Geometry,
    getBoundaryDimension: () => Double,
    getCentroid: () => Point,
    getCoordinate: () => Coordinate,
    getCoordinateN: Double => Coordinate,
    getCoordinates: () => js.Array[Coordinate],
    getDimension: () => Double,
    getEndPoint: () => Point,
    getEnvelope: () => Geometry,
    getEnvelopeInternal: () => Envelope,
    getFactory: () => js.Any,
    getGeometryN: Double => Geometry,
    getGeometryType: () => String,
    getInteriorPoint: () => Point,
    getLength: () => Double,
    getNumGeometries: () => Double,
    getNumPoints: () => Double,
    getPointN: Double => Point,
    getPrecisionModel: () => PrecisionModel,
    getStartPoint: () => Point,
    intersection: Geometry => Geometry,
    intersects: Geometry => Boolean,
    isClosed: () => Boolean,
    isEmpty: () => Boolean,
    isEquivalentClass: Geometry => Boolean,
    isGeometryCollection: () => Boolean,
    isGeometryCollectionBase: () => Boolean,
    isRectangle: () => Boolean,
    isRing: () => Boolean,
    isSimple: () => Boolean,
    isValid: () => Boolean,
    isWithinDistance: (Geometry, Double) => Boolean,
    norm: () => Geometry,
    normalize: () => Unit,
    overlaps: Geometry => Boolean,
    relate: (Geometry, String) => Boolean,
    relate2: Geometry => js.Any,
    symDifference: Geometry => Geometry,
    touches: Geometry => Boolean,
    union: Geometry => Geometry,
    within: Geometry => Boolean
  ): LineString = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), buffer = js.Any.fromFunction3(buffer), checkNotGeometryCollection = js.Any.fromFunction1(checkNotGeometryCollection), compare = js.Any.fromFunction2(compare), compareTo = js.Any.fromFunction1(compareTo), compareToSameClass = js.Any.fromFunction1(compareToSameClass), computeEnvelopeInternal = js.Any.fromFunction0(computeEnvelopeInternal), contains = js.Any.fromFunction1(contains), convexHull = js.Any.fromFunction0(convexHull), coveredBy = js.Any.fromFunction1(coveredBy), covers = js.Any.fromFunction1(covers), crosses = js.Any.fromFunction1(crosses), difference = js.Any.fromFunction1(difference), disjoint = js.Any.fromFunction1(disjoint), distance = js.Any.fromFunction1(distance), envelope = envelope.asInstanceOf[js.Any], equal = js.Any.fromFunction3(equal), equals = js.Any.fromFunction1(equals), equalsExact = js.Any.fromFunction2(equalsExact), equalsNorm = js.Any.fromFunction1(equalsNorm), equalsTopo = js.Any.fromFunction1(equalsTopo), getArea = js.Any.fromFunction0(getArea), getBoundary = js.Any.fromFunction0(getBoundary), getBoundaryDimension = js.Any.fromFunction0(getBoundaryDimension), getCentroid = js.Any.fromFunction0(getCentroid), getCoordinate = js.Any.fromFunction0(getCoordinate), getCoordinateN = js.Any.fromFunction1(getCoordinateN), getCoordinates = js.Any.fromFunction0(getCoordinates), getDimension = js.Any.fromFunction0(getDimension), getEndPoint = js.Any.fromFunction0(getEndPoint), getEnvelope = js.Any.fromFunction0(getEnvelope), getEnvelopeInternal = js.Any.fromFunction0(getEnvelopeInternal), getFactory = js.Any.fromFunction0(getFactory), getGeometryN = js.Any.fromFunction1(getGeometryN), getGeometryType = js.Any.fromFunction0(getGeometryType), getInteriorPoint = js.Any.fromFunction0(getInteriorPoint), getLength = js.Any.fromFunction0(getLength), getNumGeometries = js.Any.fromFunction0(getNumGeometries), getNumPoints = js.Any.fromFunction0(getNumPoints), getPointN = js.Any.fromFunction1(getPointN), getPrecisionModel = js.Any.fromFunction0(getPrecisionModel), getStartPoint = js.Any.fromFunction0(getStartPoint), intersection = js.Any.fromFunction1(intersection), intersects = js.Any.fromFunction1(intersects), isClosed = js.Any.fromFunction0(isClosed), isEmpty = js.Any.fromFunction0(isEmpty), isEquivalentClass = js.Any.fromFunction1(isEquivalentClass), isGeometryCollection = js.Any.fromFunction0(isGeometryCollection), isGeometryCollectionBase = js.Any.fromFunction0(isGeometryCollectionBase), isRectangle = js.Any.fromFunction0(isRectangle), isRing = js.Any.fromFunction0(isRing), isSimple = js.Any.fromFunction0(isSimple), isValid = js.Any.fromFunction0(isValid), isWithinDistance = js.Any.fromFunction2(isWithinDistance), norm = js.Any.fromFunction0(norm), normalize = js.Any.fromFunction0(normalize), overlaps = js.Any.fromFunction1(overlaps), relate = js.Any.fromFunction2(relate), relate2 = js.Any.fromFunction1(relate2), symDifference = js.Any.fromFunction1(symDifference), touches = js.Any.fromFunction1(touches), union = js.Any.fromFunction1(union), within = js.Any.fromFunction1(within))
    __obj.asInstanceOf[LineString]
  }
  
  @scala.inline
  implicit class LineStringOps[Self <: LineString] (val x: Self) extends AnyVal {
    
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
    def setGetCoordinateN(value: Double => Coordinate): Self = this.set("getCoordinateN", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetEndPoint(value: () => Point): Self = this.set("getEndPoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPointN(value: Double => Point): Self = this.set("getPointN", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStartPoint(value: () => Point): Self = this.set("getStartPoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsClosed(value: () => Boolean): Self = this.set("isClosed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRing(value: () => Boolean): Self = this.set("isRing", js.Any.fromFunction0(value))
  }
}
