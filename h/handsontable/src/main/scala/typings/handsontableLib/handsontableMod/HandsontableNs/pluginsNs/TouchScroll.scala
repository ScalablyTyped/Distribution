package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchScroll extends Base {
  var clones: js.Array[_]
  var lockedCollection: scala.Boolean
  var scrollbars: js.Array[_]
}

object TouchScroll {
  @scala.inline
  def apply(
    addHook: (java.lang.String, js.Function1[/* repeated */ js.Any, _]) => scala.Unit,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
    clearHooks: () => scala.Unit,
    clones: js.Array[_],
    destroy: () => scala.Unit,
    disablePlugin: () => scala.Unit,
    enablePlugin: () => scala.Unit,
    enabled: scala.Boolean,
    init: () => scala.Unit,
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    lockedCollection: scala.Boolean,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: java.lang.String => scala.Unit,
    scrollbars: js.Array[_]
  ): TouchScroll = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), clones = clones, destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, lockedCollection = lockedCollection, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks), scrollbars = scrollbars)
  
    __obj.asInstanceOf[TouchScroll]
  }
}

