package typings
package k6Lib.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectThreshold extends js.Object {
  /** Abort test if threshold violated. */
  var abortOnFail: js.UndefOr[scala.Boolean] = js.undefined
  /** Duration to delay evaluation. Enables collecting additional metrics. */
  var delayAbortEval: js.UndefOr[java.lang.String] = js.undefined
  /** Threshold expression. */
  var threshold: java.lang.String
}

object ObjectThreshold {
  @scala.inline
  def apply(
    threshold: java.lang.String,
    abortOnFail: js.UndefOr[scala.Boolean] = js.undefined,
    delayAbortEval: java.lang.String = null
  ): ObjectThreshold = {
    val __obj = js.Dynamic.literal(threshold = threshold)
    if (!js.isUndefined(abortOnFail)) __obj.updateDynamic("abortOnFail")(abortOnFail)
    if (delayAbortEval != null) __obj.updateDynamic("delayAbortEval")(delayAbortEval)
    __obj.asInstanceOf[ObjectThreshold]
  }
}

