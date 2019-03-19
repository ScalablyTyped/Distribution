package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrottledSaveDrainOptions extends js.Object {
  var recursiveWait: scala.Boolean
  var recursiveWaitLimit: scala.Boolean
  var recursiveWaitLimitDuration: scala.Double
  var started: scala.Double
}

object ThrottledSaveDrainOptions {
  @scala.inline
  def apply(
    recursiveWait: scala.Boolean,
    recursiveWaitLimit: scala.Boolean,
    recursiveWaitLimitDuration: scala.Double,
    started: scala.Double
  ): ThrottledSaveDrainOptions = {
    val __obj = js.Dynamic.literal(recursiveWait = recursiveWait, recursiveWaitLimit = recursiveWaitLimit, recursiveWaitLimitDuration = recursiveWaitLimitDuration, started = started)
  
    __obj.asInstanceOf[ThrottledSaveDrainOptions]
  }
}

