package typings.humanDate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeTimeOptions extends js.Object {
  var allUnits: js.UndefOr[Boolean] = js.undefined
  var futureSuffix: js.UndefOr[String] = js.undefined
  var pastSuffix: js.UndefOr[String] = js.undefined
  var presentText: js.UndefOr[String] = js.undefined
  var returnObject: js.UndefOr[Boolean] = js.undefined
}

object RelativeTimeOptions {
  @scala.inline
  def apply(
    allUnits: js.UndefOr[Boolean] = js.undefined,
    futureSuffix: String = null,
    pastSuffix: String = null,
    presentText: String = null,
    returnObject: js.UndefOr[Boolean] = js.undefined
  ): RelativeTimeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allUnits)) __obj.updateDynamic("allUnits")(allUnits.get.asInstanceOf[js.Any])
    if (futureSuffix != null) __obj.updateDynamic("futureSuffix")(futureSuffix.asInstanceOf[js.Any])
    if (pastSuffix != null) __obj.updateDynamic("pastSuffix")(pastSuffix.asInstanceOf[js.Any])
    if (presentText != null) __obj.updateDynamic("presentText")(presentText.asInstanceOf[js.Any])
    if (!js.isUndefined(returnObject)) __obj.updateDynamic("returnObject")(returnObject.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeOptions]
  }
}

