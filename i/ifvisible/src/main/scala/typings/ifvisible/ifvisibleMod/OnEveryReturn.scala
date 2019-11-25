package typings.ifvisible.ifvisibleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnEveryReturn extends js.Object {
  /**
    * Timer Id of setInterval
    */
  var code: Double
  /**
    * Callback function you passed to onEvery
    */
  def callback(): Unit
  /**
    * Pauses the interval, it's resumable
    */
  def pause(): Boolean
  /**
    * Resumes paused interval
    */
  def resume(): Boolean
  /**
    * Stop the interval, you cannot resume
    */
  def stop(): Boolean
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
}

