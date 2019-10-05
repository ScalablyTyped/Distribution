package typings.atJupyterlabCoreutils.libInterfacesMod

import typings.atJupyterlabCoreutils.libInterfacesMod.IPoll.Frequency
import typings.atJupyterlabCoreutils.libInterfacesMod.IPoll.State
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("IPoll")
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
    val __obj = js.Dynamic.literal(disposed = disposed, frequency = frequency, isDisposed = isDisposed, name = name, state = state, tick = tick, ticked = ticked)
  
    __obj.asInstanceOf[IPoll_[T, U, V]]
  }
}

