package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<lokijs.ThrottledSaveDrainOptions> */
trait PartialThrottledSaveDrain extends js.Object {
  var recursiveWait: js.UndefOr[Boolean] = js.undefined
  var recursiveWaitLimit: js.UndefOr[Boolean] = js.undefined
  var recursiveWaitLimitDuration: js.UndefOr[Double] = js.undefined
  var started: js.UndefOr[Double] = js.undefined
}

object PartialThrottledSaveDrain {
  @scala.inline
  def apply(
    recursiveWait: js.UndefOr[Boolean] = js.undefined,
    recursiveWaitLimit: js.UndefOr[Boolean] = js.undefined,
    recursiveWaitLimitDuration: Int | Double = null,
    started: Int | Double = null
  ): PartialThrottledSaveDrain = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(recursiveWait)) __obj.updateDynamic("recursiveWait")(recursiveWait.asInstanceOf[js.Any])
    if (!js.isUndefined(recursiveWaitLimit)) __obj.updateDynamic("recursiveWaitLimit")(recursiveWaitLimit.asInstanceOf[js.Any])
    if (recursiveWaitLimitDuration != null) __obj.updateDynamic("recursiveWaitLimitDuration")(recursiveWaitLimitDuration.asInstanceOf[js.Any])
    if (started != null) __obj.updateDynamic("started")(started.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialThrottledSaveDrain]
  }
}

