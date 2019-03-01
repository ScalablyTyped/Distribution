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

object DataObserver {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    isPaused: js.Function0[scala.Boolean],
    observedData: js.Array[_],
    observer: js.Object,
    pause: js.Function0[scala.Unit],
    paused: scala.Boolean,
    resume: js.Function0[scala.Unit],
    setObservedData: js.Function1[js.Any, scala.Unit]
  ): DataObserver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("isPaused")(isPaused)
    __obj.updateDynamic("observedData")(observedData)
    __obj.updateDynamic("observer")(observer)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("paused")(paused)
    __obj.updateDynamic("resume")(resume)
    __obj.updateDynamic("setObservedData")(setObservedData)
    __obj.asInstanceOf[DataObserver]
  }
}

