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
    complete: js.Function1[js.Any, scala.Unit],
    completed: js.Function0[scala.Boolean],
    delayReturn: js.Function1[scala.Boolean, scala.Boolean],
    error: js.Function2[js.Any, java.lang.String, scala.Unit],
    invoke: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): MessageTransaction = {
    val __obj = js.Dynamic.literal(complete = complete, completed = completed, delayReturn = delayReturn, error = error, invoke = invoke)
  
    __obj.asInstanceOf[MessageTransaction]
  }
}

