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
    loadValue: js.Function2[java.lang.String, js.Object, scala.Unit],
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: js.Function1[java.lang.String, scala.Unit],
    resetValue: js.Function1[java.lang.String, scala.Unit],
    saveValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    storage: Storage
  ): PersistenState = {
    val __obj = js.Dynamic.literal(addHook = addHook, callOnPluginsReady = callOnPluginsReady, clearHooks = clearHooks, destroy = destroy, disablePlugin = disablePlugin, enablePlugin = enablePlugin, enabled = enabled, init = init, initialized = initialized, isPluginsReady = isPluginsReady, loadValue = loadValue, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = removeHook, resetValue = resetValue, saveValue = saveValue, storage = storage)
  
    __obj.asInstanceOf[PersistenState]
  }
}

