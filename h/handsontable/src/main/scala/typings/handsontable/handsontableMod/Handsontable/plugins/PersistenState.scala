package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.handsontable.handsontableMod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistenState extends Base {
  var storage: Storage
  def loadValue(key: String, saveTo: js.Object): Unit
  def resetValue(key: String): Unit
  def saveValue(key: String, value: js.Any): Unit
}

object PersistenState {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    loadValue: (String, js.Object) => Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    resetValue: String => Unit,
    saveValue: (String, js.Any) => Unit,
    storage: Storage,
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): PersistenState = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, hot = hot, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, loadValue = js.Any.fromFunction2(loadValue), pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks), resetValue = js.Any.fromFunction1(resetValue), saveValue = js.Any.fromFunction2(saveValue), storage = storage, t = t, updatePlugin = js.Any.fromFunction0(updatePlugin))
  
    __obj.asInstanceOf[PersistenState]
  }
}

