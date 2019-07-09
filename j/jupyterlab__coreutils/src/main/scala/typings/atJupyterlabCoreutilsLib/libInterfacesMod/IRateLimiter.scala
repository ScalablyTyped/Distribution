package typings
package atJupyterlabCoreutilsLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRateLimiter[T, U]
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * The rate limit in milliseconds.
    */
  val limit: scala.Double
  /**
    * Invoke the rate limited function.
    */
  def invoke(): js.Promise[T]
  /**
    * Stop the function if it is mid-flight.
    */
  def stop(): js.Promise[scala.Unit]
}

object IRateLimiter {
  @scala.inline
  def apply[T, U](
    dispose: () => scala.Unit,
    invoke: () => js.Promise[T],
    isDisposed: scala.Boolean,
    limit: scala.Double,
    stop: () => js.Promise[scala.Unit]
  ): IRateLimiter[T, U] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), invoke = js.Any.fromFunction0(invoke), isDisposed = isDisposed, limit = limit, stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[IRateLimiter[T, U]]
  }
}

