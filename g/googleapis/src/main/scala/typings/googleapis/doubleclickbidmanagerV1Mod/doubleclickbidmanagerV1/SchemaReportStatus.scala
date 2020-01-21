package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Report status.
  */
@js.native
trait SchemaReportStatus extends js.Object {
  /**
    * If the report failed, this records the cause.
    */
  var failure: js.UndefOr[SchemaReportFailure] = js.native
  /**
    * The time when this report either completed successfully or failed.
    */
  var finishTimeMs: js.UndefOr[String] = js.native
  /**
    * The file type of the report.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The state of the report.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaReportStatus {
  @scala.inline
  def apply(
    failure: SchemaReportFailure = null,
    finishTimeMs: String = null,
    format: String = null,
    state: String = null
  ): SchemaReportStatus = {
    val __obj = js.Dynamic.literal()
    if (failure != null) __obj.updateDynamic("failure")(failure.asInstanceOf[js.Any])
    if (finishTimeMs != null) __obj.updateDynamic("finishTimeMs")(finishTimeMs.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReportStatus]
  }
}

