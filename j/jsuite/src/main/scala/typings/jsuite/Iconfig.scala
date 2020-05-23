package typings.jsuite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iconfig extends js.Object {
  var columns: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var filterExpression: js.UndefOr[js.Any] = js.undefined
  var logging: js.UndefOr[Boolean] = js.undefined
  var maxUnitsUsage: js.UndefOr[Double] = js.undefined
  var recordType: js.UndefOr[String] = js.undefined
  var searchId: js.UndefOr[String] = js.undefined
  var smartConvert: js.UndefOr[Boolean] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object Iconfig {
  @scala.inline
  def apply(
    columns: String = null,
    end: js.UndefOr[Double] = js.undefined,
    filterExpression: js.Any = null,
    logging: js.UndefOr[Boolean] = js.undefined,
    maxUnitsUsage: js.UndefOr[Double] = js.undefined,
    recordType: String = null,
    searchId: String = null,
    smartConvert: js.UndefOr[Boolean] = js.undefined,
    start: js.UndefOr[Double] = js.undefined
  ): Iconfig = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (filterExpression != null) __obj.updateDynamic("filterExpression")(filterExpression.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxUnitsUsage)) __obj.updateDynamic("maxUnitsUsage")(maxUnitsUsage.get.asInstanceOf[js.Any])
    if (recordType != null) __obj.updateDynamic("recordType")(recordType.asInstanceOf[js.Any])
    if (searchId != null) __obj.updateDynamic("searchId")(searchId.asInstanceOf[js.Any])
    if (!js.isUndefined(smartConvert)) __obj.updateDynamic("smartConvert")(smartConvert.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iconfig]
  }
}

