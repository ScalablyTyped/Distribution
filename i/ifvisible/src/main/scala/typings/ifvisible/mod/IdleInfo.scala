package typings.ifvisible.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdleInfo extends js.Object {
  /**
    * How long was the page idle in milliseconds
    */
  var idleFor: Double
  /**
    * if page idle now?
    */
  var isIdle: Boolean
  /**
    * How much time left to become idle in milliseconds
    */
  var timeLeft: Double
  /**
    * How much time left to become idle represented as percentage
    */
  var timeLeftPer: String
}

object IdleInfo {
  @scala.inline
  def apply(idleFor: Double, isIdle: Boolean, timeLeft: Double, timeLeftPer: String): IdleInfo = {
    val __obj = js.Dynamic.literal(idleFor = idleFor.asInstanceOf[js.Any], isIdle = isIdle.asInstanceOf[js.Any], timeLeft = timeLeft.asInstanceOf[js.Any], timeLeftPer = timeLeftPer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleInfo]
  }
}

