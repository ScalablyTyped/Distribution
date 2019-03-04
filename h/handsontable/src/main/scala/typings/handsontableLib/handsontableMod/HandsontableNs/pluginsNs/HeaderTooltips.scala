package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderTooltips extends Base {
  var settings: scala.Boolean | js.Object
  def parseSettings(): scala.Unit
}

object HeaderTooltips {
  @scala.inline
  def apply(
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
    clearHooks: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    disablePlugin: js.Function0[scala.Unit],
    enablePlugin: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    init: js.Function0[scala.Unit],
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    parseSettings: js.Function0[scala.Unit],
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: js.Function1[java.lang.String, scala.Unit],
    settings: scala.Boolean | js.Object
  ): HeaderTooltips = {
    val __obj = js.Dynamic.literal(addHook = addHook, callOnPluginsReady = callOnPluginsReady, clearHooks = clearHooks, destroy = destroy, disablePlugin = disablePlugin, enablePlugin = enablePlugin, enabled = enabled, init = init, initialized = initialized, isPluginsReady = isPluginsReady, parseSettings = parseSettings, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = removeHook, settings = settings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeaderTooltips]
  }
}

