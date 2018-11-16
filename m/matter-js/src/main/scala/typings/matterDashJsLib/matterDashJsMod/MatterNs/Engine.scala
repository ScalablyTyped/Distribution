package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Engine extends js.Object {
  /**
           * An instance of a broadphase controller. The default value is a `Matter.Grid` instance created by `Engine.create`.
           *
          * @property broadphase
          * @type grid
          * @default a Matter.Grid instance
          */
  var broadphase: Grid
  /**
           * An integer `Number` that specifies the number of constraint iterations to perform each update.
           * The higher the value, the higher quality the simulation will be at the expense of performance.
           * The default value of `2` is usually very adequate.
           *
          * @property constraintIterations
          * @type number
          * @default 2
          */
  var constraintIterations: scala.Double
  /**
           * A flag that specifies whether the engine should allow sleeping via the `Matter.Sleeping` module.
           * Sleeping can improve stability and performance, but often at the expense of accuracy.
           *
          * @property enableSleeping
          * @type boolean
          * @default false
          */
  var enableSleeping: scala.Boolean
  /**
           * A flag that specifies whether the engine is running or not.
           */
  var enabled: scala.Boolean
  /**
           * Collision pair set for this `Engine`.
           */
  var pairs: js.Any
  /**
           * An integer `Number` that specifies the number of position iterations to perform each update.
           * The higher the value, the higher quality the simulation will be at the expense of performance.
           *
          * @property positionIterations
          * @type number
          * @default 6
          */
  var positionIterations: scala.Double
  /**
           * An instance of a `Render` controller. The default value is a `Matter.Render` instance created by `Engine.create`.
           * One may also develop a custom renderer module based on `Matter.Render` and pass an instance of it to `Engine.create` via `options.render`.
           *
          * A minimal custom renderer object must define at least three functions: `create`, `clear` and `world` (see `Matter.Render`).
          * It is also possible to instead pass the _module_ reference via `options.render.controller` and `Engine.create` will instantiate one for you.
          *
          * @property render
          * @type render
          * @default a Matter.Render instance
          */
  var render: Render
  /**
           * An `Object` containing properties regarding the timing systems of the engine.
           *
          * @property timing
          * @type object
          */
  var timing: IEngineTimingOptions
  /**
           * An integer `Number` that specifies the number of velocity iterations to perform each update.
           * The higher the value, the higher quality the simulation will be at the expense of performance.
           *
          * @property velocityIterations
          * @type number
          * @default 4
          */
  var velocityIterations: scala.Double
  /**
           * A `World` composite object that will contain all simulated bodies and constraints.
           *
          * @property world
          * @type world
          * @default a Matter.World instance
          */
  var world: World
}

