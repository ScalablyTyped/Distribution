package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrottledSaveDrainOptions extends js.Object {
  var recursiveWait: Boolean
  var recursiveWaitLimit: Boolean
  var recursiveWaitLimitDuration: Double
  var started: Double
}

object ThrottledSaveDrainOptions {
  @scala.inline
  def apply(
    recursiveWait: Boolean,
    recursiveWaitLimit: Boolean,
    recursiveWaitLimitDuration: Double,
    started: Double
  ): ThrottledSaveDrainOptions = {
    val __obj = js.Dynamic.literal(recursiveWait = recursiveWait, recursiveWaitLimit = recursiveWaitLimit, recursiveWaitLimitDuration = recursiveWaitLimitDuration, started = started)
  
    __obj.asInstanceOf[ThrottledSaveDrainOptions]
  }
}

