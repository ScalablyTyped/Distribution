package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var enabled: Boolean
  var initialized: Boolean
  var isPluginsReady: Boolean
  var pluginName: String
  var pluginsInitializedCallback: js.Array[_]
  def addHook(name: String, callback: js.Function1[/* repeated */ js.Any, _]): Unit
  def callOnPluginsReady(callback: js.Function0[Unit]): Unit
  def clearHooks(): Unit
  def destroy(): Unit
  def disablePlugin(): Unit
  def enablePlugin(): Unit
  def init(): Unit
  def removeHooks(name: String): Unit
}

object Base {
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
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit
  ): Base = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks))
  
    __obj.asInstanceOf[Base]
  }
}

