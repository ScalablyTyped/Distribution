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
    end: Int | Double = null,
    filterExpression: js.Any = null,
    logging: js.UndefOr[Boolean] = js.undefined,
    maxUnitsUsage: Int | Double = null,
    recordType: String = null,
    searchId: String = null,
    smartConvert: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null
  ): Iconfig = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (filterExpression != null) __obj.updateDynamic("filterExpression")(filterExpression.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (maxUnitsUsage != null) __obj.updateDynamic("maxUnitsUsage")(maxUnitsUsage.asInstanceOf[js.Any])
    if (recordType != null) __obj.updateDynamic("recordType")(recordType.asInstanceOf[js.Any])
    if (searchId != null) __obj.updateDynamic("searchId")(searchId.asInstanceOf[js.Any])
    if (!js.isUndefined(smartConvert)) __obj.updateDynamic("smartConvert")(smartConvert.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iconfig]
  }
}

