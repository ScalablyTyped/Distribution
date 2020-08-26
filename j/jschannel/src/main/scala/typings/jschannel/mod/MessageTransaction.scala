package typings.jschannel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageTransaction extends js.Object {
  def complete(result: js.Any): Unit = js.native
  def completed(): Boolean = js.native
  def delayReturn(delay: Boolean): Boolean = js.native
  def error(error: js.Any, message: String): Unit = js.native
  def invoke(callbackName: String, params: js.Any): Unit = js.native
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
  @scala.inline
  implicit class MessageTransactionOps[Self <: MessageTransaction] (val x: Self) extends AnyVal {
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
    def setComplete(value: js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def setCompleted(value: () => Boolean): Self = this.set("completed", js.Any.fromFunction0(value))
    @scala.inline
    def setDelayReturn(value: Boolean => Boolean): Self = this.set("delayReturn", js.Any.fromFunction1(value))
    @scala.inline
    def setError(value: (js.Any, String) => Unit): Self = this.set("error", js.Any.fromFunction2(value))
    @scala.inline
    def setInvoke(value: (String, js.Any) => Unit): Self = this.set("invoke", js.Any.fromFunction2(value))
  }
  
}

