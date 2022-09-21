package typings.matterJs.global.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Pairs")
@js.native
open class Pairs ()
  extends typings.matterJs.mod.Pairs
/* static members */
object Pairs {
  
  @JSGlobal("Matter.Pairs")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Clears the given pairs structure.
    * @method clear
    * @param {Pairs} pairs
    * @returns {Pairs} pairs
    */
  inline def clear(pairs: typings.matterJs.mod.Pairs): typings.matterJs.mod.Pairs = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(pairs.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Pairs]
  
  /**
    * Creates a new pairs structure.
    * @method create
    * @param {any} options
    * @returns {Pairs} A new pairs structure
    */
  inline def create(options: Any): typings.matterJs.mod.Pairs = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Pairs]
  
  /**
    * Updates pairs given a list of collisions.
    * @method update
    * @param {Pairs} pairs
    * @param {Collision[]} collisions
    * @param {number} timestamp
    */
  inline def update(
    pairs: typings.matterJs.mod.Pairs,
    collisions: js.Array[typings.matterJs.mod.Collision],
    timestamp: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(pairs.asInstanceOf[js.Any], collisions.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
