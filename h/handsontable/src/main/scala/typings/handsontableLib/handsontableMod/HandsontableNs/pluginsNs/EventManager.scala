package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventManager extends js.Object {
  var context: js.UndefOr[js.Object] = js.undefined
  def addEventListener(
    element: stdLib.Element,
    eventName: java.lang.String,
    callback: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): js.Function0[scala.Unit]
  def clear(): scala.Unit
  def clearEvents(): scala.Unit
  def destroy(): scala.Unit
  def extendEvent(context: js.Object, event: stdLib.Event): js.Any
  def fireEvent(element: stdLib.Element, eventName: java.lang.String): scala.Unit
  def removeEventListener(
    element: stdLib.Element,
    eventName: java.lang.String,
    callback: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): scala.Unit
}

object EventManager {
  @scala.inline
  def apply(
    addEventListener: (stdLib.Element, java.lang.String, js.Function1[/* event */ stdLib.Event, scala.Unit]) => js.Function0[scala.Unit],
    clear: () => scala.Unit,
    clearEvents: () => scala.Unit,
    destroy: () => scala.Unit,
    extendEvent: (js.Object, stdLib.Event) => js.Any,
    fireEvent: (stdLib.Element, java.lang.String) => scala.Unit,
    removeEventListener: (stdLib.Element, java.lang.String, js.Function1[/* event */ stdLib.Event, scala.Unit]) => scala.Unit,
    context: js.Object = null
  ): EventManager = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), clear = js.Any.fromFunction0(clear), clearEvents = js.Any.fromFunction0(clearEvents), destroy = js.Any.fromFunction0(destroy), extendEvent = js.Any.fromFunction2(extendEvent), fireEvent = js.Any.fromFunction2(fireEvent), removeEventListener = js.Any.fromFunction3(removeEventListener))
    if (context != null) __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[EventManager]
  }
}

