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
    addValid: js.Function2[java.lang.String, js.Array[_], scala.Unit],
    callAfter: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    callBefore: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    callDelay: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    destroy: js.Function0[scala.Unit],
    emit: js.Function2[java.lang.String, js.Function0[scala.Unit], js.Any],
    find: js.Function1[js.Any, jqueryLib.JQuery[stdLib.HTMLElement]],
    off: js.Function1[java.lang.String, scala.Unit],
    on: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    setOption: js.Function2[java.lang.String, js.Any, scala.Unit],
    setTpl: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    event: js.Any = null,
    root: js.Any = null,
    tpl: js.Any = null
  ): UIEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addValid")(addValid)
    __obj.updateDynamic("callAfter")(callAfter)
    __obj.updateDynamic("callBefore")(callBefore)
    __obj.updateDynamic("callDelay")(callDelay)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("emit")(emit)
    __obj.updateDynamic("find")(find)
    __obj.updateDynamic("off")(off)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("setOption")(setOption)
    __obj.updateDynamic("setTpl")(setTpl)
    if (event != null) __obj.updateDynamic("event")(event)
    if (root != null) __obj.updateDynamic("root")(root)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    __obj.asInstanceOf[UIEvent]
  }
}

