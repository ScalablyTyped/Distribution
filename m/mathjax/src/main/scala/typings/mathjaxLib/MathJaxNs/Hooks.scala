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
    Add: js.Function2[js.Any, scala.Double, CallbackObject],
    Execute: js.Function0[CallbackObject],
    Remove: js.Function1[CallbackObject, scala.Unit]
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Execute")(Execute)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[Hooks]
  }
}

