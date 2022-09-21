package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2TransformationResultStatus extends StObject {
  
  /**
    * Detailed error codes and messages
    */
  var details: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
  
  /**
    * Transformation result status type, this will be either SUCCESS, or it will be the reason for why the transformation was not completely successful.
    */
  var resultStatusType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2TransformationResultStatus {
  
  inline def apply(): SchemaGooglePrivacyDlpV2TransformationResultStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TransformationResultStatus]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2TransformationResultStatus](x: Self) {
    
    inline def setDetails(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setResultStatusType(value: String): Self = StObject.set(x, "resultStatusType", value.asInstanceOf[js.Any])
    
    inline def setResultStatusTypeNull: Self = StObject.set(x, "resultStatusType", null)
    
    inline def setResultStatusTypeUndefined: Self = StObject.set(x, "resultStatusType", js.undefined)
  }
}
