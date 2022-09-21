package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Resolver")
@js.native
open class Resolver () extends StObject
/* static members */
object Resolver {
  
  @JSImport("matter-js", "Resolver")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Apply position resolution.
    * @method postSolvePosition
    * @param {Body[]} bodies
    */
  inline def postSolvePosition(bodies: js.Array[Body]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("postSolvePosition")(bodies.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Prepare pairs for position solving.
    * @method preSolvePosition
    * @param {Pair[]} pairs
    */
  inline def preSolvePosition(pairs: js.Array[Pair]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preSolvePosition")(pairs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Prepare pairs for velocity solving.
    * @method preSolveVelocity
    * @param {Pair[]} pairs
    */
  inline def preSolveVelocity(pairs: js.Array[Pair]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preSolveVelocity")(pairs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Find a solution for pair positions.
    * @method solvePosition
    * @param {Pair[]} pairs
    * @param {number} timeScale
    */
  inline def solvePosition(pairs: js.Array[Pair], timeScale: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePosition")(pairs.asInstanceOf[js.Any], timeScale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Find a solution for pair velocities.
    * @method solveVelocity
    * @param {Pair[]} pairs
    * @param {number} timeScale
    */
  inline def solveVelocity(pairs: js.Array[Pair], timeScale: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("solveVelocity")(pairs.asInstanceOf[js.Any], timeScale.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
