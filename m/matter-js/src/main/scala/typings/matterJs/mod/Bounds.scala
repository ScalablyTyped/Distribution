package typings.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "Bounds")
@js.native
class Bounds () extends js.Object {
  var max: Vector = js.native
  var min: Vector = js.native
}

/* static members */
@JSImport("matter-js", "Bounds")
@js.native
object Bounds extends js.Object {
  /**
    * Returns true if the bounds contains the given point.
    * @method contains
    * @param {bounds} bounds
    * @param {vector} point
    * @return {boolean} True if the bounds contain the point, otherwise false
    */
  def contains(bounds: Bounds, point: Vector): Boolean = js.native
  /**
    * Creates a new axis-aligned bounding box (AABB) for the given vertices.
    * @method create
    * @param {vertices} vertices
    * @return {bounds} A new bounds object
    */
  def create(vertices: Vertices): Bounds = js.native
  /**
    * Returns true if the two bounds intersect.
    * @method overlaps
    * @param {bounds} boundsA
    * @param {bounds} boundsB
    * @return {boolean} True if the bounds overlap, otherwise false
    */
  def overlaps(boundsA: Bounds, boundsB: Bounds): Boolean = js.native
  /**
    * Shifts the bounds to the given position.
    * @method shift
    * @param {bounds} bounds
    * @param {vector} position
    */
  def shift(bounds: Bounds, position: Vector): Unit = js.native
  /**
    * Translates the bounds by the given vector.
    * @method translate
    * @param {bounds} bounds
    * @param {vector} vector
    */
  def translate(bounds: Bounds, vector: Vector): Unit = js.native
  /**
    * Updates bounds using the given vertices and extends the bounds given a velocity.
    * @method update
    * @param {bounds} bounds
    * @param {vertices} vertices
    * @param {vector} velocity
    */
  def update(bounds: Bounds, vertices: Vertices, velocity: Vector): Unit = js.native
}

