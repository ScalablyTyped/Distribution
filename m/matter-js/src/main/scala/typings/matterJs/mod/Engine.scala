package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Engine")
@js.native
open class Engine () extends StObject {
  
  /**
    * Replaced by and now alias for `engine.grid`.
    *
    * @deprecated use `engine.grid`
    * @default a Matter.Grid instance
    */
  var broadphase: Grid = js.native
  
  /**
    * An integer `Number` that specifies the number of constraint iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    * The default value of `2` is usually very adequate.
    *
    * @default 2
    */
  var constraintIterations: Double = js.native
  
  /**
    * A `Matter.Detector` instance.
    *
    * @default {Matter.Detector} instance
    */
  var detector: Detector = js.native
  
  /**
    * A flag that specifies whether the engine should allow sleeping via the `Matter.Sleeping` module.
    * Sleeping can improve stability and performance, but often at the expense of accuracy.
    *
    * @default false
    */
  var enableSleeping: Boolean = js.native
  
  /**
    * A flag that specifies whether the engine is running or not.
    */
  var enabled: Boolean = js.native
  
  /**
    * The gravity to apply on all bodies in `engine.world`.
    *
    */
  var gravity: Gravity = js.native
  
  /**
    * A `Matter.Grid` instance.
    *
    * @deprecated replaced by `engine.detector`
    * @default a Matter.Grid instance
    */
  var grid: Grid = js.native
  
  /**
    * Collision pair set for this `Engine`.
    */
  var pairs: Any = js.native
  
  /**
    * An integer `Number` that specifies the number of position iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @default 6
    */
  var positionIterations: Double = js.native
  
  /**
    * An instance of a `Render` controller. The default value is a `Matter.Render` instance created by `Engine.create`.
    * One may also develop a custom renderer module based on `Matter.Render` and pass an instance of it to `Engine.create` via `options.render`.
    *
    * A minimal custom renderer object must define at least three functions: `create`, `clear` and `world` (see `Matter.Render`).
    * It is also possible to instead pass the _module_ reference via `options.render.controller` and `Engine.create` will instantiate one for you.
    *
    * @default a Matter.Render instance
    */
  var render: Render = js.native
  
  /**
    * An `Object` containing properties regarding the timing systems of the engine.
    *
    */
  var timing: IEngineTimingOptions = js.native
  
  /**
    * An integer `Number` that specifies the number of velocity iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @default 4
    */
  var velocityIterations: Double = js.native
  
  /**
    * A `World` composite object that will contain all simulated bodies and constraints.
    *
    * @default a Matter.World instance
    */
  var world: World = js.native
}
/* static members */
object Engine {
  
  @JSImport("matter-js", "Engine")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Clears the engine pairs and detector.
    * @method clear
    * @param {engine} engine
    */
  inline def clear(engine: Engine): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(engine.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Creates a new engine. The options parameter is an object that specifies any properties you wish to override the defaults.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {IEngineDefinition} [options]
    * @returns {Engine} engine
    */
  inline def create(): Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Engine]
  inline def create(options: IEngineDefinition): Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Engine]
  
  /**
    * Merges two engines by keeping the configuration of `engineA` but replacing the world with the one from `engineB`.
    * @method merge
    * @param {engine} engineA
    * @param {engine} engineB
    */
  inline def merge(engineA: Engine, engineB: Engine): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(engineA.asInstanceOf[js.Any], engineB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * A deprecated alias for `Runner.run`, use `Matter.Runner.run(engine)` instead and see `Matter.Runner` for more information.
    * @deprecated use Matter.Runner.run(engine) instead
    * @method run
    * @param {engine} engine
    */
  inline def run(enige: Engine): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(enige.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  inline def update(engine: Engine): Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(engine.asInstanceOf[js.Any]).asInstanceOf[Engine]
  inline def update(engine: Engine, delta: Double): Engine = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(engine.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Engine]
  inline def update(engine: Engine, delta: Double, correction: Double): Engine = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(engine.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], correction.asInstanceOf[js.Any])).asInstanceOf[Engine]
  inline def update(engine: Engine, delta: Unit, correction: Double): Engine = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(engine.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], correction.asInstanceOf[js.Any])).asInstanceOf[Engine]
}
