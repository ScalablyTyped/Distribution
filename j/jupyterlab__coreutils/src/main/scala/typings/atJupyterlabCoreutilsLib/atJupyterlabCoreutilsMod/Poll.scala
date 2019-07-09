package typings
package atJupyterlabCoreutilsLib.atJupyterlabCoreutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "Poll")
@js.native
class Poll[T, U, V /* <: java.lang.String */] protected ()
  extends atJupyterlabCoreutilsLib.libPollMod.Poll[T, U, V] {
  /**
    * Instantiate a new poll with exponential backoff in case of failure.
    *
    * @param options - The poll instantiation options.
    */
  def this(options: atJupyterlabCoreutilsLib.libPollMod.PollNs.IOptions[T, U, V]) = this()
}

