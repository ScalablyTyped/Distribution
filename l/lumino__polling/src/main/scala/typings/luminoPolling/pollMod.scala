package typings.luminoPolling

import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoPolling.anon.Cancel
import typings.luminoPolling.anon.PartialFrequency
import typings.luminoPolling.mod.IPoll
import typings.luminoPolling.mod.IPoll.State
import typings.luminoPolling.pollMod.Poll.IOptions
import typings.luminoPolling.pollMod.Poll.Standby
import typings.luminoSignaling.mod.ISignal
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pollMod {
  
  @JSImport("@lumino/polling/types/poll", "Poll")
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
    val tick_Poll: js.Promise[this.type] = js.native
    
    /**
      * A signal emitted when the poll ticks and fires off a new request.
      */
    @JSName("ticked")
    val ticked_Poll: ISignal[this.type, State[T, U, V]] = js.native
  }
  object Poll {
    
    /**
      * An interval value that indicates the poll should tick immediately.
      */
    @JSImport("@lumino/polling/types/poll", "Poll.IMMEDIATE")
    @js.native
    val IMMEDIATE: /* 0 */ Double = js.native
    
    /**
      * Delays are 32-bit integers in many browsers so intervals need to be capped.
      *
      * #### Notes
      * https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout#Maximum_delay_value
      */
    @JSImport("@lumino/polling/types/poll", "Poll.MAX_INTERVAL")
    @js.native
    val MAX_INTERVAL: /* 2147483647 */ Double = js.native
    
    /**
      * An interval value that indicates the poll should never tick.
      */
    @JSImport("@lumino/polling/types/poll", "Poll.NEVER")
    @js.native
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
    trait IOptions[T, U, V /* <: String */] extends StObject {
      
      /**
        * Whether to begin polling automatically; defaults to `true`.
        */
      var auto: js.UndefOr[Boolean] = js.native
      
      /**
        * A factory function that is passed a poll tick and returns a poll promise.
        */
      def factory(state: State[T, U, V]): js.Promise[T] = js.native
      /**
        * A factory function that is passed a poll tick and returns a poll promise.
        */
      @JSName("factory")
      var factory_Original: Factory[T, U, V] = js.native
      
      /**
        * The polling frequency parameters.
        */
      var frequency: js.UndefOr[PartialFrequency] = js.native
      
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
    }
    
    /**
      * Indicates when the poll switches to standby.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoPolling.luminoPollingStrings.never
      - typings.luminoPolling.luminoPollingStrings.`when-hidden`
    */
    trait Standby extends StObject
    object Standby {
      
      @scala.inline
      def never: typings.luminoPolling.luminoPollingStrings.never = "never".asInstanceOf[typings.luminoPolling.luminoPollingStrings.never]
      
      @scala.inline
      def `when-hidden`: typings.luminoPolling.luminoPollingStrings.`when-hidden` = "when-hidden".asInstanceOf[typings.luminoPolling.luminoPollingStrings.`when-hidden`]
    }
  }
}
