package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSimpleSecretLabelProto extends StObject {
  
  /**
    * ***DEPRECATED (3-Oct-2011) *** This field should be deleted when code stops using CAP_TOKEN labels. Used when type = CAP_TOKEN. When a CAP_TOKEN label appears in a SimpleSecretHolder Principal, |capability_id| must be filled in to identify one of the capabilities on the ACL. When a CAP_TOKEN label appears in a SimpleSecret Authenticator, it is NOT necessary to fill in |capability_id| -- ACL Service will find the ID by searching all capabilities on the ACL for one associated with the token given by the SimpleSecret's secret data. If |capability_id| is specified, though, then the Authenticator will only be accepted if it actually matches that particular token ID.
    */
  var capabilityId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Used when type = GENERIC_SECRET
    */
  var genericLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Used when type == INVITE.
    */
  var inviteId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is optional because required enums cannot be extended.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSimpleSecretLabelProto {
  
  inline def apply(): SchemaSimpleSecretLabelProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSimpleSecretLabelProto]
  }
  
  extension [Self <: SchemaSimpleSecretLabelProto](x: Self) {
    
    inline def setCapabilityId(value: Double): Self = StObject.set(x, "capabilityId", value.asInstanceOf[js.Any])
    
    inline def setCapabilityIdNull: Self = StObject.set(x, "capabilityId", null)
    
    inline def setCapabilityIdUndefined: Self = StObject.set(x, "capabilityId", js.undefined)
    
    inline def setGenericLabel(value: String): Self = StObject.set(x, "genericLabel", value.asInstanceOf[js.Any])
    
    inline def setGenericLabelNull: Self = StObject.set(x, "genericLabel", null)
    
    inline def setGenericLabelUndefined: Self = StObject.set(x, "genericLabel", js.undefined)
    
    inline def setInviteId(value: String): Self = StObject.set(x, "inviteId", value.asInstanceOf[js.Any])
    
    inline def setInviteIdNull: Self = StObject.set(x, "inviteId", null)
    
    inline def setInviteIdUndefined: Self = StObject.set(x, "inviteId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
