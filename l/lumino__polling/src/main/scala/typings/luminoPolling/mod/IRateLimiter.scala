package typings.luminoPolling.mod

import typings.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRateLimiter[T, U] extends IDisposable {
  /**
    * The rate limit in milliseconds.
    */
  val limit: Double = js.native
  /**
    * Invoke the rate limited function.
    */
  def invoke(): js.Promise[T] = js.native
  /**
    * Stop the function if it is mid-flight.
    */
  def stop(): js.Promise[Unit] = js.native
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
  @scala.inline
  implicit class IRateLimiterOps[Self <: IRateLimiter[_, _], T, U] (val x: Self with (IRateLimiter[T, U])) extends AnyVal {
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
    def setInvoke(value: () => js.Promise[T]): Self = this.set("invoke", js.Any.fromFunction0(value))
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setStop(value: () => js.Promise[Unit]): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

