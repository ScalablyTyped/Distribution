package typings.heremaps.H.geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for all geometry types.
  */
trait AbstractGeometry extends js.Object {
  /**
    * Checks whether the geometry is equal to the geometry supplied by the caller.
    * Two geometries are considered as equal if they represent the same geometry type and have equal coordinate values.
    * @param other {any} - The geometry to check against
    * @return {boolean} - true if the two geometries are equal, otherwise false
    */
  def equals(other: js.Any): Boolean
  /**
    * Returns the bounding rectangle of the geometry.
    * @return {H.geo.Rect} - the bounding rectangle of the geometry or null if the bounding rectangle can't be computed (e.g. for a geometry without coordinates)
    */
  def getBoundingBox(): Rect
}

object AbstractGeometry {
  @scala.inline
  def apply(equals: js.Any => Boolean, getBoundingBox: () => Rect): AbstractGeometry = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), getBoundingBox = js.Any.fromFunction0(getBoundingBox))
    __obj.asInstanceOf[AbstractGeometry]
  }
}

