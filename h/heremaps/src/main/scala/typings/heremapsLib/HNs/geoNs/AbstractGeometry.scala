package typings
package heremapsLib.HNs.geoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * The base class for all geometry types.
         */
@JSGlobal("H.geo.AbstractGeometry")
@js.native
class AbstractGeometry () extends js.Object {
  /**
               * Checks whether the geometry is equal to the geometry supplied by the caller.
               * Two geometries are considered as equal if they represent the same geometry type and have equal coordinate values.
               * @param other {any} - The geometry to check against
               * @return {boolean} - true if the two geometries are equal, otherwise false
               */
  def equals(other: js.Any): scala.Boolean = js.native
  /**
               * Returns the bounding rectangle of the geometry.
               * @return {H.geo.Rect} - the bounding rectangle of the geometry or null if the bounding rectangle can't be computed (e.g. for a geometry without coordinates)
               */
  def getBounds(): Rect = js.native
}

