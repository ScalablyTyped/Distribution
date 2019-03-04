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
  def addHook(name: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit
  def callOnPluginsReady(callback: js.Function0[scala.Unit]): scala.Unit
  def clearHooks(): scala.Unit
  def destroy(): scala.Unit
  def disablePlugin(): scala.Unit
  def enablePlugin(): scala.Unit
  def init(): scala.Unit
  def removeHook(name: java.lang.String): scala.Unit
}

object Base {
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
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: js.Function1[java.lang.String, scala.Unit]
  ): Base = {
    val __obj = js.Dynamic.literal(addHook = addHook, callOnPluginsReady = callOnPluginsReady, clearHooks = clearHooks, destroy = destroy, disablePlugin = disablePlugin, enablePlugin = enablePlugin, enabled = enabled, init = init, initialized = initialized, isPluginsReady = isPluginsReady, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = removeHook)
  
    __obj.asInstanceOf[Base]
  }
}

