package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleSecretLabelProto extends StObject {
  
  /**
    * ***DEPRECATED (3-Oct-2011) *** This field should be deleted when code stops using CAP_TOKEN labels. Used when type = CAP_TOKEN. When a CAP_TOKEN label appears in a
    * SimpleSecretHolder Principal, |capability_id| must be filled in to identify one of the capabilities on the ACL. When a CAP_TOKEN label appears in a SimpleSecret Authenticator, it is
    * NOT necessary to fill in |capability_id| -- ACL Service will find the ID by searching all capabilities on the ACL for one associated with the token given by the SimpleSecret's
    * secret data. If |capability_id| is specified, though, then the Authenticator will only be accepted if it actually matches that particular token ID.
    */
  var capabilityId: js.UndefOr[Double] = js.undefined
  
  /** Used when type = GENERIC_SECRET */
  var genericLabel: js.UndefOr[String] = js.undefined
  
  /** Used when type == INVITE. */
  var inviteId: js.UndefOr[String] = js.undefined
  
  /** This is optional because required enums cannot be extended. */
  var `type`: js.UndefOr[String] = js.undefined
}
object SimpleSecretLabelProto {
  
  inline def apply(): SimpleSecretLabelProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleSecretLabelProto]
  }
  
  extension [Self <: SimpleSecretLabelProto](x: Self) {
    
    inline def setCapabilityId(value: Double): Self = StObject.set(x, "capabilityId", value.asInstanceOf[js.Any])
    
    inline def setCapabilityIdUndefined: Self = StObject.set(x, "capabilityId", js.undefined)
    
    inline def setGenericLabel(value: String): Self = StObject.set(x, "genericLabel", value.asInstanceOf[js.Any])
    
    inline def setGenericLabelUndefined: Self = StObject.set(x, "genericLabel", js.undefined)
    
    inline def setInviteId(value: String): Self = StObject.set(x, "inviteId", value.asInstanceOf[js.Any])
    
    inline def setInviteIdUndefined: Self = StObject.set(x, "inviteId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
