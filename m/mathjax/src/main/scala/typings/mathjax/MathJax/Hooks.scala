package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks extends js.Object {
  def Add(hook: js.Any, priority: Double): CallbackObject
  def Execute(): CallbackObject
  def Remove(hook: CallbackObject): Unit
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
}

