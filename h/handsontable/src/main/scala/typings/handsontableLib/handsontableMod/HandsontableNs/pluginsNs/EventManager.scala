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

