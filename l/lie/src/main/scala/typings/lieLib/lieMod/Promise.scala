package typings
package lieLib.lieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the completion of an asynchronous operation
  */
@js.native
trait Promise[T] extends js.Object {
  /**
    * Attaches a callback for only the rejection of the Promise.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of the callback.
    */
  def `catch`[TResult](): Promise[T | TResult] = js.native
  def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): Promise[T | TResult] = js.native
  /**
    * When the promise is settled, whether fulfilled or rejected, execute the
    * specified callback function. This provides a way for code that must be
    * executed once the Promise has been dealt with to be run whether the promise
    * was fulfilled successfully or rejected.
    * @param onfinally Function called when the Promise is settled
    * @returns A Promise whose finally handler is set to the specified function, onfinally.
    */
  def `finally`[TResult](): Promise[T | TResult] = js.native
  def `finally`[TResult](onfinally: js.Function0[TResult | js.Thenable[TResult]]): Promise[T | TResult] = js.native
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  def `then`[TResult1, TResult2](): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]]): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: scala.Null,
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): Promise[TResult1 | TResult2] = js.native
}

