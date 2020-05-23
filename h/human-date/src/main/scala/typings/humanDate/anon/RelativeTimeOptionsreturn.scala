package typings.humanDate.anon

import typings.humanDate.humanDateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined human-date.human-date.RelativeTimeOptions & {  returnObject ? :false} */
trait RelativeTimeOptionsreturn extends js.Object {
  var allUnits: js.UndefOr[Boolean] = js.undefined
  var futureSuffix: js.UndefOr[String] = js.undefined
  var pastSuffix: js.UndefOr[String] = js.undefined
  var presentText: js.UndefOr[String] = js.undefined
  var returnObject: js.UndefOr[Boolean with `false`] = js.undefined
}

object RelativeTimeOptionsreturn {
  @scala.inline
  def apply(
    allUnits: js.UndefOr[Boolean] = js.undefined,
    futureSuffix: String = null,
    pastSuffix: String = null,
    presentText: String = null,
    returnObject: js.UndefOr[Boolean with `false`] = js.undefined
  ): RelativeTimeOptionsreturn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allUnits)) __obj.updateDynamic("allUnits")(allUnits.get.asInstanceOf[js.Any])
    if (futureSuffix != null) __obj.updateDynamic("futureSuffix")(futureSuffix.asInstanceOf[js.Any])
    if (pastSuffix != null) __obj.updateDynamic("pastSuffix")(pastSuffix.asInstanceOf[js.Any])
    if (presentText != null) __obj.updateDynamic("presentText")(presentText.asInstanceOf[js.Any])
    if (!js.isUndefined(returnObject)) __obj.updateDynamic("returnObject")(returnObject.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeOptionsreturn]
  }
}

