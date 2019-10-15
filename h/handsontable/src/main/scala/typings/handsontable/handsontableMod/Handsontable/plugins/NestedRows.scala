package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.handsontable.handsontableMod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedRows extends BasePlugin {
  var bindRowsWithHeadersPlugin: BindRowsWithHeaders | Unit
  var collapsingUI: js.Object | Unit
  var dataManager: DataManager | Unit
  var headersUI: js.Object | Unit
  var sourceData: js.Object | Unit
  var trimRowsPlugin: TrimRows | Unit
}

object NestedRows {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    bindRowsWithHeadersPlugin: BindRowsWithHeaders | Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    collapsingUI: js.Object | Unit,
    dataManager: DataManager | Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    headersUI: js.Object | Unit,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    sourceData: js.Object | Unit,
    t: RecordTranslator,
    trimRowsPlugin: TrimRows | Unit,
    updatePlugin: () => Unit
  ): NestedRows = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), bindRowsWithHeadersPlugin = bindRowsWithHeadersPlugin.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), collapsingUI = collapsingUI.asInstanceOf[js.Any], dataManager = dataManager.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, headersUI = headersUI.asInstanceOf[js.Any], hot = hot, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks), sourceData = sourceData.asInstanceOf[js.Any], t = t, trimRowsPlugin = trimRowsPlugin.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
  
    __obj.asInstanceOf[NestedRows]
  }
}

