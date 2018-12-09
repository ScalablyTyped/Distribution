package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This is a private copy of the global Promise interface. It is used by JQuery.PromiseBase to indicate compatibility with other Promise implementations.
//       The global Promise interface cannot be used directly as it may be modified, as in the case of @types/bluebird-global.
/**
     * Represents the completion of an asynchronous operation
     */
@js.native
trait _Promise[T] extends js.Object {
  @JSName(ScalablyTyped.runtime.Symbol.toStringTag)
  val toStringTag: jqueryLib.jqueryLibStrings.Promise = js.native
  /**
           * Attaches a callback for only the rejection of the Promise.
           * @param onrejected The callback to execute when the Promise is rejected.
           * @returns A Promise for the completion of the callback.
           */
  def `catch`[TResult](): _Promise[T | TResult] = js.native
  /**
           * Attaches a callback for only the rejection of the Promise.
           * @param onrejected The callback to execute when the Promise is rejected.
           * @returns A Promise for the completion of the callback.
           */
  def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): _Promise[T | TResult] = js.native
  /**
           * Attaches callbacks for the resolution and/or rejection of the Promise.
           * @param onfulfilled The callback to execute when the Promise is resolved.
           * @param onrejected The callback to execute when the Promise is rejected.
           * @returns A Promise for the completion of which ever callback is executed.
           */
  def `then`[TResult1, TResult2](): _Promise[TResult1 | TResult2] = js.native
  /**
           * Attaches callbacks for the resolution and/or rejection of the Promise.
           * @param onfulfilled The callback to execute when the Promise is resolved.
           * @param onrejected The callback to execute when the Promise is rejected.
           * @returns A Promise for the completion of which ever callback is executed.
           */
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]]): _Promise[TResult1 | TResult2] = js.native
  /**
           * Attaches callbacks for the resolution and/or rejection of the Promise.
           * @param onfulfilled The callback to execute when the Promise is resolved.
           * @param onrejected The callback to execute when the Promise is rejected.
           * @returns A Promise for the completion of which ever callback is executed.
           */
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): _Promise[TResult1 | TResult2] = js.native
  /**
           * Attaches callbacks for the resolution and/or rejection of the Promise.
           * @param onfulfilled The callback to execute when the Promise is resolved.
           * @param onrejected The callback to execute when the Promise is rejected.
           * @returns A Promise for the completion of which ever callback is executed.
           */
  def `then`[TResult1, TResult2](
    onfulfilled: scala.Null,
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): _Promise[TResult1 | TResult2] = js.native
}

