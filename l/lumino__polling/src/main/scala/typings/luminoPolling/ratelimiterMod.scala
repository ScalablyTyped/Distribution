package typings.luminoPolling

import typings.luminoCoreutils.mod.PromiseDelegate
import typings.luminoPolling.luminoPollingStrings.invoked
import typings.luminoPolling.mod.IRateLimiter
import typings.luminoPolling.pollMod.Poll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/polling/lib/ratelimiter", JSImport.Namespace)
@js.native
object ratelimiterMod extends js.Object {
  @js.native
  class Debouncer[T, U] () extends RateLimiter[T, U]
  
  @js.native
  abstract class RateLimiter[T, U] protected () extends IRateLimiter[T, U] {
    /**
      * Instantiate a rate limiter.
      *
      * @param fn - The function to rate limit.
      *
      * @param limit - The rate limit; defaults to 500ms.
      */
    def this(fn: js.Function0[T | js.Promise[T]]) = this()
    def this(fn: js.Function0[T | js.Promise[T]], limit: Double) = this()
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * The rate limit in milliseconds.
      */
    /* CompleteClass */
    override val limit: Double = js.native
    /**
      * A promise that resolves on each successful invocation.
      */
    var payload: PromiseDelegate[T] | Null = js.native
    /**
      * The underlying poll instance used by the rate limiter.
      */
    var poll: Poll[T, U, invoked] = js.native
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
      * Invoke the rate limited function.
      */
    /* CompleteClass */
    override def invoke(): js.Promise[T] = js.native
    /**
      * Stop the function if it is mid-flight.
      */
    /* CompleteClass */
    override def stop(): js.Promise[Unit] = js.native
  }
  
  @js.native
  class Throttler[T, U] () extends RateLimiter[T, U]
  
}

