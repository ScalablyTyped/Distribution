package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks extends js.Object {
  def Add(hook: js.Any, priority: scala.Double): CallbackObject
  def Execute(): CallbackObject
  def Remove(hook: CallbackObject): scala.Unit
}

object Hooks {
  @scala.inline
  def apply(
    Add: (js.Any, scala.Double) => CallbackObject,
    Execute: () => CallbackObject,
    Remove: CallbackObject => scala.Unit
  ): Hooks = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Execute = js.Any.fromFunction0(Execute), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[Hooks]
  }
}

