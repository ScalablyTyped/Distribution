package typings.jsts.jstsNs.geomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsts.geom.Polygon")
@js.native
class Polygon protected () extends Geometry {
  /**
    * @constructor
    */
  def this(shell: LinearRing) = this()
  def this(shell: LinearRing, holes: js.Array[LinearRing]) = this()
  def this(shell: LinearRing, holes: js.Array[LinearRing], factory: js.Any) = this()
  /**
    * Gets the exterior ring.
    *
    * @return {LinearRing} The exterior ring.
    */
  def getExteriorRing(): LinearRing = js.native
  /**
    * Gets the interior ring at the specified index.
    *
    * @param {number} n The interior ring index.
    *
    * @returns {LinearRing} The interior ring at the specified index.
    */
  def getInteriorRingN(n: Double): LinearRing = js.native
  /**
    * Gets the number of interior rings.
    *
    * @return {number} The number of interior rings.
    */
  def getNumInteriorRing(): Double = js.native
}

