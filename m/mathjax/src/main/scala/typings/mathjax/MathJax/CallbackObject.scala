package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackObject extends js.Object {
  /*Set this to true if you want to be able to call the callback more than once. (This is the case for signal
    * listeners, for example).*/
  var autoReset: Boolean
  /*Set to true after the callback has been called, and undefined otherwise. A callback will not be executed a
    * second time unless the callback’s reset() method is called first, or its autoReset property is set to true.
    */
  var called: Boolean
  /*An array containing the arguments to pass to the callback function when it is executed.*/
  var data: js.Array[_]
  /*The function to be called when the callback is executed.*/
  var hook: Double
  /*The object to use as this during the call to the callback function.*/
  var `object`: js.Any
  /*Clears the callback’s called property.*/
  def reset(): Unit
}

object CallbackObject {
  @scala.inline
  def apply(
    autoReset: Boolean,
    called: Boolean,
    data: js.Array[_],
    hook: Double,
    `object`: js.Any,
    reset: () => Unit
  ): CallbackObject = {
    val __obj = js.Dynamic.literal(autoReset = autoReset.asInstanceOf[js.Any], called = called.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackObject]
  }
}

