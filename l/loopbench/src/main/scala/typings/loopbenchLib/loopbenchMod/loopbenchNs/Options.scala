package typings
package loopbenchLib.loopbenchMod.loopbenchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The maximum amount of delay that is tolerated before `overLimit` becomes true,
    * and the `load` event is emitted, defaults to `42`.
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * The interval at which the eventLoop should be sampled, defaults to `5`.
    */
  var sampleInterval: js.UndefOr[scala.Double] = js.undefined
}

