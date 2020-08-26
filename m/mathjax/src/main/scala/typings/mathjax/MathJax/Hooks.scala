package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hooks extends js.Object {
  def Add(hook: js.Any, priority: Double): CallbackObject = js.native
  def Execute(): CallbackObject = js.native
  def Remove(hook: CallbackObject): Unit = js.native
}

object Hooks {
  @scala.inline
  def apply(
    Add: (js.Any, Double) => CallbackObject,
    Execute: () => CallbackObject,
    Remove: CallbackObject => Unit
  ): Hooks = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Execute = js.Any.fromFunction0(Execute), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[Hooks]
  }
  @scala.inline
  implicit class HooksOps[Self <: Hooks] (val x: Self) extends AnyVal {
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
    def setAdd(value: (js.Any, Double) => CallbackObject): Self = this.set("Add", js.Any.fromFunction2(value))
    @scala.inline
    def setExecute(value: () => CallbackObject): Self = this.set("Execute", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: CallbackObject => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
  }
  
}

