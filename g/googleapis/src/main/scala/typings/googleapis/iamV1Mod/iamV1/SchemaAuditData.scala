package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Audit log information specific to Cloud IAM. This message is serialized as
  * an `Any` type in the `ServiceData` message of an `AuditLog` message.
  */
trait SchemaAuditData extends StObject {
  
  /**
    * Policy delta between the original policy and the newly set policy.
    */
  var policyDelta: js.UndefOr[SchemaPolicyDelta] = js.undefined
}
object SchemaAuditData {
  
  inline def apply(): SchemaAuditData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuditData]
  }
  
  extension [Self <: SchemaAuditData](x: Self) {
    
    inline def setPolicyDelta(value: SchemaPolicyDelta): Self = StObject.set(x, "policyDelta", value.asInstanceOf[js.Any])
    
    inline def setPolicyDeltaUndefined: Self = StObject.set(x, "policyDelta", js.undefined)
  }
}
