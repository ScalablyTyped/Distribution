package typings.ifvisible.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnEveryReturn extends js.Object {
  /**
    * Timer Id of setInterval
    */
  var code: Double = js.native
  /**
    * Callback function you passed to onEvery
    */
  def callback(): Unit = js.native
  /**
    * Pauses the interval, it's resumable
    */
  def pause(): Boolean = js.native
  /**
    * Resumes paused interval
    */
  def resume(): Boolean = js.native
  /**
    * Stop the interval, you cannot resume
    */
  def stop(): Boolean = js.native
}

object OnEveryReturn {
  @scala.inline
  def apply(
    callback: () => Unit,
    code: Double,
    pause: () => Boolean,
    resume: () => Boolean,
    stop: () => Boolean
  ): OnEveryReturn = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), code = code.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[OnEveryReturn]
  }
  @scala.inline
  implicit class OnEveryReturnOps[Self <: OnEveryReturn] (val x: Self) extends AnyVal {
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
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setPause(value: () => Boolean): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def setResume(value: () => Boolean): Self = this.set("resume", js.Any.fromFunction0(value))
    @scala.inline
    def setStop(value: () => Boolean): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

