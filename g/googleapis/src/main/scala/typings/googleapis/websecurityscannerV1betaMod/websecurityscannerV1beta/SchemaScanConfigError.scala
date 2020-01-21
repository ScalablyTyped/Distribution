package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a custom error message used by CreateScanConfig and
  * UpdateScanConfig APIs when scan configuration validation fails. It is also
  * reported as part of a ScanRunErrorTrace message if scan validation fails
  * due to a scan configuration error.
  */
@js.native
trait SchemaScanConfigError extends js.Object {
  /**
    * Output only. Indicates the reason code for a configuration failure.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Output only. Indicates the full name of the ScanConfig field that
    * triggers this error, for example &quot;scan_config.max_qps&quot;. This
    * field is provided for troubleshooting purposes only and its actual value
    * can change in the future.
    */
  var fieldName: js.UndefOr[String] = js.native
}

object SchemaScanConfigError {
  @scala.inline
  def apply(code: String = null, fieldName: String = null): SchemaScanConfigError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaScanConfigError]
  }
}

