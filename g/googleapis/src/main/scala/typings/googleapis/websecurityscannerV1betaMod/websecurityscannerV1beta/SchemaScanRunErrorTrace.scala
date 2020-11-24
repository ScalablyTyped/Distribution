package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaScanRunErrorTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScanRunErrorTrace]
  }
  
  @scala.inline
  implicit class SchemaScanRunErrorTraceOps[Self <: SchemaScanRunErrorTrace] (val x: Self) extends AnyVal {
    
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
    def setMostCommonHttpErrorCode(value: Double): Self = this.set("mostCommonHttpErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMostCommonHttpErrorCode: Self = this.set("mostCommonHttpErrorCode", js.undefined)
    
    @scala.inline
    def setScanConfigError(value: SchemaScanConfigError): Self = this.set("scanConfigError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanConfigError: Self = this.set("scanConfigError", js.undefined)
  }
}
