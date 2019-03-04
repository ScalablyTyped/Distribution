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
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    boundaries: js.Object | scala.Unit,
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
    callback: js.Function0[scala.Unit] | scala.Unit,
    check: js.Function2[scala.Double, scala.Double, scala.Unit],
    clearHooks: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    disablePlugin: js.Function0[scala.Unit],
    enablePlugin: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    init: js.Function0[scala.Unit],
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: js.Function1[java.lang.String, scala.Unit],
    setBoundaries: js.Function1[js.Object, scala.Unit],
    setCallback: js.Function1[js.Function0[scala.Unit], scala.Unit]
  ): DragToScroll = {
    val __obj = js.Dynamic.literal(addHook = addHook, boundaries = boundaries.asInstanceOf[js.Any], callOnPluginsReady = callOnPluginsReady, callback = callback.asInstanceOf[js.Any], check = check, clearHooks = clearHooks, destroy = destroy, disablePlugin = disablePlugin, enablePlugin = enablePlugin, enabled = enabled, init = init, initialized = initialized, isPluginsReady = isPluginsReady, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = removeHook, setBoundaries = setBoundaries, setCallback = setCallback)
  
    __obj.asInstanceOf[DragToScroll]
  }
}

