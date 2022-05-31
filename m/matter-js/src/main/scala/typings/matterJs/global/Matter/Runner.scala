package typings.matterJs.global.Matter

import typings.matterJs.mod.IRunnerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Runner")
@js.native
class Runner ()
  extends typings.matterJs.mod.Runner
/* static members */
object Runner {
  
  @JSGlobal("Matter.Runner")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Runner. The options parameter is an object that specifies any properties you wish to override the defaults.
    * @method create
    * @param {} options
    */
  inline def create(): typings.matterJs.mod.Runner = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.matterJs.mod.Runner]
  inline def create(options: IRunnerOptions): typings.matterJs.mod.Runner = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Runner]
  
  /**
    * Continuously ticks a `Matter.Engine` by calling `Runner.tick` on the `requestAnimationFrame` event.
    * @method run
    * @param {engine} engine
    */
  inline def run(engine: typings.matterJs.mod.Engine): typings.matterJs.mod.Runner = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(engine.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Runner]
  /**
    * Continuously ticks a `Matter.Engine` by calling `Runner.tick` on the `requestAnimationFrame` event.
    * @method run
    * @param {engine} engine
    */
  inline def run(runner: typings.matterJs.mod.Runner, engine: typings.matterJs.mod.Engine): typings.matterJs.mod.Runner = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(runner.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Runner]
  
  /**
    * Alias for `Runner.run`.
    * @method start
    * @param {runner} runner
    * @param {engine} engine
    */
  inline def start(runner: typings.matterJs.mod.Runner, engine: typings.matterJs.mod.Engine): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(runner.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Ends execution of `Runner.run` on the given `runner`, by canceling the animation frame request event loop.
    * If you wish to only temporarily pause the engine, see `engine.enabled` instead.
    * @method stop
    * @param {runner} runner
    */
  inline def stop(runner: typings.matterJs.mod.Runner): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(runner.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  inline def tick(runner: typings.matterJs.mod.Runner, engine: typings.matterJs.mod.Engine, time: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tick")(runner.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
