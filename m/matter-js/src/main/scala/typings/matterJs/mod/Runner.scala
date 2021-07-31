package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Runner")
@js.native
class Runner () extends StObject {
  
  /**
    * A `Number` that specifies the time step between updates in milliseconds.
    * If `engine.timing.isFixed` is set to `true`, then `delta` is fixed.
    * If it is `false`, then `delta` can dynamically change to maintain the correct apparent simulation speed.
    *
    * @property delta
    * @type number
    * @default 1000 / 60
    */
  var delta: Double = js.native
  
  /**
    * A flag that specifies whether the runner is running or not.
    *
    * @property enabled
    * @type boolean
    * @default true
    */
  var enabled: Boolean = js.native
  
  /**
    * A `Boolean` that specifies if the runner should use a fixed timestep (otherwise it is variable).
    * If timing is fixed, then the apparent simulation speed will change depending on the frame rate (but behaviour will be deterministic).
    * If the timing is variable, then the apparent simulation speed will be constant (approximately, but at the cost of determininism).
    *
    * @property isFixed
    * @type boolean
    * @default false
    */
  var isFixed: Boolean = js.native
}
/* static members */
object Runner {
  
  @JSImport("matter-js", "Runner")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Runner. The options parameter is an object that specifies any properties you wish to override the defaults.
    * @method create
    * @param {} options
    */
  @scala.inline
  def create(): Runner = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Runner]
  @scala.inline
  def create(options: IRunnerOptions): Runner = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Runner]
  
  /**
    * Continuously ticks a `Matter.Engine` by calling `Runner.tick` on the `requestAnimationFrame` event.
    * @method run
    * @param {engine} engine
    */
  @scala.inline
  def run(engine: Engine): Runner = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(engine.asInstanceOf[js.Any]).asInstanceOf[Runner]
  /**
    * Continuously ticks a `Matter.Engine` by calling `Runner.tick` on the `requestAnimationFrame` event.
    * @method run
    * @param {engine} engine
    */
  @scala.inline
  def run(runner: Runner, engine: Engine): Runner = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(runner.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[Runner]
  
  /**
    * Alias for `Runner.run`.
    * @method start
    * @param {runner} runner
    * @param {engine} engine
    */
  @scala.inline
  def start(runner: Runner, engine: Engine): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(runner.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Ends execution of `Runner.run` on the given `runner`, by canceling the animation frame request event loop.
    * If you wish to only temporarily pause the engine, see `engine.enabled` instead.
    * @method stop
    * @param {runner} runner
    */
  @scala.inline
  def stop(runner: Runner): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(runner.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * A game loop utility that updates the engine and renderer by one step (a 'tick').
    * Features delta smoothing, time correction and fixed or dynamic timing.
    * Triggers `beforeTick`, `tick` and `afterTick` events on the engine.
    * Consider just `Engine.update(engine, delta)` if you're using your own loop.
    * @method tick
    * @param {runner} runner
    * @param {engine} engine
    * @param {number} time
    */
  @scala.inline
  def tick(runner: Runner, engine: Engine, time: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tick")(runner.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
