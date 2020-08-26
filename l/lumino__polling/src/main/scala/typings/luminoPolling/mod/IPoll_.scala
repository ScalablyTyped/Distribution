package typings.luminoPolling.mod

import typings.luminoPolling.mod.IPoll.Frequency
import typings.luminoPolling.mod.IPoll.State
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPoll_[T, U, V /* <: String */] extends js.Object {
  /**
    * A signal emitted when the poll is disposed.
    */
  val disposed: ISignal[this.type, Unit] = js.native
  /**
    * The polling frequency data.
    */
  val frequency: Frequency = js.native
  /**
    * Whether the poll is disposed.
    */
  val isDisposed: Boolean = js.native
  /**
    * The name of the poll.
    */
  val name: String = js.native
  /**
    * The poll state, which is the content of the currently-scheduled poll tick.
    */
  val state: State[T, U, V] = js.native
  /**
    * A promise that resolves when the currently-scheduled tick completes.
    *
    * #### Notes
    * Usually this will resolve after `state.interval` milliseconds from
    * `state.timestamp`. It can resolve earlier if the user starts or refreshes the
    * poll, etc.
    */
  val tick: js.Promise[IPoll[T, U, V]] = js.native
  /**
    * A signal emitted when the poll state changes, i.e., a new tick is scheduled.
    */
  val ticked: ISignal[IPoll[T, U, V], State[T, U, V]] = js.native
}

object IPoll_ {
  @scala.inline
  def apply[T, U, /* <: java.lang.String */ V](
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
  @scala.inline
  implicit class IPoll_Ops[Self <: IPoll_[_, _, _], T, U, /* <: java.lang.String */ V] (val x: Self with (IPoll_[T, U, V])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisposed(value: ISignal[IPoll_[T, U, V], Unit]): Self = this.set("disposed", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrequency(value: Frequency): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDisposed(value: Boolean): Self = this.set("isDisposed", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: State[T, U, V]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTick(value: js.Promise[IPoll[T, U, V]]): Self = this.set("tick", value.asInstanceOf[js.Any])
    @scala.inline
    def setTicked(value: ISignal[IPoll[T, U, V], State[T, U, V]]): Self = this.set("ticked", value.asInstanceOf[js.Any])
  }
  
}

