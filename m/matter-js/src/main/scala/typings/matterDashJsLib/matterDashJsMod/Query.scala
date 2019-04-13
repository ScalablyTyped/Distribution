package typings
package matterDashJsLib.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "Query")
@js.native
class Query () extends js.Object

/* static members */
@JSImport("matter-js", "Query")
@js.native
object Query extends js.Object {
  /**
    * Returns all bodies whose vertices contain the given point, from the given set of bodies.
    * @method point
    * @param {body[]} bodies
    * @param {vector} point
    * @return {body[]} The bodies matching the query
    */
  def point(
    bodies: js.Array[matterDashJsLib.matterDashJsMod.Body],
    point: matterDashJsLib.matterDashJsMod.Vector
  ): js.Array[matterDashJsLib.matterDashJsMod.Body] = js.native
  /**
    * Casts a ray segment against a set of bodies and returns all collisions, ray width is optional. Intersection points are not provided.
    * @method ray
    * @param {body[]} bodies
    * @param {vector} startPoint
    * @param {vector} endPoint
    * @param {number} [rayWidth]
    * @return {object[]} Collisions
    */
  def ray(
    bodies: js.Array[matterDashJsLib.matterDashJsMod.Body],
    startPoint: matterDashJsLib.matterDashJsMod.Vector,
    endPoint: matterDashJsLib.matterDashJsMod.Vector
  ): js.Array[_] = js.native
  def ray(
    bodies: js.Array[matterDashJsLib.matterDashJsMod.Body],
    startPoint: matterDashJsLib.matterDashJsMod.Vector,
    endPoint: matterDashJsLib.matterDashJsMod.Vector,
    rayWidth: scala.Double
  ): js.Array[_] = js.native
  /**
    * Returns all bodies whose bounds are inside (or outside if set) the given set of bounds, from the given set of bodies.
    * @method region
    * @param {body[]} bodies
    * @param {bounds} bounds
    * @param {bool} [outside=false]
    * @return {body[]} The bodies matching the query
    */
  def region(
    bodies: js.Array[matterDashJsLib.matterDashJsMod.Body],
    bounds: matterDashJsLib.matterDashJsMod.Bounds
  ): js.Array[matterDashJsLib.matterDashJsMod.Body] = js.native
  def region(
    bodies: js.Array[matterDashJsLib.matterDashJsMod.Body],
    bounds: matterDashJsLib.matterDashJsMod.Bounds,
    outside: scala.Boolean
  ): js.Array[matterDashJsLib.matterDashJsMod.Body] = js.native
}

