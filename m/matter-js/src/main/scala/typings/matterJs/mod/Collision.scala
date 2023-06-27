package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Collision")
@js.native
open class Collision () extends StObject {
  
  /**
    * The first body part represented by the collision (see also `collision.parentA`).
    *
    */
  var bodyA: Body = js.native
  
  /**
    * The second body part represented by the collision (see also `collision.parentB`).
    *
    */
  var bodyB: Body = js.native
  
  /**
    * A flag that indicates if the bodies were colliding when the collision was last updated.
    *
    * @default false
    */
  var collided: Boolean = js.native
  
  /**
    * A `Number` that represents the minimum separating distance between the bodies along the collision normal.
    *
    * @readOnly
    * @default 0
    */
  val depth: Double = js.native
  
  /**
    * A normalised `Vector` that represents the direction between the bodies that provides the minimum separating distance.
    *
    * @default { x: 0, y: 0 }
    */
  var normal: Vector = js.native
  
  /**
    * A reference to the pair using this collision record, if there is one.
    *
    * @default null
    */
  var pair: Pair | Null = js.native
  
  /**
    * The first body represented by the collision (i.e. `collision.bodyA.parent`).
    *
    */
  var parentA: Body = js.native
  
  /**
    * The second body represented by the collision (i.e. `collision.bodyB.parent`).
    *
    */
  var parentB: Body = js.native
  
  /**
    * A `Vector` that represents the direction and depth of the collision.
    *
    * @default { x: 0, y: 0 }
    */
  var penetration: Vector = js.native
  
  /**
    * An array of body vertices that represent the support points in the collision.
    * These are the deepest vertices (along the collision normal) of each body that are contained by the other body's vertices.
    *
    * @default []
    */
  var supports: js.Array[Vector] = js.native
  
  /**
    * A normalised `Vector` that is the tangent direction to the collision normal.
    *
    * @default { x: 0, y: 0 }
    */
  var tangent: Vector = js.native
}
/* static members */
object Collision {
  
  @JSImport("matter-js", "Collision")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Detect collision between two bodies.
    * @method collides
    * @param {Body} bodyA
    * @param {Body} bodyB
    * @param {pairs} [Pairs] Optionally reuse collision records from existing pairs.
    * @returns {collision|null} A collision record if detected, otherwise null
    */
  inline def collides(bodyA: Body, bodyB: Body, pairs: Pairs): Collision | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("collides")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any], pairs.asInstanceOf[js.Any])).asInstanceOf[Collision | Null]
  
  /**
    * Creates a new collision record.
    * @method create
    * @param {Body} bodyA The first body part represented by the collision record
    * @param {Body} bodyB The second body part represented by the collision record
    * @returns {Collision} A new collision record
    */
  inline def create(bodyA: Body, bodyB: Body): Collision = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any])).asInstanceOf[Collision]
}
