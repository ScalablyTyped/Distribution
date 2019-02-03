package typings
package matterDashJsLib.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "Runner")
@js.native
class Runner ()
  extends matterDashJsLib.matterDashJsMod.MatterNs.Runner {
  /**
    * A `Number` that specifies the time step between updates in milliseconds.
    * If `engine.timing.isFixed` is set to `true`, then `delta` is fixed.
    * If it is `false`, then `delta` can dynamically change to maintain the correct apparent simulation speed.
    *
    * @property delta
    * @type number
    * @default 1000 / 60
    */
  /* CompleteClass */
  override var delta: scala.Double = js.native
  /**
    * A flag that specifies whether the runner is running or not.
    *
    * @property enabled
    * @type boolean
    * @default true
    */
  /* CompleteClass */
  override var enabled: scala.Boolean = js.native
  /**
    * A `Boolean` that specifies if the runner should use a fixed timestep (otherwise it is variable).
    * If timing is fixed, then the apparent simulation speed will change depending on the frame rate (but behaviour will be deterministic).
    * If the timing is variable, then the apparent simulation speed will be constant (approximately, but at the cost of determininism).
    *
    * @property isFixed
    * @type boolean
    * @default false
    */
  /* CompleteClass */
  override var isFixed: scala.Boolean = js.native
}

/* static members */
@JSImport("matter-js", "Runner")
@js.native
object Runner extends js.Object {
  /**
    * Creates a new Runner. The options parameter is an object that specifies any properties you wish to override the defaults.
    * @method create
    * @param {} options
    */
  def create(options: matterDashJsLib.matterDashJsMod.MatterNs.IRunnerOptions): matterDashJsLib.matterDashJsMod.MatterNs.Runner = js.native
  /**
    * Continuously ticks a `Matter.Engine` by calling `Runner.tick` on the `requestAnimationFrame` event.
    * @method run
    * @param {engine} engine
    */
  def run(engine: matterDashJsLib.matterDashJsMod.MatterNs.Engine): matterDashJsLib.matterDashJsMod.MatterNs.Runner = js.native
  /**
    * Continuously ticks a `Matter.Engine` by calling `Runner.tick` on the `requestAnimationFrame` event.
    * @method run
    * @param {engine} engine
    */
  def run(
    runner: matterDashJsLib.matterDashJsMod.MatterNs.Runner,
    engine: matterDashJsLib.matterDashJsMod.MatterNs.Engine
  ): matterDashJsLib.matterDashJsMod.MatterNs.Runner = js.native
  /**
    * Alias for `Runner.run`.
    * @method start
    * @param {runner} runner
    * @param {engine} engine
    */
  def start(
    runner: matterDashJsLib.matterDashJsMod.MatterNs.Runner,
    engine: matterDashJsLib.matterDashJsMod.MatterNs.Engine
  ): scala.Unit = js.native
  /**
    * Ends execution of `Runner.run` on the given `runner`, by canceling the animation frame request event loop.
    * If you wish to only temporarily pause the engine, see `engine.enabled` instead.
    * @method stop
    * @param {runner} runner
    */
  def stop(runner: matterDashJsLib.matterDashJsMod.MatterNs.Runner): scala.Unit = js.native
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
  def tick(
    runner: matterDashJsLib.matterDashJsMod.MatterNs.Runner,
    engine: matterDashJsLib.matterDashJsMod.MatterNs.Engine,
    time: scala.Double
  ): scala.Unit = js.native
}

