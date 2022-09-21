package typings.matterJs.global.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Collision")
@js.native
open class Collision ()
  extends typings.matterJs.mod.Collision
/* static members */
object Collision {
  
  @JSGlobal("Matter.Collision")
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
  inline def collides(
    bodyA: typings.matterJs.mod.Body,
    bodyB: typings.matterJs.mod.Body,
    pairs: typings.matterJs.mod.Pairs
  ): typings.matterJs.mod.Collision | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("collides")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any], pairs.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Collision | Null]
  
  /**
    * Creates a new collision record.
    * @method create
    * @param {Body} bodyA The first body part represented by the collision record
    * @param {Body} bodyB The second body part represented by the collision record
    * @returns {Collision} A new collision record
    */
  inline def create(bodyA: typings.matterJs.mod.Body, bodyB: typings.matterJs.mod.Body): typings.matterJs.mod.Collision = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Collision]
}
