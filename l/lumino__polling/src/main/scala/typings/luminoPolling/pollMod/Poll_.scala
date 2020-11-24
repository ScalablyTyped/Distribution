package typings.luminoPolling.pollMod

import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoPolling.anon.Cancel
import typings.luminoPolling.mod.IPoll
import typings.luminoPolling.mod.IPoll.State
import typings.luminoPolling.pollMod.Poll.IOptions
import typings.luminoPolling.pollMod.Poll.Standby
import typings.luminoSignaling.mod.ISignal
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/polling/types/poll", "Poll")
@js.native
class Poll_[T, U, V /* <: String */] protected ()
  extends IObservableDisposable
     with IPoll[T, U, V] {
  /**
    * Instantiate a new poll with exponential backoff in case of failure.
    *
    * @param options - The poll instantiation options.
    */
  def this(options: IOptions[T, U, V]) = this()
  
  var _disposed: js.Any = js.native
  
  /**
    * Execute a new poll factory promise or stand by if necessary.
    */
  var _execute: js.Any = js.native
  
  var _factory: js.Any = js.native
  
  var _frequency: js.Any = js.native
  
  var _standby: js.Any = js.native
  
  var _state: js.Any = js.native
  
  var _tick: js.Any = js.native
  
  var _ticked: js.Any = js.native
  
  var _timeout: js.Any = js.native
  
  /**
    * A signal emitted when the poll is disposed.
    */
  /* InferMemberOverrides */
  override val disposed: ISignal[this.type, Unit] = js.native
  
  /**
    * Whether the poll is disposed.
    */
  /* InferMemberOverrides */
  override val isDisposed: Boolean = js.native
  
  /**
    * Refreshes the poll. Schedules `refreshed` tick if necessary.
    *
    * @returns A promise that resolves after tick is scheduled and never rejects.
    *
    * #### Notes
    * The returned promise resolves after the tick is scheduled, but before
    * the polling action is run. To wait until after the poll action executes,
    * await the `poll.tick` promise: `await poll.refresh(); await poll.tick;`
    */
  def refresh(): js.Promise[Unit] = js.native
  
  /**
    * Schedule the next poll tick.
    *
    * @param next - The next poll state data to schedule. Defaults to standby.
    *
    * @param next.cancel - Cancels state transition if function returns `true`.
    *
    * @returns A promise that resolves when the next poll state is active.
    *
    * #### Notes
    * This method is not meant to be invoked by user code typically. It is public
    * to allow poll instances to be composed into classes that schedule ticks.
    */
  def schedule(): js.Promise[Unit] = js.native
  def schedule(next: Partial[(State[T, U, V]) with (Cancel[T, U, V])]): js.Promise[Unit] = js.native
  
  /**
    * Indicates when the poll switches to standby.
    */
  var standby: Standby | (js.Function0[Boolean | Standby]) = js.native
  
  /**
    * Starts the poll. Schedules `started` tick if necessary.
    *
    * @returns A promise that resolves after tick is scheduled and never rejects.
    */
  def start(): js.Promise[Unit] = js.native
  
  /**
    * Stops the poll. Schedules `stopped` tick if necessary.
    *
    * @returns A promise that resolves after tick is scheduled and never rejects.
    */
  def stop(): js.Promise[Unit] = js.native
  
  /**
    * A promise that resolves when the poll next ticks.
    */
  @JSName("tick")
  val tick_Poll_ : js.Promise[this.type] = js.native
  
  /**
    * A signal emitted when the poll ticks and fires off a new request.
    */
  @JSName("ticked")
  val ticked_Poll_ : ISignal[this.type, State[T, U, V]] = js.native
}
