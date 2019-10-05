package typings.handsontable.handsontableMod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderTooltips extends Base {
  var settings: Boolean | js.Object
  def parseSettings(): Unit
}

object HeaderTooltips {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    parseSettings: () => Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    settings: Boolean | js.Object
  ): HeaderTooltips = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, parseSettings = js.Any.fromFunction0(parseSettings), pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks), settings = settings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeaderTooltips]
  }
}

