package typings.atJupyterlabCoreutils.atJupyterlabCoreutilsMod

import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsNumbers.`0`
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsNumbers.`2147483647`
import typings.atJupyterlabCoreutils.libPollMod.Poll.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "Poll")
@js.native
class Poll[T, U, V /* <: String */] protected ()
  extends typings.atJupyterlabCoreutils.libPollMod.Poll[T, U, V] {
  /**
    * Instantiate a new poll with exponential backoff in case of failure.
    *
    * @param options - The poll instantiation options.
    */
  def this(options: IOptions[T, U, V]) = this()
}

@JSImport("@jupyterlab/coreutils", "Poll")
@js.native
object Poll extends js.Object {
  /**
    * An interval value that indicates the poll should tick immediately.
    */
  val IMMEDIATE: `0` = js.native
  /**
    * Delays are 32-bit integers in many browsers so intervals need to be capped.
    *
    * #### Notes
    * https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout#Maximum_delay_value
    */
  val MAX_INTERVAL: `2147483647` = js.native
  /**
    * An interval value that indicates the poll should never tick.
    */
  val NEVER: Double = js.native
}

