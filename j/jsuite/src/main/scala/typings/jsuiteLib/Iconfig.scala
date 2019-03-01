package typings
package jsuiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iconfig extends js.Object {
  var columns: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[scala.Double] = js.undefined
  var filterExpression: js.UndefOr[js.Any] = js.undefined
  var logging: js.UndefOr[scala.Boolean] = js.undefined
  var maxUnitsUsage: js.UndefOr[scala.Double] = js.undefined
  var recordType: js.UndefOr[java.lang.String] = js.undefined
  var searchId: js.UndefOr[java.lang.String] = js.undefined
  var smartConvert: js.UndefOr[scala.Boolean] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
}

object Iconfig {
  @scala.inline
  def apply(
    columns: java.lang.String = null,
    end: scala.Int | scala.Double = null,
    filterExpression: js.Any = null,
    logging: js.UndefOr[scala.Boolean] = js.undefined,
    maxUnitsUsage: scala.Int | scala.Double = null,
    recordType: java.lang.String = null,
    searchId: java.lang.String = null,
    smartConvert: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Int | scala.Double = null
  ): Iconfig = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (filterExpression != null) __obj.updateDynamic("filterExpression")(filterExpression)
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging)
    if (maxUnitsUsage != null) __obj.updateDynamic("maxUnitsUsage")(maxUnitsUsage.asInstanceOf[js.Any])
    if (recordType != null) __obj.updateDynamic("recordType")(recordType)
    if (searchId != null) __obj.updateDynamic("searchId")(searchId)
    if (!js.isUndefined(smartConvert)) __obj.updateDynamic("smartConvert")(smartConvert)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iconfig]
  }
}

