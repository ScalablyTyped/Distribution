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

