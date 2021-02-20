package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Query")
@js.native
class Query () extends StObject
/* static members */
object Query {
  
  /**
    * Finds a list of collisions between body and bodies.
    * @method collides
    * @param {body} body
    * @param {body[]} bodies
    * @return {object[]} Collisions
    */
  @JSImport("matter-js", "Query.collides")
  @js.native
  def collides(body: Body, bodies: js.Array[Body]): js.Array[_] = js.native
  
  /**
    * Returns all bodies whose vertices contain the given point, from the given set of bodies.
    * @method point
    * @param {body[]} bodies
    * @param {vector} point
    * @return {body[]} The bodies matching the query
    */
  @JSImport("matter-js", "Query.point")
  @js.native
  def point(bodies: js.Array[Body], point: Vector): js.Array[Body] = js.native
  
  /**
    * Casts a ray segment against a set of bodies and returns all collisions, ray width is optional. Intersection points are not provided.
    * @method ray
    * @param {body[]} bodies
    * @param {vector} startPoint
    * @param {vector} endPoint
    * @param {number} [rayWidth]
    * @return {object[]} Collisions
    */
  @JSImport("matter-js", "Query.ray")
  @js.native
  def ray(bodies: js.Array[Body], startPoint: Vector, endPoint: Vector): js.Array[_] = js.native
  @JSImport("matter-js", "Query.ray")
  @js.native
  def ray(bodies: js.Array[Body], startPoint: Vector, endPoint: Vector, rayWidth: Double): js.Array[_] = js.native
  
  /**
    * Returns all bodies whose bounds are inside (or outside if set) the given set of bounds, from the given set of bodies.
    * @method region
    * @param {body[]} bodies
    * @param {bounds} bounds
    * @param {bool} [outside=false]
    * @return {body[]} The bodies matching the query
    */
  @JSImport("matter-js", "Query.region")
  @js.native
  def region(bodies: js.Array[Body], bounds: Bounds): js.Array[Body] = js.native
  @JSImport("matter-js", "Query.region")
  @js.native
  def region(bodies: js.Array[Body], bounds: Bounds, outside: Boolean): js.Array[Body] = js.native
}
