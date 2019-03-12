package typings
package juiDashCoreLib.juiDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIEvent extends UICore {
  /**
    * Get the child element of the root element
    */
  def find(selector: js.Any): jqueryLib.JQuery[stdLib.HTMLElement]
}

object UIEvent {
  @scala.inline
  def apply(
    addValid: (java.lang.String, js.Array[_]) => scala.Unit,
    callAfter: (java.lang.String, js.Function0[scala.Unit]) => scala.Unit,
    callBefore: (java.lang.String, js.Function0[scala.Unit]) => scala.Unit,
    callDelay: (java.lang.String, js.Function0[scala.Unit]) => scala.Unit,
    destroy: () => scala.Unit,
    emit: (java.lang.String, js.Function0[scala.Unit]) => js.Any,
    find: js.Any => jqueryLib.JQuery[stdLib.HTMLElement],
    off: java.lang.String => scala.Unit,
    on: (java.lang.String, js.Function0[scala.Unit]) => scala.Unit,
    setOption: (java.lang.String, js.Any) => scala.Unit,
    setTpl: (java.lang.String, java.lang.String) => scala.Unit,
    event: js.Any = null,
    root: js.Any = null,
    tpl: js.Any = null
  ): UIEvent = {
    val __obj = js.Dynamic.literal(addValid = js.Any.fromFunction2(addValid), callAfter = js.Any.fromFunction2(callAfter), callBefore = js.Any.fromFunction2(callBefore), callDelay = js.Any.fromFunction2(callDelay), destroy = js.Any.fromFunction0(destroy), emit = js.Any.fromFunction2(emit), find = js.Any.fromFunction1(find), off = js.Any.fromFunction1(off), on = js.Any.fromFunction2(on), setOption = js.Any.fromFunction2(setOption), setTpl = js.Any.fromFunction2(setTpl))
    if (event != null) __obj.updateDynamic("event")(event)
    if (root != null) __obj.updateDynamic("root")(root)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    __obj.asInstanceOf[UIEvent]
  }
}

