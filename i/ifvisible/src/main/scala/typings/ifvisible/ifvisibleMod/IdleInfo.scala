package typings.ifvisible.ifvisibleMod

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
    val __obj = js.Dynamic.literal(idleFor = idleFor, isIdle = isIdle, timeLeft = timeLeft, timeLeftPer = timeLeftPer)
  
    __obj.asInstanceOf[IdleInfo]
  }
}

