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
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    bindRowsWithHeadersPlugin: BindRowsWithHeaders | scala.Unit,
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
    clearHooks: js.Function0[scala.Unit],
    collapsingUI: js.Object | scala.Unit,
    dataManager: DataManager | scala.Unit,
    destroy: js.Function0[scala.Unit],
    disablePlugin: js.Function0[scala.Unit],
    enablePlugin: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    headersUI: js.Object | scala.Unit,
    init: js.Function0[scala.Unit],
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: js.Function1[java.lang.String, scala.Unit],
    sourceData: js.Object | scala.Unit,
    trimRowsPlugin: TrimRows | scala.Unit
  ): NestedRows = {
    val __obj = js.Dynamic.literal(addHook = addHook, bindRowsWithHeadersPlugin = bindRowsWithHeadersPlugin.asInstanceOf[js.Any], callOnPluginsReady = callOnPluginsReady, clearHooks = clearHooks, collapsingUI = collapsingUI.asInstanceOf[js.Any], dataManager = dataManager.asInstanceOf[js.Any], destroy = destroy, disablePlugin = disablePlugin, enablePlugin = enablePlugin, enabled = enabled, headersUI = headersUI.asInstanceOf[js.Any], init = init, initialized = initialized, isPluginsReady = isPluginsReady, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = removeHook, sourceData = sourceData.asInstanceOf[js.Any], trimRowsPlugin = trimRowsPlugin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NestedRows]
  }
}

