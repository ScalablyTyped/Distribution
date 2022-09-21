package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertValidationFailureEvent extends StObject {
  
  /** The reason why certification validation failed. */
  var failureReason: js.UndefOr[String] = js.undefined
}
object CertValidationFailureEvent {
  
  inline def apply(): CertValidationFailureEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertValidationFailureEvent]
  }
  
  extension [Self <: CertValidationFailureEvent](x: Self) {
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
  }
}
