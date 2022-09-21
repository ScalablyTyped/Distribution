package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "SAT")
@js.native
open class SAT () extends StObject
/* static members */
object SAT {
  
  @JSImport("matter-js", "SAT")
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
  inline def collides(bodyA: Body, bodyB: Body): Collision = (^.asInstanceOf[js.Dynamic].applyDynamic("collides")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any])).asInstanceOf[Collision]
  inline def collides(bodyA: Body, bodyB: Body, previousCollision: Collision): Collision = (^.asInstanceOf[js.Dynamic].applyDynamic("collides")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any], previousCollision.asInstanceOf[js.Any])).asInstanceOf[Collision]
}
