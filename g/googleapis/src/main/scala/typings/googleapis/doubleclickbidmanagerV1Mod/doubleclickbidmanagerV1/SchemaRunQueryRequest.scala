package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to run a stored query to generate a report.
  */
@js.native
trait SchemaRunQueryRequest extends js.Object {
  /**
    * Report data range used to generate the report.
    */
  var dataRange: js.UndefOr[String] = js.native
  /**
    * The ending time for the data that is shown in the report. Note,
    * reportDataEndTimeMs is required if dataRange is CUSTOM_DATES and ignored
    * otherwise.
    */
  var reportDataEndTimeMs: js.UndefOr[String] = js.native
  /**
    * The starting time for the data that is shown in the report. Note,
    * reportDataStartTimeMs is required if dataRange is CUSTOM_DATES and
    * ignored otherwise.
    */
  var reportDataStartTimeMs: js.UndefOr[String] = js.native
  /**
    * Canonical timezone code for report data time. Defaults to
    * America/New_York.
    */
  var timezoneCode: js.UndefOr[String] = js.native
}

object SchemaRunQueryRequest {
  @scala.inline
  def apply(
    dataRange: String = null,
    reportDataEndTimeMs: String = null,
    reportDataStartTimeMs: String = null,
    timezoneCode: String = null
  ): SchemaRunQueryRequest = {
    val __obj = js.Dynamic.literal()
    if (dataRange != null) __obj.updateDynamic("dataRange")(dataRange.asInstanceOf[js.Any])
    if (reportDataEndTimeMs != null) __obj.updateDynamic("reportDataEndTimeMs")(reportDataEndTimeMs.asInstanceOf[js.Any])
    if (reportDataStartTimeMs != null) __obj.updateDynamic("reportDataStartTimeMs")(reportDataStartTimeMs.asInstanceOf[js.Any])
    if (timezoneCode != null) __obj.updateDynamic("timezoneCode")(timezoneCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRunQueryRequest]
  }
}

