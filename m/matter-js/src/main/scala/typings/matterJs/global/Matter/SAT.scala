package typings.matterJs.global.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.SAT")
@js.native
open class SAT ()
  extends typings.matterJs.mod.SAT
/* static members */
object SAT {
  
  @JSGlobal("Matter.SAT")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Detect collision between two bodies using the Separating Axis Theorem.
    * @deprecated replaced by Collision.collides
    * @method collides
    * @param {Body} bodyA
    * @param {Body} bodyB
    * @param {Collision} previousCollision
    * @returns {Collision} collision
    */
  inline def collides(bodyA: typings.matterJs.mod.Body, bodyB: typings.matterJs.mod.Body): typings.matterJs.mod.Collision = (^.asInstanceOf[js.Dynamic].applyDynamic("collides")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Collision]
  inline def collides(
    bodyA: typings.matterJs.mod.Body,
    bodyB: typings.matterJs.mod.Body,
    previousCollision: typings.matterJs.mod.Collision
  ): typings.matterJs.mod.Collision = (^.asInstanceOf[js.Dynamic].applyDynamic("collides")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any], previousCollision.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Collision]
}
