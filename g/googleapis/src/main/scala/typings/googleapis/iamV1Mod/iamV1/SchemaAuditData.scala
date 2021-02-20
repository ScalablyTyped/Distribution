package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Audit log information specific to Cloud IAM. This message is serialized as
  * an `Any` type in the `ServiceData` message of an `AuditLog` message.
  */
@js.native
trait SchemaAuditData extends StObject {
  
  /**
    * Policy delta between the original policy and the newly set policy.
    */
  var policyDelta: js.UndefOr[SchemaPolicyDelta] = js.native
}
object SchemaAuditData {
  
  @scala.inline
  def apply(): SchemaAuditData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuditData]
  }
  
  @scala.inline
  implicit class SchemaAuditDataMutableBuilder[Self <: SchemaAuditData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyDelta(value: SchemaPolicyDelta): Self = StObject.set(x, "policyDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDeltaUndefined: Self = StObject.set(x, "policyDelta", js.undefined)
  }
}
