package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IEngineTimingOptions extends js.Object {
  /**
           * A `Number` that specifies the global scaling factor of time for all bodies.
           * A value of `0` freezes the simulation.
           * A value of `0.1` gives a slow-motion effect.
           * A value of `1.2` gives a speed-up effect.
           *
          * @property timing.timeScale
          * @type number
          * @default 1
          */
  var timeScale: scala.Double
  /**
           * A `Number` that specifies the current simulation-time in milliseconds starting from `0`.
           * It is incremented on every `Engine.update` by the given `delta` argument.
           *
          * @property timing.timestamp
          * @type number
          * @default 0
          */
  var timestamp: scala.Double
}

