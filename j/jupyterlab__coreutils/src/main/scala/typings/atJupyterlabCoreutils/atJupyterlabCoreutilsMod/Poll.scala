package typings.atJupyterlabCoreutils.atJupyterlabCoreutilsMod

import typings.atJupyterlabCoreutils.libPollMod.PollNs.IOptions
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

