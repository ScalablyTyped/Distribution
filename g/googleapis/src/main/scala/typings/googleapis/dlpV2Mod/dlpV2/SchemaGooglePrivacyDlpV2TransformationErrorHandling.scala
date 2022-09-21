package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2TransformationErrorHandling extends StObject {
  
  /**
    * Ignore errors
    */
  var leaveUntransformed: js.UndefOr[SchemaGooglePrivacyDlpV2LeaveUntransformed] = js.undefined
  
  /**
    * Throw an error
    */
  var throwError: js.UndefOr[SchemaGooglePrivacyDlpV2ThrowError] = js.undefined
}
object SchemaGooglePrivacyDlpV2TransformationErrorHandling {
  
  inline def apply(): SchemaGooglePrivacyDlpV2TransformationErrorHandling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TransformationErrorHandling]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2TransformationErrorHandling](x: Self) {
    
    inline def setLeaveUntransformed(value: SchemaGooglePrivacyDlpV2LeaveUntransformed): Self = StObject.set(x, "leaveUntransformed", value.asInstanceOf[js.Any])
    
    inline def setLeaveUntransformedUndefined: Self = StObject.set(x, "leaveUntransformed", js.undefined)
    
    inline def setThrowError(value: SchemaGooglePrivacyDlpV2ThrowError): Self = StObject.set(x, "throwError", value.asInstanceOf[js.Any])
    
    inline def setThrowErrorUndefined: Self = StObject.set(x, "throwError", js.undefined)
  }
}
