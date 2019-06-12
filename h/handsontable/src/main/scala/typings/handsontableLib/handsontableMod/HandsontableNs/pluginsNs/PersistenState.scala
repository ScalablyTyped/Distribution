package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistenState extends Base {
  var storage: Storage
  def loadValue(key: java.lang.String, saveTo: js.Object): scala.Unit
  def resetValue(key: java.lang.String): scala.Unit
  def saveValue(key: java.lang.String, value: js.Any): scala.Unit
}

object PersistenState {
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
    loadValue: (java.lang.String, js.Object) => scala.Unit,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: java.lang.String => scala.Unit,
    resetValue: java.lang.String => scala.Unit,
    saveValue: (java.lang.String, js.Any) => scala.Unit,
    storage: Storage
  ): PersistenState = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, loadValue = js.Any.fromFunction2(loadValue), pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks), resetValue = js.Any.fromFunction1(resetValue), saveValue = js.Any.fromFunction2(saveValue), storage = storage)
  
    __obj.asInstanceOf[PersistenState]
  }
}

