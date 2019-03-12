package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragToScroll extends Base {
  var boundaries: js.Object | scala.Unit
  var callback: js.Function0[scala.Unit] | scala.Unit
  def check(x: scala.Double, y: scala.Double): scala.Unit
  def setBoundaries(boundaries: js.Object): scala.Unit
  def setCallback(callback: js.Function0[scala.Unit]): scala.Unit
}

object DragToScroll {
  @scala.inline
  def apply(
    addHook: (java.lang.String, js.Function0[scala.Unit]) => scala.Unit,
    boundaries: js.Object | scala.Unit,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
    callback: js.Function0[scala.Unit] | scala.Unit,
    check: (scala.Double, scala.Double) => scala.Unit,
    clearHooks: () => scala.Unit,
    destroy: () => scala.Unit,
    disablePlugin: () => scala.Unit,
    enablePlugin: () => scala.Unit,
    enabled: scala.Boolean,
    init: () => scala.Unit,
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: java.lang.String => scala.Unit,
    setBoundaries: js.Object => scala.Unit,
    setCallback: js.Function0[scala.Unit] => scala.Unit
  ): DragToScroll = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), boundaries = boundaries.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), callback = callback.asInstanceOf[js.Any], check = js.Any.fromFunction2(check), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = js.Any.fromFunction1(removeHook), setBoundaries = js.Any.fromFunction1(setBoundaries), setCallback = js.Any.fromFunction1(setCallback))
  
    __obj.asInstanceOf[DragToScroll]
  }
}

