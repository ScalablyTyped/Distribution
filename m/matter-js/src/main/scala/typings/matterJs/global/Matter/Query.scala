package typings.matterJs.global.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Query")
@js.native
open class Query ()
  extends typings.matterJs.mod.Query
/* static members */
object Query {
  
  @JSGlobal("Matter.Query")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Finds a list of collisions between body and bodies.
    * @method collides
    * @param {Body} body
    * @param {Body[]} bodies
    * @returns {Collision[]} Collisions
    */
  inline def collides(body: typings.matterJs.mod.Body, bodies: js.Array[typings.matterJs.mod.Body]): js.Array[typings.matterJs.mod.Collision] = (^.asInstanceOf[js.Dynamic].applyDynamic("collides")(body.asInstanceOf[js.Any], bodies.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.matterJs.mod.Collision]]
  
  /**
    * Returns all bodies whose vertices contain the given point, from the given set of bodies.
    * @method point
    * @param {Body[]} bodies
    * @param {Vector} point
    * @returns {Body[]} The bodies matching the query
    */
  inline def point(bodies: js.Array[typings.matterJs.mod.Body], point: typings.matterJs.mod.Vector): js.Array[typings.matterJs.mod.Body] = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(bodies.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.matterJs.mod.Body]]
  
  /**
    * Casts a ray segment against a set of bodies and returns all collisions, ray width is optional. Intersection points are not provided.
    * @method ray
    * @param {Body[]} bodies
    * @param {Vector} startPoint
    * @param {Vector} endPoint
    * @param {number} [rayWidth]
    * @returns {Collision[]} Collisions
    */
  inline def ray(
    bodies: js.Array[typings.matterJs.mod.Body],
    startPoint: typings.matterJs.mod.Vector,
    endPoint: typings.matterJs.mod.Vector
  ): js.Array[typings.matterJs.mod.Collision] = (^.asInstanceOf[js.Dynamic].applyDynamic("ray")(bodies.asInstanceOf[js.Any], startPoint.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.matterJs.mod.Collision]]
  inline def ray(
    bodies: js.Array[typings.matterJs.mod.Body],
    startPoint: typings.matterJs.mod.Vector,
    endPoint: typings.matterJs.mod.Vector,
    rayWidth: Double
  ): js.Array[typings.matterJs.mod.Collision] = (^.asInstanceOf[js.Dynamic].applyDynamic("ray")(bodies.asInstanceOf[js.Any], startPoint.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], rayWidth.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.matterJs.mod.Collision]]
  
  /**
    * Returns all bodies whose bounds are inside (or outside if set) the given set of bounds, from the given set of bodies.
    * @method region
    * @param {Body[]} bodies
    * @param {Bounds} bounds
    * @param {boolean} [outside=false]
    * @returns {Body[]} The bodies matching the query
    */
  inline def region(bodies: js.Array[typings.matterJs.mod.Body], bounds: typings.matterJs.mod.Bounds): js.Array[typings.matterJs.mod.Body] = (^.asInstanceOf[js.Dynamic].applyDynamic("region")(bodies.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.matterJs.mod.Body]]
  inline def region(bodies: js.Array[typings.matterJs.mod.Body], bounds: typings.matterJs.mod.Bounds, outside: Boolean): js.Array[typings.matterJs.mod.Body] = (^.asInstanceOf[js.Dynamic].applyDynamic("region")(bodies.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], outside.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.matterJs.mod.Body]]
}
