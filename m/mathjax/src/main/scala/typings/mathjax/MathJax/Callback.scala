package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callback extends StObject {
  
  def apply(code: String): CallbackObject = js.native
  def apply(fn: js.Function): CallbackObject = js.native
  def apply(fns: js.Array[Any | js.Function]): CallbackObject = js.native
  def apply(obj: Any): CallbackObject = js.native
  
  /*Waits for the specified time (given in milliseconds) and then performs the callback. It returns the Callback
    * object (or a blank one if none was supplied). The returned callback structure has a timeout property set to
    * the result of the setTimeout() call that was used to perform the wait so that you can cancel the wait, if
    * needed. Thus MathJax.Callback.Delay() can be used to start a timeout delay that executes the callback if an
    * action doesn’t occur within the given time (and if the action does occur, the timeout can be canceled).
    * Since MathJax.Callback.Delay() returns a callback structure, it can be used in a callback queue to insert a
    * delay between queued commands.
    */
  def Delay(time: Double, callback: Any): CallbackObject = js.native
  
  /*Calls each callback in the hooks array (or the single hook if it is not an array), passing it the arguments
    * stored in the data array. If reset is true, then the callback’s reset() method will be called before each hook
    * is executed. If any of the hooks returns a Callback object, then it collects those callbacks and returns a new
    * callback that will execute when all the ones returned by the hooks have been completed. Otherwise,
    * MathJax.Callback.ExecuteHooks() returns null.
    */
  def ExecuteHooks(hooks: js.Array[Any], data: js.Array[Any], reset: Boolean): CallbackObject = js.native
  
  /*Creates a prioritized list of hooks that are called in order based on their priority (low priority numbers are
    * handled first). This is meant to replace MathJax.Callback.ExecuteHooks() and is used internally for signal
    * callbacks, pre- and post-filters, and other lists of callbacks.
    */
  def Hooks(reset: Boolean): typings.mathjax.MathJax.Hooks = js.native
  
  /*Creates a MathJax.CallBack.Queue object and pushes the given callbacks into the queue. See Using Queues for
    * more details about MathJax queues.
    */
  def Queue(args: Any*): typings.mathjax.MathJax.Queue = js.native
  
  /*Looks for a named signal, creates it if it doesn’t already exist, and returns the signal object. See Using
    * Signals for more details.
    */
  def Signal(name: String): typings.mathjax.MathJax.Signal = js.native
}
