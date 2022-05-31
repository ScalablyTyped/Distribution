package typings.matterJs.global.Matter

import typings.matterJs.mod.IEngineDefinition
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Engine")
@js.native
class Engine ()
  extends typings.matterJs.mod.Engine
/* static members */
object Engine {
  
  @JSGlobal("Matter.Engine")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Clears the engine including the world, pairs and broadphase.
    * @method clear
    * @param {engine} engine
    */
  inline def clear(engine: typings.matterJs.mod.Engine): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(engine.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Creates a new engine. The options parameter is an object that specifies any properties you wish to override the defaults.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {HTMLElement} element
    * @param {object} [options]
    * @return {engine} engine
    * @deprecated
    */
  /**
    * Creates a new engine. The options parameter is an object that specifies any properties you wish to override the defaults.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {object} [options]
    * @return {engine} engine
    * @deprecated
    */
  inline def create(): typings.matterJs.mod.Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.matterJs.mod.Engine]
  inline def create(element: Unit, options: IEngineDefinition): typings.matterJs.mod.Engine = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Engine]
  inline def create(element: IEngineDefinition): typings.matterJs.mod.Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Engine]
  inline def create(element: IEngineDefinition, options: IEngineDefinition): typings.matterJs.mod.Engine = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Engine]
  inline def create(element: HTMLElement): typings.matterJs.mod.Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Engine]
  inline def create(element: HTMLElement, options: IEngineDefinition): typings.matterJs.mod.Engine = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Engine]
  
  /**
    * Merges two engines by keeping the configuration of `engineA` but replacing the world with the one from `engineB`.
    * @method merge
    * @param {engine} engineA
    * @param {engine} engineB
    */
  inline def merge(engineA: typings.matterJs.mod.Engine, engineB: typings.matterJs.mod.Engine): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(engineA.asInstanceOf[js.Any], engineB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * An alias for `Runner.run`, see `Matter.Runner` for more information.
    * @method run
    * @param {engine} engine
    */
  inline def run(enige: typings.matterJs.mod.Engine): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(enige.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Moves the simulation forward in time by `delta` ms.
    * The `correction` argument is an optional `Number` that specifies the time correction factor to apply to the update.
    * This can help improve the accuracy of the simulation in cases where `delta` is changing between updates.
    * The value of `correction` is defined as `delta / lastDelta`, i.e. the percentage change of `delta` over the last step.
    * Therefore the value is always `1` (no correction) when `delta` constant (or when no correction is desired, which is the default).
    * See the paper on <a href="http://lonesock.net/article/verlet.html">Time Corrected Verlet</a> for more information.
    *
    * Triggers `beforeUpdate` and `afterUpdate` events.
    * Triggers `collisionStart`, `collisionActive` and `collisionEnd` events.
    * @method update
    * @param {engine} engine
    * @param {number} [delta=16.666]
    * @param {number} [correction=1]
    */
  inline def update(engine: typings.matterJs.mod.Engine): typings.matterJs.mod.Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(engine.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Engine]
  inline def update(engine: typings.matterJs.mod.Engine, delta: Double): typings.matterJs.mod.Engine = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(engine.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Engine]
  inline def update(engine: typings.matterJs.mod.Engine, delta: Double, correction: Double): typings.matterJs.mod.Engine = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(engine.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], correction.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Engine]
  inline def update(engine: typings.matterJs.mod.Engine, delta: Unit, correction: Double): typings.matterJs.mod.Engine = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(engine.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], correction.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Engine]
}
