package typings
package matterDashJsLib.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "Bounds")
@js.native
class Bounds ()
  extends matterDashJsLib.matterDashJsMod.MatterNs.Bounds

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
  def contains(
    bounds: matterDashJsLib.matterDashJsMod.MatterNs.Bounds,
    point: matterDashJsLib.matterDashJsMod.MatterNs.Vector
  ): scala.Boolean = js.native
  /**
    * Creates a new axis-aligned bounding box (AABB) for the given vertices.
    * @method create
    * @param {vertices} vertices
    * @return {bounds} A new bounds object
    */
  def create(vertices: matterDashJsLib.matterDashJsMod.MatterNs.Vertices): matterDashJsLib.matterDashJsMod.MatterNs.Bounds = js.native
  /**
    * Returns true if the two bounds intersect.
    * @method overlaps
    * @param {bounds} boundsA
    * @param {bounds} boundsB
    * @return {boolean} True if the bounds overlap, otherwise false
    */
  def overlaps(
    boundsA: matterDashJsLib.matterDashJsMod.MatterNs.Bounds,
    boundsB: matterDashJsLib.matterDashJsMod.MatterNs.Bounds
  ): scala.Boolean = js.native
  /**
    * Shifts the bounds to the given position.
    * @method shift
    * @param {bounds} bounds
    * @param {vector} position
    */
  def shift(
    bounds: matterDashJsLib.matterDashJsMod.MatterNs.Bounds,
    position: matterDashJsLib.matterDashJsMod.MatterNs.Vector
  ): scala.Unit = js.native
  /**
    * Translates the bounds by the given vector.
    * @method translate
    * @param {bounds} bounds
    * @param {vector} vector
    */
  def translate(
    bounds: matterDashJsLib.matterDashJsMod.MatterNs.Bounds,
    vector: matterDashJsLib.matterDashJsMod.MatterNs.Vector
  ): scala.Unit = js.native
  /**
    * Updates bounds using the given vertices and extends the bounds given a velocity.
    * @method update
    * @param {bounds} bounds
    * @param {vertices} vertices
    * @param {vector} velocity
    */
  def update(
    bounds: matterDashJsLib.matterDashJsMod.MatterNs.Bounds,
    vertices: matterDashJsLib.matterDashJsMod.MatterNs.Vertices,
    velocity: matterDashJsLib.matterDashJsMod.MatterNs.Vector
  ): scala.Unit = js.native
}

