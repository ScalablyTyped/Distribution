package typings.luminoPolling.pollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Poll {
  /**
    * A promise factory that returns an individual poll request.
    *
    * @typeparam T - The resolved type of the factory's promises.
    *
    * @typeparam U - The rejected type of the factory's promises.
    *
    * @typeparam V - The type to extend the phases supported by a poll.
    */
  type Factory[T, U, V /* <: java.lang.String */] = js.Function1[/* state */ typings.luminoPolling.mod.IPoll.State[T, U, V], js.Promise[T]]
}
