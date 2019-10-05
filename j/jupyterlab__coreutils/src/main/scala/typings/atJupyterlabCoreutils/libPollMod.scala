package typings.atJupyterlabCoreutils

import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsNumbers.`0`
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsNumbers.`2147483647`
import typings.atJupyterlabCoreutils.libInterfacesMod.IPoll
import typings.atJupyterlabCoreutils.libInterfacesMod.IPoll.Frequency
import typings.atJupyterlabCoreutils.libInterfacesMod.IPoll.State
import typings.atJupyterlabCoreutils.libPollMod.Poll.Factory
import typings.atJupyterlabCoreutils.libPollMod.Poll.IOptions
import typings.atJupyterlabCoreutils.libPollMod.Poll.Standby
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IObservableDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/poll", JSImport.Namespace)
@js.native
object libPollMod extends js.Object {
  @js.native
  class Poll[T, U, V /* <: String */] protected ()
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
      * The polling frequency data.
      */
    /* CompleteClass */
    override val frequency: Frequency = js.native
    /**
      * Whether the poll is disposed.
      */
    /* InferMemberOverrides */
    override val isDisposed: Boolean = js.native
    /**
      * The name of the poll.
      */
    /* CompleteClass */
    override val name: String = js.native
    /**
      * Indicates when the poll switches to standby.
      */
    var standby: Standby | (js.Function0[Boolean | Standby]) = js.native
    /**
      * The poll state, which is the content of the currently-scheduled poll tick.
      */
    /* CompleteClass */
    override val state: State[T, U, V] = js.native
    /**
      * A promise that resolves when the currently-scheduled tick completes.
      *
      * #### Notes
      * Usually this will resolve after `state.interval` milliseconds from
      * `state.timestamp`. It can resolve earlier if the user starts or refreshes the
      * poll, etc.
      */
    /* CompleteClass */
    override val tick: js.Promise[IPoll[T, U, V]] = js.native
    /**
      * A promise that resolves when the poll next ticks.
      */
    @JSName("tick")
    val tick_Poll: js.Promise[this.type] = js.native
    /**
      * A signal emitted when the poll state changes, i.e., a new tick is scheduled.
      */
    /* CompleteClass */
    override val ticked: ISignal[IPoll[T, U, V], State[T, U, V]] = js.native
    /**
      * A signal emitted when the poll ticks and fires off a new request.
      */
    @JSName("ticked")
    val ticked_Poll: ISignal[this.type, State[T, U, V]] = js.native
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
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
    def schedule(next: Partial[(State[T, U, V]) with (Anon_Cancel[T, U, V])]): js.Promise[Unit] = js.native
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
  }
  
  @js.native
  object Poll extends js.Object {
    /**
      * Instantiation options for polls.
      *
      * @typeparam T - The resolved type of the factory's promises.
      *
      * @typeparam U - The rejected type of the factory's promises.
      *
      * @typeparam V - The type to extend the phases supported by a poll.
      */
    @js.native
    trait IOptions[T, U, V /* <: String */] extends js.Object {
      /**
        * Whether to begin polling automatically; defaults to `true`.
        */
      var auto: js.UndefOr[Boolean] = js.native
      /**
        * A factory function that is passed a poll tick and returns a poll promise.
        */
      @JSName("factory")
      var factory_Original: Factory[T, U, V] = js.native
      /**
        * The polling frequency parameters.
        */
      var frequency: js.UndefOr[Partial[Frequency]] = js.native
      /**
        * The name of the poll.
        * Defaults to `'unknown'`.
        */
      var name: js.UndefOr[String] = js.native
      /**
        * Indicates when the poll switches to standby or a function that returns
        * a boolean or a `Poll.Standby` value to indicate whether to stand by.
        * Defaults to `'when-hidden'`.
        *
        * #### Notes
        * If a function is passed in, for any given context, it should be
        * idempotent and safe to call multiple times. It will be called before each
        * tick execution, but may be called by clients as well.
        */
      var standby: js.UndefOr[Standby | (js.Function0[Boolean | Standby])] = js.native
      /**
        * A factory function that is passed a poll tick and returns a poll promise.
        */
      def factory(state: State[T, U, V]): js.Promise[T] = js.native
    }
    
    /**
      * Indicates when the poll switches to standby.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.never
      - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.`when-hidden`
    */
    trait Standby extends js.Object
    
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
  
}

