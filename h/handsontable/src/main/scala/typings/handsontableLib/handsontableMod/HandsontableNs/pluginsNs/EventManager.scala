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
    addEventListener: js.Function3[
      stdLib.Element, 
      java.lang.String, 
      js.Function1[/* event */ stdLib.Event, scala.Unit], 
      js.Function0[scala.Unit]
    ],
    clear: js.Function0[scala.Unit],
    clearEvents: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    extendEvent: js.Function2[js.Object, stdLib.Event, js.Any],
    fireEvent: js.Function2[stdLib.Element, java.lang.String, scala.Unit],
    removeEventListener: js.Function3[
      stdLib.Element, 
      java.lang.String, 
      js.Function1[/* event */ stdLib.Event, scala.Unit], 
      scala.Unit
    ],
    context: js.Object = null
  ): EventManager = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, clear = clear, clearEvents = clearEvents, destroy = destroy, extendEvent = extendEvent, fireEvent = fireEvent, removeEventListener = removeEventListener)
    if (context != null) __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[EventManager]
  }
}

