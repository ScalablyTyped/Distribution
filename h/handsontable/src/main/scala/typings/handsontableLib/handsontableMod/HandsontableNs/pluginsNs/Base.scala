package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var enabled: scala.Boolean
  var initialized: scala.Boolean
  var isPluginsReady: scala.Boolean
  var pluginName: java.lang.String
  var pluginsInitializedCallback: js.Array[_]
  def addHook(name: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _]): scala.Unit
  def callOnPluginsReady(callback: js.Function0[scala.Unit]): scala.Unit
  def clearHooks(): scala.Unit
  def destroy(): scala.Unit
  def disablePlugin(): scala.Unit
  def enablePlugin(): scala.Unit
  def init(): scala.Unit
  def removeHooks(name: java.lang.String): scala.Unit
}

object Base {
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
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: java.lang.String => scala.Unit
  ): Base = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks))
  
    __obj.asInstanceOf[Base]
  }
}

