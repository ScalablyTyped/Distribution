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
    destroy: () => scala.Unit,
    isPaused: () => scala.Boolean,
    observedData: js.Array[_],
    observer: js.Object,
    pause: () => scala.Unit,
    paused: scala.Boolean,
    resume: () => scala.Unit,
    setObservedData: js.Any => scala.Unit
  ): DataObserver = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), isPaused = js.Any.fromFunction0(isPaused), observedData = observedData, observer = observer, pause = js.Any.fromFunction0(pause), paused = paused, resume = js.Any.fromFunction0(resume), setObservedData = js.Any.fromFunction1(setObservedData))
  
    __obj.asInstanceOf[DataObserver]
  }
}

