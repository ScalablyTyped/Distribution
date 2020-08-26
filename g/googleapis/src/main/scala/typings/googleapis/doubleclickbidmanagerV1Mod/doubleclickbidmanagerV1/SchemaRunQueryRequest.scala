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
  def apply(): SchemaRunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunQueryRequest]
  }
  @scala.inline
  implicit class SchemaRunQueryRequestOps[Self <: SchemaRunQueryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataRange(value: String): Self = this.set("dataRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataRange: Self = this.set("dataRange", js.undefined)
    @scala.inline
    def setReportDataEndTimeMs(value: String): Self = this.set("reportDataEndTimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportDataEndTimeMs: Self = this.set("reportDataEndTimeMs", js.undefined)
    @scala.inline
    def setReportDataStartTimeMs(value: String): Self = this.set("reportDataStartTimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportDataStartTimeMs: Self = this.set("reportDataStartTimeMs", js.undefined)
    @scala.inline
    def setTimezoneCode(value: String): Self = this.set("timezoneCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezoneCode: Self = this.set("timezoneCode", js.undefined)
  }
  
}

