package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedRows extends Base {
  var bindRowsWithHeadersPlugin: BindRowsWithHeaders | scala.Unit
  var collapsingUI: js.Object | scala.Unit
  var dataManager: DataManager | scala.Unit
  var headersUI: js.Object | scala.Unit
  var sourceData: js.Object | scala.Unit
  var trimRowsPlugin: TrimRows | scala.Unit
}

object NestedRows {
  @scala.inline
  def apply(
    addHook: (java.lang.String, js.Function0[scala.Unit]) => scala.Unit,
    bindRowsWithHeadersPlugin: BindRowsWithHeaders | scala.Unit,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
    clearHooks: () => scala.Unit,
    collapsingUI: js.Object | scala.Unit,
    dataManager: DataManager | scala.Unit,
    destroy: () => scala.Unit,
    disablePlugin: () => scala.Unit,
    enablePlugin: () => scala.Unit,
    enabled: scala.Boolean,
    headersUI: js.Object | scala.Unit,
    init: () => scala.Unit,
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: java.lang.String => scala.Unit,
    sourceData: js.Object | scala.Unit,
    trimRowsPlugin: TrimRows | scala.Unit
  ): NestedRows = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), bindRowsWithHeadersPlugin = bindRowsWithHeadersPlugin.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), collapsingUI = collapsingUI.asInstanceOf[js.Any], dataManager = dataManager.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, headersUI = headersUI.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = js.Any.fromFunction1(removeHook), sourceData = sourceData.asInstanceOf[js.Any], trimRowsPlugin = trimRowsPlugin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NestedRows]
  }
}

