package typings.jquery.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeferredStatic extends js.Object {
  
  /**
    * A factory function that returns a chainable utility object with methods to register multiple callbacks into callback queues, invoke callback queues, and relay the success or failure state of any synchronous or asynchronous function.
    * @param beforeStart A function that is called just before the constructor returns.
    * @see \`{@link https://api.jquery.com/jQuery.Deferred/ }\`
    * @since 1.5
    */
  def apply[TR, TJ, TN](): Deferred[TR, TJ, TN] = js.native
  def apply[TR, TJ, TN](
    beforeStart: js.ThisFunction1[/* this */ Deferred[TR, TJ, TN], /* deferred */ Deferred[TR, TJ, TN], Unit]
  ): Deferred[TR, TJ, TN] = js.native
  
  // https://jquery.com/upgrade-guide/3.0/#callback-exit
  var exceptionHook: js.Any = js.native
}
