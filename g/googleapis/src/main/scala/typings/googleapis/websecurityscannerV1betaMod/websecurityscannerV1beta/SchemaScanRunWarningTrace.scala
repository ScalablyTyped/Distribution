package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only. Defines a warning trace message for ScanRun. Warning traces
  * provide customers with useful information that helps make the scanning
  * process more effective.
  */
@js.native
trait SchemaScanRunWarningTrace extends StObject {
  
  /**
    * Output only. Indicates the warning code.
    */
  var code: js.UndefOr[String] = js.native
}
object SchemaScanRunWarningTrace {
  
  @scala.inline
  def apply(): SchemaScanRunWarningTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScanRunWarningTrace]
  }
  
  @scala.inline
  implicit class SchemaScanRunWarningTraceMutableBuilder[Self <: SchemaScanRunWarningTrace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
