package typings.matterDashJs.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEngineDefinition extends js.Object {
  /**
    * An integer `Number` that specifies the number of constraint iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    * The default value of `2` is usually very adequate.
    *
    * @property constraintIterations
    * @type number
    * @default 2
    */
  var constraintIterations: js.UndefOr[Double] = js.undefined
  /**
    * A flag that specifies whether the engine should allow sleeping via the `Matter.Sleeping` module.
    * Sleeping can improve stability and performance, but often at the expense of accuracy.
    *
    * @property enableSleeping
    * @type boolean
    * @default false
    */
  var enableSleeping: js.UndefOr[Boolean] = js.undefined
  /**
    * An instance of a broadphase controller. The default value is a `Matter.Grid` instance created by `Engine.create`.
    *
    * @property broadphase
    * @type grid
    * @default a Matter.Grid instance
    */
  var grid: js.UndefOr[Grid] = js.undefined
  /**
    * An integer `Number` that specifies the number of position iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @property positionIterations
    * @type number
    * @default 6
    */
  var positionIterations: js.UndefOr[Double] = js.undefined
  /**
    * An `Object` containing properties regarding the timing systems of the engine.
    *
    * @property timing
    * @type object
    */
  var timing: js.UndefOr[IEngineTimingOptions] = js.undefined
  /**
    * An integer `Number` that specifies the number of velocity iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @property velocityIterations
    * @type number
    * @default 4
    */
  var velocityIterations: js.UndefOr[Double] = js.undefined
  /**
    * A `World` composite object that will contain all simulated bodies and constraints.
    *
    * @property world
    * @type world
    * @default a Matter.World instance
    */
  var world: js.UndefOr[World] = js.undefined
}

object IEngineDefinition {
  @scala.inline
  def apply(
    constraintIterations: Int | Double = null,
    enableSleeping: js.UndefOr[Boolean] = js.undefined,
    grid: Grid = null,
    positionIterations: Int | Double = null,
    timing: IEngineTimingOptions = null,
    velocityIterations: Int | Double = null,
    world: World = null
  ): IEngineDefinition = {
    val __obj = js.Dynamic.literal()
    if (constraintIterations != null) __obj.updateDynamic("constraintIterations")(constraintIterations.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSleeping)) __obj.updateDynamic("enableSleeping")(enableSleeping)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (positionIterations != null) __obj.updateDynamic("positionIterations")(positionIterations.asInstanceOf[js.Any])
    if (timing != null) __obj.updateDynamic("timing")(timing)
    if (velocityIterations != null) __obj.updateDynamic("velocityIterations")(velocityIterations.asInstanceOf[js.Any])
    if (world != null) __obj.updateDynamic("world")(world)
    __obj.asInstanceOf[IEngineDefinition]
  }
}

