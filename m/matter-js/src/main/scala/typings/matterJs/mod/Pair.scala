package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Pair")
@js.native
open class Pair () extends StObject {
  
  /**
    * @default {[]}
    */
  var activeContacts: js.Array[Contact] = js.native
  
  var bodyA: Body = js.native
  
  var bodyB: Body = js.native
  
  var collision: Collision = js.native
  
  var confirmedActive: Boolean = js.native
  
  /**
    * @default {[]}
    */
  var contacts: js.Array[Contact] = js.native
  
  var friction: Double = js.native
  
  var frictionStatic: Double = js.native
  
  var id: String = js.native
  
  var inverseMass: Double = js.native
  
  var isActive: Boolean = js.native
  
  var isSensor: Boolean = js.native
  
  var restitution: Double = js.native
  
  var separation: Double = js.native
  
  var slop: Double = js.native
  
  var timeCreated: Double = js.native
  
  var timeUpdated: Double = js.native
}
/* static members */
object Pair {
  
  @JSImport("matter-js", "Pair")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a pair.
    * @method create
    * @param {Collision} collision
    * @param {number} timestamp
    * @returns {Pair} A new pair
    */
  inline def create(collision: Collision, timestamp: Double): Pair = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(collision.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Pair]
  
  /**
    * Get the id for the given pair.
    * @method id
    * @param {Body} bodyA
    * @param {Body} bodyB
    * @returns {string} Unique pairId
    */
  inline def id(bodyA: Body, bodyB: Body): String = (^.asInstanceOf[js.Dynamic].applyDynamic("id")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Set a pair as active or inactive.
    * @method setActive
    * @param {Pair} pair
    * @param {boolean} isActive
    * @param {number} timestamp
    */
  inline def setActive(pair: Pair, isActive: Boolean, timestamp: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setActive")(pair.asInstanceOf[js.Any], isActive.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Updates a pair given a collision.
    * @method update
    * @param {Pair} pair
    * @param {Collision} collision
    * @param {number} timestamp
    */
  inline def update(pair: Pair, collision: Collision, timestamp: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(pair.asInstanceOf[js.Any], collision.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
