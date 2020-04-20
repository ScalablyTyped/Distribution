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
    val __obj = js.Dynamic.literal(recursiveWait = recursiveWait.asInstanceOf[js.Any], recursiveWaitLimit = recursiveWaitLimit.asInstanceOf[js.Any], recursiveWaitLimitDuration = recursiveWaitLimitDuration.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottledSaveDrainOptions]
  }
}

