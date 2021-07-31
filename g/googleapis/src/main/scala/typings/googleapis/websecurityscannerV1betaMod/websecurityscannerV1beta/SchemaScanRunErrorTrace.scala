package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only. Defines an error trace message for a ScanRun.
  */
trait SchemaScanRunErrorTrace extends StObject {
  
  /**
    * Output only. Indicates the error reason code.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. If the scan encounters TOO_MANY_HTTP_ERRORS, this field
    * indicates the most common HTTP error code, if such is available. For
    * example, if this code is 404, the scan has encountered too many NOT_FOUND
    * responses.
    */
  var mostCommonHttpErrorCode: js.UndefOr[Double] = js.undefined
  
  /**
    * Output only. If the scan encounters SCAN_CONFIG_ISSUE error, this field
    * has the error message encountered during scan configuration validation
    * that is performed before each scan run.
    */
  var scanConfigError: js.UndefOr[SchemaScanConfigError] = js.undefined
}
object SchemaScanRunErrorTrace {
  
  @scala.inline
  def apply(): SchemaScanRunErrorTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScanRunErrorTrace]
  }
  
  @scala.inline
  implicit class SchemaScanRunErrorTraceMutableBuilder[Self <: SchemaScanRunErrorTrace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setMostCommonHttpErrorCode(value: Double): Self = StObject.set(x, "mostCommonHttpErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMostCommonHttpErrorCodeUndefined: Self = StObject.set(x, "mostCommonHttpErrorCode", js.undefined)
    
    @scala.inline
    def setScanConfigError(value: SchemaScanConfigError): Self = StObject.set(x, "scanConfigError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanConfigErrorUndefined: Self = StObject.set(x, "scanConfigError", js.undefined)
  }
}
