package typings.atJupyterlabCoreutils.libPollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Poll {
  import typings.atJupyterlabCoreutils.libInterfacesMod.IPoll.State

  /**
    * A promise factory that returns an individual poll request.
    *
    * @typeparam T - The resolved type of the factory's promises.
    *
    * @typeparam U - The rejected type of the factory's promises.
    *
    * @typeparam V - The type to extend the phases supported by a poll.
    */
  type Factory[T, U, V /* <: String */] = js.Function1[/* state */ State[T, U, V], js.Promise[T]]
}
