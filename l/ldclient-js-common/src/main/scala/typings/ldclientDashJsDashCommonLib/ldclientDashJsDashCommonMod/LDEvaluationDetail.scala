package typings
package ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDEvaluationDetail extends js.Object {
  /**
    * An object describing the main factor that influenced the flag evaluation value.
    */
  var reason: LDEvaluationReason
  /**
    * The result of the flag evaluation. This will be either one of the flag's variations or
    * the default value that was passed to [[LDClient.variationDetail]].
    */
  var value: LDFlagValue
  /**
    * The index of the returned value within the flag's list of variations, e.g. 0 for the
    * first variation-- or `null` if the default value was returned.
    */
  var variationIndex: js.UndefOr[scala.Double] = js.undefined
}

object LDEvaluationDetail {
  @scala.inline
  def apply(reason: LDEvaluationReason, value: LDFlagValue, variationIndex: scala.Int | scala.Double = null): LDEvaluationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("value")(value)
    if (variationIndex != null) __obj.updateDynamic("variationIndex")(variationIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDEvaluationDetail]
  }
}

