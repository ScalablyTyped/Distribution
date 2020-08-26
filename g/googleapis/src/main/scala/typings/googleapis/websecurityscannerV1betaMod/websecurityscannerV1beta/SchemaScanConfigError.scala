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
  def apply(): SchemaScanConfigError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScanConfigError]
  }
  @scala.inline
  implicit class SchemaScanConfigErrorOps[Self <: SchemaScanConfigError] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
  }
  
}

