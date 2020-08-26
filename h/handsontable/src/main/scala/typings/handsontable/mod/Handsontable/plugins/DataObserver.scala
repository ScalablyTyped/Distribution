package typings.handsontable.mod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataObserver extends js.Object {
  var observedData: js.Array[_] = js.native
  var observer: js.Object = js.native
  var paused: Boolean = js.native
  def destroy(): Unit = js.native
  def isPaused(): Boolean = js.native
  def pause(): Unit = js.native
  def resume(): Unit = js.native
  def setObservedData(observedData: js.Any): Unit = js.native
}

object DataObserver {
  @scala.inline
  def apply(
    destroy: () => Unit,
    isPaused: () => Boolean,
    observedData: js.Array[_],
    observer: js.Object,
    pause: () => Unit,
    paused: Boolean,
    resume: () => Unit,
    setObservedData: js.Any => Unit
  ): DataObserver = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), isPaused = js.Any.fromFunction0(isPaused), observedData = observedData.asInstanceOf[js.Any], observer = observer.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), paused = paused.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume), setObservedData = js.Any.fromFunction1(setObservedData))
    __obj.asInstanceOf[DataObserver]
  }
  @scala.inline
  implicit class DataObserverOps[Self <: DataObserver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setIsPaused(value: () => Boolean): Self = this.set("isPaused", js.Any.fromFunction0(value))
    @scala.inline
    def setObservedDataVarargs(value: js.Any*): Self = this.set("observedData", js.Array(value :_*))
    @scala.inline
    def setObservedData(value: js.Array[_]): Self = this.set("observedData", value.asInstanceOf[js.Any])
    @scala.inline
    def setObserver(value: js.Object): Self = this.set("observer", value.asInstanceOf[js.Any])
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def setResume(value: () => Unit): Self = this.set("resume", js.Any.fromFunction0(value))
    @scala.inline
    def setSetObservedData(value: js.Any => Unit): Self = this.set("setObservedData", js.Any.fromFunction1(value))
  }
  
}

