package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a custom error message used by CreateScanConfig and
  * UpdateScanConfig APIs when scan configuration validation fails. It is also
  * reported as part of a ScanRunErrorTrace message if scan validation fails
  * due to a scan configuration error.
  */
@js.native
trait SchemaScanConfigError extends StObject {
  
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
  implicit class SchemaScanConfigErrorMutableBuilder[Self <: SchemaScanConfigError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
  }
}
