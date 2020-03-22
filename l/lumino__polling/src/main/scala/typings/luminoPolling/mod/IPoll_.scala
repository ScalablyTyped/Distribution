package typings.luminoPolling.mod

import typings.luminoPolling.mod.IPoll.Frequency
import typings.luminoPolling.mod.IPoll.State
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPoll_[T, U, V /* <: String */] extends js.Object {
  /**
    * A signal emitted when the poll is disposed.
    */
  val disposed: ISignal[this.type, Unit]
  /**
    * The polling frequency data.
    */
  val frequency: Frequency
  /**
    * Whether the poll is disposed.
    */
  val isDisposed: Boolean
  /**
    * The name of the poll.
    */
  val name: String
  /**
    * The poll state, which is the content of the currently-scheduled poll tick.
    */
  val state: State[T, U, V]
  /**
    * A promise that resolves when the currently-scheduled tick completes.
    *
    * #### Notes
    * Usually this will resolve after `state.interval` milliseconds from
    * `state.timestamp`. It can resolve earlier if the user starts or refreshes the
    * poll, etc.
    */
  val tick: js.Promise[IPoll[T, U, V]]
  /**
    * A signal emitted when the poll state changes, i.e., a new tick is scheduled.
    */
  val ticked: ISignal[IPoll[T, U, V], State[T, U, V]]
}

object IPoll_ {
  @scala.inline
  def apply[T, U, V /* <: String */](
    disposed: ISignal[IPoll_[T, U, V], Unit],
    frequency: Frequency,
    isDisposed: Boolean,
    name: String,
    state: State[T, U, V],
    tick: js.Promise[IPoll[T, U, V]],
    ticked: ISignal[IPoll[T, U, V], State[T, U, V]]
  ): IPoll_[T, U, V] = {
    val __obj = js.Dynamic.literal(disposed = disposed.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any], ticked = ticked.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPoll_[T, U, V]]
  }
}

