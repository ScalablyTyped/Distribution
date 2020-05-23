package typings.jsts.jsts.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polygon extends Geometry {
  /**
    * Gets the exterior ring.
    *
    * @return {LinearRing} The exterior ring.
    */
  def getExteriorRing(): LinearRing
  /**
    * Gets the interior ring at the specified index.
    *
    * @param {number} n The interior ring index.
    *
    * @returns {LinearRing} The interior ring at the specified index.
    */
  def getInteriorRingN(n: Double): LinearRing
  /**
    * Gets the number of interior rings.
    *
    * @return {number} The number of interior rings.
    */
  def getNumInteriorRing(): Double
}

object Polygon {
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
    getCoordinates: () => js.Array[Coordinate],
    getDimension: () => Double,
    getEnvelope: () => Geometry,
    getEnvelopeInternal: () => Envelope,
    getExteriorRing: () => LinearRing,
    getFactory: () => js.Any,
    getGeometryN: Double => Geometry,
    getGeometryType: () => String,
    getInteriorPoint: () => Point,
    getInteriorRingN: Double => LinearRing,
    getLength: () => Double,
    getNumGeometries: () => Double,
    getNumInteriorRing: () => Double,
    getNumPoints: () => Double,
    getPrecisionModel: () => PrecisionModel,
    intersection: Geometry => Geometry,
    intersects: Geometry => Boolean,
    isEmpty: () => Boolean,
    isEquivalentClass: Geometry => Boolean,
    isGeometryCollection: () => Boolean,
    isGeometryCollectionBase: () => Boolean,
    isRectangle: () => Boolean,
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
  ): Polygon = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), buffer = js.Any.fromFunction3(buffer), checkNotGeometryCollection = js.Any.fromFunction1(checkNotGeometryCollection), compare = js.Any.fromFunction2(compare), compareTo = js.Any.fromFunction1(compareTo), compareToSameClass = js.Any.fromFunction1(compareToSameClass), computeEnvelopeInternal = js.Any.fromFunction0(computeEnvelopeInternal), contains = js.Any.fromFunction1(contains), convexHull = js.Any.fromFunction0(convexHull), coveredBy = js.Any.fromFunction1(coveredBy), covers = js.Any.fromFunction1(covers), crosses = js.Any.fromFunction1(crosses), difference = js.Any.fromFunction1(difference), disjoint = js.Any.fromFunction1(disjoint), distance = js.Any.fromFunction1(distance), envelope = envelope.asInstanceOf[js.Any], equal = js.Any.fromFunction3(equal), equals = js.Any.fromFunction1(equals), equalsExact = js.Any.fromFunction2(equalsExact), equalsNorm = js.Any.fromFunction1(equalsNorm), equalsTopo = js.Any.fromFunction1(equalsTopo), getArea = js.Any.fromFunction0(getArea), getBoundary = js.Any.fromFunction0(getBoundary), getBoundaryDimension = js.Any.fromFunction0(getBoundaryDimension), getCentroid = js.Any.fromFunction0(getCentroid), getCoordinate = js.Any.fromFunction0(getCoordinate), getCoordinates = js.Any.fromFunction0(getCoordinates), getDimension = js.Any.fromFunction0(getDimension), getEnvelope = js.Any.fromFunction0(getEnvelope), getEnvelopeInternal = js.Any.fromFunction0(getEnvelopeInternal), getExteriorRing = js.Any.fromFunction0(getExteriorRing), getFactory = js.Any.fromFunction0(getFactory), getGeometryN = js.Any.fromFunction1(getGeometryN), getGeometryType = js.Any.fromFunction0(getGeometryType), getInteriorPoint = js.Any.fromFunction0(getInteriorPoint), getInteriorRingN = js.Any.fromFunction1(getInteriorRingN), getLength = js.Any.fromFunction0(getLength), getNumGeometries = js.Any.fromFunction0(getNumGeometries), getNumInteriorRing = js.Any.fromFunction0(getNumInteriorRing), getNumPoints = js.Any.fromFunction0(getNumPoints), getPrecisionModel = js.Any.fromFunction0(getPrecisionModel), intersection = js.Any.fromFunction1(intersection), intersects = js.Any.fromFunction1(intersects), isEmpty = js.Any.fromFunction0(isEmpty), isEquivalentClass = js.Any.fromFunction1(isEquivalentClass), isGeometryCollection = js.Any.fromFunction0(isGeometryCollection), isGeometryCollectionBase = js.Any.fromFunction0(isGeometryCollectionBase), isRectangle = js.Any.fromFunction0(isRectangle), isSimple = js.Any.fromFunction0(isSimple), isValid = js.Any.fromFunction0(isValid), isWithinDistance = js.Any.fromFunction2(isWithinDistance), norm = js.Any.fromFunction0(norm), normalize = js.Any.fromFunction0(normalize), overlaps = js.Any.fromFunction1(overlaps), relate = js.Any.fromFunction2(relate), relate2 = js.Any.fromFunction1(relate2), symDifference = js.Any.fromFunction1(symDifference), touches = js.Any.fromFunction1(touches), union = js.Any.fromFunction1(union), within = js.Any.fromFunction1(within))
    __obj.asInstanceOf[Polygon]
  }
}

