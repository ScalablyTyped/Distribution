package typings.googleapis.serviceconsumermanagementV1beta1Mod.serviceconsumermanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV1beta1GenerateDefaultIdentityResponse extends StObject {
  
  /**
    * Status of the role attachment. Under development (go/si-attach-role), currently always return ATTACH_STATUS_UNSPECIFIED)
    */
  var attachStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DefaultIdentity that was created or retrieved.
    */
  var identity: js.UndefOr[SchemaV1beta1DefaultIdentity] = js.undefined
  
  /**
    * Role attached to consumer project. Empty if not attached in this request. (Under development, currently always return empty.)
    */
  var role: js.UndefOr[String | Null] = js.undefined
}
object SchemaV1beta1GenerateDefaultIdentityResponse {
  
  inline def apply(): SchemaV1beta1GenerateDefaultIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV1beta1GenerateDefaultIdentityResponse]
  }
  
  extension [Self <: SchemaV1beta1GenerateDefaultIdentityResponse](x: Self) {
    
    inline def setAttachStatus(value: String): Self = StObject.set(x, "attachStatus", value.asInstanceOf[js.Any])
    
    inline def setAttachStatusNull: Self = StObject.set(x, "attachStatus", null)
    
    inline def setAttachStatusUndefined: Self = StObject.set(x, "attachStatus", js.undefined)
    
    inline def setIdentity(value: SchemaV1beta1DefaultIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
