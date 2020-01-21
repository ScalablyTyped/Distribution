package typings.jupyterlabCoreutils.interfacesMod

import typings.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRateLimiter[T, U] extends IDisposable {
  /**
    * The rate limit in milliseconds.
    */
  val limit: Double
  /**
    * Invoke the rate limited function.
    */
  def invoke(): js.Promise[T]
  /**
    * Stop the function if it is mid-flight.
    */
  def stop(): js.Promise[Unit]
}

object IRateLimiter {
  @scala.inline
  def apply[T, U](
    dispose: () => Unit,
    invoke: () => js.Promise[T],
    isDisposed: Boolean,
    limit: Double,
    stop: () => js.Promise[Unit]
  ): IRateLimiter[T, U] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), invoke = js.Any.fromFunction0(invoke), isDisposed = isDisposed.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[IRateLimiter[T, U]]
  }
}

