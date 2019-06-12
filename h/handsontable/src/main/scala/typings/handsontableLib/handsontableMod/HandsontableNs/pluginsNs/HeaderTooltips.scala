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
    addHook: (java.lang.String, js.Function1[/* repeated */ js.Any, _]) => scala.Unit,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
    clearHooks: () => scala.Unit,
    destroy: () => scala.Unit,
    disablePlugin: () => scala.Unit,
    enablePlugin: () => scala.Unit,
    enabled: scala.Boolean,
    init: () => scala.Unit,
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    parseSettings: () => scala.Unit,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: java.lang.String => scala.Unit,
    settings: scala.Boolean | js.Object
  ): HeaderTooltips = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, parseSettings = js.Any.fromFunction0(parseSettings), pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks), settings = settings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeaderTooltips]
  }
}

