package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CSSHook[TElement] extends js.Object {
  def get(elem: TElement, computed: js.Any, extra: js.Any): js.Any
  def set(elem: TElement, value: js.Any): scala.Unit
}

object _CSSHook {
  @scala.inline
  def apply[TElement](
    get: js.Function3[TElement, js.Any, js.Any, js.Any],
    set: js.Function2[TElement, js.Any, scala.Unit]
  ): _CSSHook[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[_CSSHook[TElement]]
  }
}

