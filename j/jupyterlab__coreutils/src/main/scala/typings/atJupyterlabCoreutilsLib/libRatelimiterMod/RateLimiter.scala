package typings
package atJupyterlabCoreutilsLib.libRatelimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/ratelimiter", "RateLimiter")
@js.native
abstract class RateLimiter[T, U] protected ()
  extends atJupyterlabCoreutilsLib.libInterfacesMod.IRateLimiter[T, U] {
  /**
    * Instantiate a rate limiter.
    *
    * @param fn - The function to rate limit.
    *
    * @param limit - The rate limit; defaults to 500ms.
    */
  def this(fn: js.Function0[T | js.Promise[T]]) = this()
  def this(fn: js.Function0[T | js.Promise[T]], limit: scala.Double) = this()
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * The rate limit in milliseconds.
    */
  /* CompleteClass */
  override val limit: scala.Double = js.native
  /**
    * A promise that resolves on each successful invocation.
    */
  var payload: atPhosphorCoreutilsLib.atPhosphorCoreutilsMod.PromiseDelegate[T] | scala.Null = js.native
  /**
    * The underlying poll instance used by the rate limiter.
    */
  var poll: atJupyterlabCoreutilsLib.libPollMod.Poll[T, U, atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.invoked] = js.native
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
  override def dispose(): scala.Unit = js.native
  /**
    * Invoke the rate limited function.
    */
  /* CompleteClass */
  override def invoke(): js.Promise[T] = js.native
  /**
    * Stop the function if it is mid-flight.
    */
  /* CompleteClass */
  override def stop(): js.Promise[scala.Unit] = js.native
}

