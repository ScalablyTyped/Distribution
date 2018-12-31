package typings
package gulpLib.gulpMod.GulpClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions
  extends chokidarLib.chokidarMod.WatchOptions {
  /**
    * The delay to wait before triggering the fn.
    * Useful for waiting on many changes before doing the work on changed files, e.g. find-and-replace on many files.
    * @default 200
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether or not a file change should queue the fn execution if the fn is already running. Useful for a long running fn.
    * @default true
    */
  var queue: js.UndefOr[scala.Boolean] = js.undefined
}

