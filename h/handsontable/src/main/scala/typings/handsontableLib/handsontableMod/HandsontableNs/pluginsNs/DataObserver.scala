package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataObserver extends js.Object {
  var observedData: js.Array[_]
  var observer: js.Object
  var paused: scala.Boolean
  def destroy(): scala.Unit
  def isPaused(): scala.Boolean
  def pause(): scala.Unit
  def resume(): scala.Unit
  def setObservedData(observedData: js.Any): scala.Unit
}

