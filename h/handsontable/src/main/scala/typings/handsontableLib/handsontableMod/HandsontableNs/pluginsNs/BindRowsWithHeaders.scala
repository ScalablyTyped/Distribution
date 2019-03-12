package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindRowsWithHeaders extends Base {
  var bindStrategy: BindStrategy
  var removeRows: js.Array[_]
}

object BindRowsWithHeaders {
  @scala.inline
  def apply(
    addHook: (java.lang.String, js.Function0[scala.Unit]) => scala.Unit,
    bindStrategy: BindStrategy,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
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
    removeRows: js.Array[_]
  ): BindRowsWithHeaders = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), bindStrategy = bindStrategy, callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = js.Any.fromFunction1(removeHook), removeRows = removeRows)
  
    __obj.asInstanceOf[BindRowsWithHeaders]
  }
}

