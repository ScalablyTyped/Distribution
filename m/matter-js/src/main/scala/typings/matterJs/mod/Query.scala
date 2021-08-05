package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Query")
@js.native
class Query () extends StObject
/* static members */
object Query {
  
  @JSImport("matter-js", "Query")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Finds a list of collisions between body and bodies.
    * @method collides
    * @param {body} body
    * @param {body[]} bodies
    * @return {object[]} Collisions
    */
  inline def collides(body: Body, bodies: js.Array[Body]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("collides")(body.asInstanceOf[js.Any], bodies.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  /**
    * Returns all bodies whose vertices contain the given point, from the given set of bodies.
    * @method point
    * @param {body[]} bodies
    * @param {vector} point
    * @return {body[]} The bodies matching the query
    */
  inline def point(bodies: js.Array[Body], point: Vector): js.Array[Body] = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(bodies.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[js.Array[Body]]
  
  /**
    * Casts a ray segment against a set of bodies and returns all collisions, ray width is optional. Intersection points are not provided.
    * @method ray
    * @param {body[]} bodies
    * @param {vector} startPoint
    * @param {vector} endPoint
    * @param {number} [rayWidth]
    * @return {object[]} Collisions
    */
  inline def ray(bodies: js.Array[Body], startPoint: Vector, endPoint: Vector): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ray")(bodies.asInstanceOf[js.Any], startPoint.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  inline def ray(bodies: js.Array[Body], startPoint: Vector, endPoint: Vector, rayWidth: Double): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ray")(bodies.asInstanceOf[js.Any], startPoint.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], rayWidth.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  /**
    * Returns all bodies whose bounds are inside (or outside if set) the given set of bounds, from the given set of bodies.
    * @method region
    * @param {body[]} bodies
    * @param {bounds} bounds
    * @param {bool} [outside=false]
    * @return {body[]} The bodies matching the query
    */
  inline def region(bodies: js.Array[Body], bounds: Bounds): js.Array[Body] = (^.asInstanceOf[js.Dynamic].applyDynamic("region")(bodies.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[js.Array[Body]]
  inline def region(bodies: js.Array[Body], bounds: Bounds, outside: Boolean): js.Array[Body] = (^.asInstanceOf[js.Dynamic].applyDynamic("region")(bodies.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], outside.asInstanceOf[js.Any])).asInstanceOf[js.Array[Body]]
}
