package typings.heremaps.H.geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for all geometry types.
  */
@js.native
trait AbstractGeometry extends js.Object {
  /**
    * Checks whether the geometry is equal to the geometry supplied by the caller.
    * Two geometries are considered as equal if they represent the same geometry type and have equal coordinate values.
    * @param other {any} - The geometry to check against
    * @return {boolean} - true if the two geometries are equal, otherwise false
    */
  def equals(other: js.Any): Boolean = js.native
  /**
    * Returns the bounding rectangle of the geometry.
    * @return {H.geo.Rect} - the bounding rectangle of the geometry or null if the bounding rectangle can't be computed (e.g. for a geometry without coordinates)
    */
  def getBoundingBox(): Rect = js.native
}

object AbstractGeometry {
  @scala.inline
  def apply(equals: js.Any => Boolean, getBoundingBox: () => Rect): AbstractGeometry = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), getBoundingBox = js.Any.fromFunction0(getBoundingBox))
    __obj.asInstanceOf[AbstractGeometry]
  }
  @scala.inline
  implicit class AbstractGeometryOps[Self <: AbstractGeometry] (val x: Self) extends AnyVal {
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
    def setEquals(value: js.Any => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setGetBoundingBox(value: () => Rect): Self = this.set("getBoundingBox", js.Any.fromFunction0(value))
  }
  
}

