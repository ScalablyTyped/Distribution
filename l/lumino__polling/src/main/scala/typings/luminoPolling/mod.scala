package typings.luminoPolling

import typings.luminoDisposable.mod.IDisposable
import typings.luminoPolling.mod.IPoll.Frequency
import typings.luminoPolling.mod.IPoll.State
import typings.luminoPolling.typesPollMod.Poll.IOptions
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/polling", "Debouncer")
  @js.native
  open class Debouncer[T, U, V /* <: js.Array[Any] */] protected ()
    extends typings.luminoPolling.typesRatelimiterMod.Debouncer[T, U, V] {
    /**
      * Instantiate a rate limiter.
      *
      * @param fn - The function to rate limit.
      *
      * @param limit - The rate limit; defaults to 500ms.
      */
    def this(fn: js.Function1[/* args */ V, T | js.Promise[T]]) = this()
    def this(fn: js.Function1[/* args */ V, T | js.Promise[T]], limit: Double) = this()
  }
  
  @JSImport("@lumino/polling", "Poll")
  @js.native
  open class Poll[T, U, V /* <: String */] protected ()
    extends typings.luminoPolling.typesPollMod.Poll[T, U, V] {
    /**
      * Instantiate a new poll with exponential backoff in case of failure.
      *
      * @param options - The poll instantiation options.
      */
    def this(options: IOptions[T, U, V]) = this()
  }
  object Poll {
    
    /**
      * An interval value that indicates the poll should tick immediately.
      */
    @JSImport("@lumino/polling", "Poll.IMMEDIATE")
    @js.native
    val IMMEDIATE: /* 0 */ Double = js.native
    
    /**
      * Delays are 32-bit integers in many browsers so intervals need to be capped.
      *
      * #### Notes
      * https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout#Maximum_delay_value
      */
    @JSImport("@lumino/polling", "Poll.MAX_INTERVAL")
    @js.native
    val MAX_INTERVAL: /* 2147483647 */ Double = js.native
    
    /**
      * An interval value that indicates the poll should never tick.
      */
    @JSImport("@lumino/polling", "Poll.NEVER")
    @js.native
    val NEVER: Double = js.native
  }
  
  /* note: abstract class */ @JSImport("@lumino/polling", "RateLimiter")
  @js.native
  open class RateLimiter[T, U, V /* <: js.Array[Any] */] protected ()
    extends typings.luminoPolling.typesRatelimiterMod.RateLimiter[T, U, V] {
    /**
      * Instantiate a rate limiter.
      *
      * @param fn - The function to rate limit.
      *
      * @param limit - The rate limit; defaults to 500ms.
      */
    def this(fn: js.Function1[/* args */ V, T | js.Promise[T]]) = this()
    def this(fn: js.Function1[/* args */ V, T | js.Promise[T]], limit: Double) = this()
  }
  
  @JSImport("@lumino/polling", "Throttler")
  @js.native
  open class Throttler[T, U, V /* <: js.Array[Any] */] protected ()
    extends typings.luminoPolling.typesRatelimiterMod.Throttler[T, U, V] {
    /**
      * Instantiate a throttler.
      *
      * @param fn - The function being throttled.
      *
      * @param options - Throttling configuration or throttling limit in ms.
      *
      * #### Notes
      * The `edge` defaults to `leading`; the `limit` defaults to `500`.
      */
    def this(fn: js.Function1[/* args */ V, T | js.Promise[T]]) = this()
    def this(fn: js.Function1[/* args */ V, T | js.Promise[T]], options: Double) = this()
    def this(
      fn: js.Function1[/* args */ V, T | js.Promise[T]],
      options: typings.luminoPolling.typesRatelimiterMod.Throttler.IOptions
    ) = this()
  }
  
  trait IPoll[T, U, V /* <: String */] extends StObject {
    
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
  object IPoll {
    
    inline def apply[T, U, V /* <: String */](
      disposed: ISignal[IPoll[T, U, V], Unit],
      frequency: Frequency,
      isDisposed: Boolean,
      name: String,
      state: State[T, U, V],
      tick: js.Promise[IPoll[T, U, V]],
      ticked: ISignal[IPoll[T, U, V], State[T, U, V]]
    ): IPoll[T, U, V] = {
      val __obj = js.Dynamic.literal(disposed = disposed.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any], ticked = ticked.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPoll[T, U, V]]
    }
    
    /**
      * The polling frequency parameters.
      *
      * #### Notes
      * We implement the "decorrelated jitter" strategy from
      * https://aws.amazon.com/blogs/architecture/exponential-backoff-and-jitter/.
      * Essentially, if consecutive retries are needed, we choose an integer:
      * `sleep = min(max, rand(interval, backoff * sleep))`
      * This ensures that the poll is never less than `interval`, and nicely
      * spreads out retries for consecutive tries. Over time, if (interval < max),
      * the random number will be above `max` about (1 - 1/backoff) of the time
      * (sleeping the `max`), and the rest of the time the sleep will be a random
      * number below `max`, decorrelating our trigger time from other pollers.
      */
    trait Frequency extends StObject {
      
      /**
        * Whether poll frequency backs off (boolean) or the backoff growth rate
        * (float > 1).
        *
        * #### Notes
        * If `true`, the default backoff growth rate is `3`.
        */
      val backoff: Boolean | Double
      
      /**
        * The basic polling interval in milliseconds (integer).
        */
      val interval: Double
      
      /**
        * The maximum milliseconds (integer) between poll requests.
        */
      val max: Double
    }
    object Frequency {
      
      inline def apply(backoff: Boolean | Double, interval: Double, max: Double): Frequency = {
        val __obj = js.Dynamic.literal(backoff = backoff.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
        __obj.asInstanceOf[Frequency]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Frequency] (val x: Self) extends AnyVal {
        
        inline def setBackoff(value: Boolean | Double): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
        
        inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      }
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPoll[?, ?, ?], T, U, V /* <: String */] (val x: Self & (IPoll[T, U, V])) extends AnyVal {
      
      inline def setDisposed(value: ISignal[IPoll[T, U, V], Unit]): Self = StObject.set(x, "disposed", value.asInstanceOf[js.Any])
      
      inline def setFrequency(value: Frequency): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setState(value: State[T, U, V]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTick(value: js.Promise[IPoll[T, U, V]]): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
      
      inline def setTicked(value: ISignal[IPoll[T, U, V], State[T, U, V]]): Self = StObject.set(x, "ticked", value.asInstanceOf[js.Any])
    }
    
    /**
      * The phase of the poll when the current tick was scheduled.
      *
      * @typeparam T - A type for any additional tick phases a poll supports.
      */
    /* Rewritten from type alias, can be one of: 
      - T
      - typings.luminoPolling.luminoPollingStrings.constructed
      - typings.luminoPolling.luminoPollingStrings.disposed
      - typings.luminoPolling.luminoPollingStrings.reconnected
      - typings.luminoPolling.luminoPollingStrings.refreshed
      - typings.luminoPolling.luminoPollingStrings.rejected
      - typings.luminoPolling.luminoPollingStrings.resolved
      - typings.luminoPolling.luminoPollingStrings.standby
      - typings.luminoPolling.luminoPollingStrings.started
      - typings.luminoPolling.luminoPollingStrings.stopped
    */
    type Phase[T /* <: String */] = _Phase[T] | T
    
    /**
      * Definition of poll state at any given time.
      *
      * @typeparam T - The resolved type of the factory's promises.
      *
      * @typeparam U - The rejected type of the factory's promises.
      *
      * @typeparam V - The type to extend the phases supported by a poll.
      */
    trait State[T, U, V /* <: String */] extends StObject {
      
      /**
        * The number of milliseconds until the current tick resolves.
        */
      val interval: Double
      
      /**
        * The payload of the last poll resolution or rejection.
        *
        * #### Notes
        * The payload is `null` unless the `phase` is `'reconnected`, `'resolved'`,
        * or `'rejected'`. Its type is `T` for resolutions and `U` for rejections.
        */
      val payload: T | U | Null
      
      /**
        * The current poll phase.
        */
      val phase: Phase[V]
      
      /**
        * The timestamp for when this tick was scheduled.
        */
      val timestamp: Double
    }
    object State {
      
      inline def apply[T, U, V /* <: String */](interval: Double, phase: Phase[V], timestamp: Double): State[T, U, V] = {
        val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], payload = null)
        __obj.asInstanceOf[State[T, U, V]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: State[?, ?, ?], T, U, V /* <: String */] (val x: Self & (State[T, U, V])) extends AnyVal {
        
        inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        inline def setPayload(value: T | U): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
        
        inline def setPayloadNull: Self = StObject.set(x, "payload", null)
        
        inline def setPhase(value: Phase[V]): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
        
        inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      }
    }
    
    trait _Phase[T /* <: String */] extends StObject
  }
  
  trait IRateLimiter[T, U, V /* <: js.Array[Any] */]
    extends StObject
       with IDisposable {
    
    /**
      * Invoke the rate limited function.
      */
    def invoke(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type V is not an array type */ args: V
    ): js.Promise[T]
    
    /**
      * The rate limit in milliseconds.
      */
    val limit: Double
    
    /**
      * Stop the function if it is mid-flight.
      */
    def stop(): js.Promise[Unit]
  }
  object IRateLimiter {
    
    inline def apply[T, U, V /* <: js.Array[Any] */](
      dispose: () => Unit,
      invoke: V => js.Promise[T],
      isDisposed: Boolean,
      limit: Double,
      stop: () => js.Promise[Unit]
    ): IRateLimiter[T, U, V] = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), invoke = js.Any.fromFunction1(invoke), isDisposed = isDisposed.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[IRateLimiter[T, U, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRateLimiter[?, ?, ?], T, U, V /* <: js.Array[Any] */] (val x: Self & (IRateLimiter[T, U, V])) extends AnyVal {
      
      inline def setInvoke(value: V => js.Promise[T]): Self = StObject.set(x, "invoke", js.Any.fromFunction1(value))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setStop(value: () => js.Promise[Unit]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}
