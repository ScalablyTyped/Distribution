package typings.jschannel.jschannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageTransaction extends js.Object {
  def complete(result: js.Any): Unit
  def completed(): Boolean
  def delayReturn(delay: Boolean): Boolean
  def error(error: js.Any, message: String): Unit
  def invoke(callbackName: String, params: js.Any): Unit
}

object MessageTransaction {
  @scala.inline
  def apply(
    complete: js.Any => Unit,
    completed: () => Boolean,
    delayReturn: Boolean => Boolean,
    error: (js.Any, String) => Unit,
    invoke: (String, js.Any) => Unit
  ): MessageTransaction = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), completed = js.Any.fromFunction0(completed), delayReturn = js.Any.fromFunction1(delayReturn), error = js.Any.fromFunction2(error), invoke = js.Any.fromFunction2(invoke))
  
    __obj.asInstanceOf[MessageTransaction]
  }
}

