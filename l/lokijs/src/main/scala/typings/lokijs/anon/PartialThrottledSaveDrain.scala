package typings.lokijs.anon

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
    recursiveWaitLimitDuration: js.UndefOr[Double] = js.undefined,
    started: js.UndefOr[Double] = js.undefined
  ): PartialThrottledSaveDrain = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(recursiveWait)) __obj.updateDynamic("recursiveWait")(recursiveWait.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recursiveWaitLimit)) __obj.updateDynamic("recursiveWaitLimit")(recursiveWaitLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recursiveWaitLimitDuration)) __obj.updateDynamic("recursiveWaitLimitDuration")(recursiveWaitLimitDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(started)) __obj.updateDynamic("started")(started.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialThrottledSaveDrain]
  }
}

