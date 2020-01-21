package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only. Defines an error trace message for a ScanRun.
  */
@js.native
trait SchemaScanRunErrorTrace extends js.Object {
  /**
    * Output only. Indicates the error reason code.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Output only. If the scan encounters TOO_MANY_HTTP_ERRORS, this field
    * indicates the most common HTTP error code, if such is available. For
    * example, if this code is 404, the scan has encountered too many NOT_FOUND
    * responses.
    */
  var mostCommonHttpErrorCode: js.UndefOr[Double] = js.native
  /**
    * Output only. If the scan encounters SCAN_CONFIG_ISSUE error, this field
    * has the error message encountered during scan configuration validation
    * that is performed before each scan run.
    */
  var scanConfigError: js.UndefOr[SchemaScanConfigError] = js.native
}

object SchemaScanRunErrorTrace {
  @scala.inline
  def apply(
    code: String = null,
    mostCommonHttpErrorCode: Int | Double = null,
    scanConfigError: SchemaScanConfigError = null
  ): SchemaScanRunErrorTrace = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (mostCommonHttpErrorCode != null) __obj.updateDynamic("mostCommonHttpErrorCode")(mostCommonHttpErrorCode.asInstanceOf[js.Any])
    if (scanConfigError != null) __obj.updateDynamic("scanConfigError")(scanConfigError.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaScanRunErrorTrace]
  }
}

