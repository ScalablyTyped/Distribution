package typings.ifvisible.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdleInfo extends js.Object {
  /**
    * How long was the page idle in milliseconds
    */
  var idleFor: Double = js.native
  /**
    * if page idle now?
    */
  var isIdle: Boolean = js.native
  /**
    * How much time left to become idle in milliseconds
    */
  var timeLeft: Double = js.native
  /**
    * How much time left to become idle represented as percentage
    */
  var timeLeftPer: String = js.native
}

object IdleInfo {
  @scala.inline
  def apply(idleFor: Double, isIdle: Boolean, timeLeft: Double, timeLeftPer: String): IdleInfo = {
    val __obj = js.Dynamic.literal(idleFor = idleFor.asInstanceOf[js.Any], isIdle = isIdle.asInstanceOf[js.Any], timeLeft = timeLeft.asInstanceOf[js.Any], timeLeftPer = timeLeftPer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleInfo]
  }
  @scala.inline
  implicit class IdleInfoOps[Self <: IdleInfo] (val x: Self) extends AnyVal {
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
    def setIdleFor(value: Double): Self = this.set("idleFor", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsIdle(value: Boolean): Self = this.set("isIdle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeLeft(value: Double): Self = this.set("timeLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeLeftPer(value: String): Self = this.set("timeLeftPer", value.asInstanceOf[js.Any])
  }
  
}

