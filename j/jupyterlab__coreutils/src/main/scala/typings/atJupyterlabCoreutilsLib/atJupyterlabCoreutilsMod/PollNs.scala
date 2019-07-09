package typings
package atJupyterlabCoreutilsLib.atJupyterlabCoreutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "Poll")
@js.native
object PollNs extends js.Object {
  /**
    * An interval value that indicates the poll should tick immediately.
    */
  val IMMEDIATE: atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibNumbers.`0` = js.native
  /**
    * Delays are 32-bit integers in many browsers so intervals need to be capped.
    *
    * #### Notes
    * https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout#Maximum_delay_value
    */
  val MAX_INTERVAL: atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibNumbers.`2147483647` = js.native
  /**
    * An interval value that indicates the poll should never tick.
    */
  val NEVER: scala.Double = js.native
}

