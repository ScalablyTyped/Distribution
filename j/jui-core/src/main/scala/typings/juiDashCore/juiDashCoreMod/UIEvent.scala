package typings.juiDashCore.juiDashCoreMod

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIEvent extends UICore {
  /**
    * Get the child element of the root element
    */
  def find(selector: js.Any): JQuery[HTMLElement]
}

object UIEvent {
  @scala.inline
  def apply(
    addValid: (String, js.Array[_]) => Unit,
    callAfter: (String, js.Function0[Unit]) => Unit,
    callBefore: (String, js.Function0[Unit]) => Unit,
    callDelay: (String, js.Function0[Unit]) => Unit,
    destroy: () => Unit,
    emit: (String, js.Function0[Unit]) => js.Any,
    find: js.Any => JQuery[HTMLElement],
    off: String => Unit,
    on: (String, js.Function0[Unit]) => Unit,
    setOption: (String, js.Any) => Unit,
    setTpl: (String, String) => Unit,
    event: js.Any = null,
    root: js.Any = null,
    tpl: js.Any = null
  ): UIEvent = {
    val __obj = js.Dynamic.literal(addValid = js.Any.fromFunction2(addValid), callAfter = js.Any.fromFunction2(callAfter), callBefore = js.Any.fromFunction2(callBefore), callDelay = js.Any.fromFunction2(callDelay), destroy = js.Any.fromFunction0(destroy), emit = js.Any.fromFunction2(emit), find = js.Any.fromFunction1(find), off = js.Any.fromFunction1(off), on = js.Any.fromFunction2(on), setOption = js.Any.fromFunction2(setOption), setTpl = js.Any.fromFunction2(setTpl))
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIEvent]
  }
}

