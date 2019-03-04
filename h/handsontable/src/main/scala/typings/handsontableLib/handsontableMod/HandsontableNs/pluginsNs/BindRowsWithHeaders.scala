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
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    bindStrategy: BindStrategy,
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
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
    removeRows: js.Array[_]
  ): BindRowsWithHeaders = {
    val __obj = js.Dynamic.literal(addHook = addHook, bindStrategy = bindStrategy, callOnPluginsReady = callOnPluginsReady, clearHooks = clearHooks, destroy = destroy, disablePlugin = disablePlugin, enablePlugin = enablePlugin, enabled = enabled, init = init, initialized = initialized, isPluginsReady = isPluginsReady, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = removeHook, removeRows = removeRows)
  
    __obj.asInstanceOf[BindRowsWithHeaders]
  }
}

