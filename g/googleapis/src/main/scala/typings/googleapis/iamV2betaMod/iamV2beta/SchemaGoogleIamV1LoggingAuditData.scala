package typings.googleapis.iamV2betaMod.iamV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIamV1LoggingAuditData extends StObject {
  
  /**
    * Policy delta between the original policy and the newly set policy.
    */
  var policyDelta: js.UndefOr[SchemaGoogleIamV1PolicyDelta] = js.undefined
}
object SchemaGoogleIamV1LoggingAuditData {
  
  inline def apply(): SchemaGoogleIamV1LoggingAuditData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIamV1LoggingAuditData]
  }
  
  extension [Self <: SchemaGoogleIamV1LoggingAuditData](x: Self) {
    
    inline def setPolicyDelta(value: SchemaGoogleIamV1PolicyDelta): Self = StObject.set(x, "policyDelta", value.asInstanceOf[js.Any])
    
    inline def setPolicyDeltaUndefined: Self = StObject.set(x, "policyDelta", js.undefined)
  }
}
