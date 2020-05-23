package typings.k6.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectThreshold extends js.Object {
  /** Abort test if threshold violated. */
  var abortOnFail: js.UndefOr[Boolean] = js.undefined
  /** Duration to delay evaluation. Enables collecting additional metrics. */
  var delayAbortEval: js.UndefOr[String] = js.undefined
  /** Threshold expression. */
  var threshold: String
}

object ObjectThreshold {
  @scala.inline
  def apply(threshold: String, abortOnFail: js.UndefOr[Boolean] = js.undefined, delayAbortEval: String = null): ObjectThreshold = {
    val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any])
    if (!js.isUndefined(abortOnFail)) __obj.updateDynamic("abortOnFail")(abortOnFail.get.asInstanceOf[js.Any])
    if (delayAbortEval != null) __obj.updateDynamic("delayAbortEval")(delayAbortEval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectThreshold]
  }
}

