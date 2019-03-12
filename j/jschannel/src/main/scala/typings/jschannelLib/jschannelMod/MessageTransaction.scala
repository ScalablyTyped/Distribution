package typings
package jschannelLib.jschannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageTransaction extends js.Object {
  def complete(result: js.Any): scala.Unit
  def completed(): scala.Boolean
  def delayReturn(delay: scala.Boolean): scala.Boolean
  def error(error: js.Any, message: java.lang.String): scala.Unit
  def invoke(callbackName: java.lang.String, params: js.Any): scala.Unit
}

object MessageTransaction {
  @scala.inline
  def apply(
    complete: js.Any => scala.Unit,
    completed: () => scala.Boolean,
    delayReturn: scala.Boolean => scala.Boolean,
    error: (js.Any, java.lang.String) => scala.Unit,
    invoke: (java.lang.String, js.Any) => scala.Unit
  ): MessageTransaction = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), completed = js.Any.fromFunction0(completed), delayReturn = js.Any.fromFunction1(delayReturn), error = js.Any.fromFunction2(error), invoke = js.Any.fromFunction2(invoke))
  
    __obj.asInstanceOf[MessageTransaction]
  }
}

