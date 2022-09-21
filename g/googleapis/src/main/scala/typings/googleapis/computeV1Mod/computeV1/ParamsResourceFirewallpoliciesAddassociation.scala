package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFirewallpoliciesAddassociation
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the firewall policy to update.
    */
  var firewallPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether or not to replace it if an association of the attachment already exists. This is false by default, in which case an error will be returned if an association already exists.
    */
  var replaceExistingAssociation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFirewallPolicyAssociation] = js.undefined
  
  /**
    * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object ParamsResourceFirewallpoliciesAddassociation {
  
  inline def apply(): ParamsResourceFirewallpoliciesAddassociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFirewallpoliciesAddassociation]
  }
  
  extension [Self <: ParamsResourceFirewallpoliciesAddassociation](x: Self) {
    
    inline def setFirewallPolicy(value: String): Self = StObject.set(x, "firewallPolicy", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyUndefined: Self = StObject.set(x, "firewallPolicy", js.undefined)
    
    inline def setReplaceExistingAssociation(value: Boolean): Self = StObject.set(x, "replaceExistingAssociation", value.asInstanceOf[js.Any])
    
    inline def setReplaceExistingAssociationUndefined: Self = StObject.set(x, "replaceExistingAssociation", js.undefined)
    
    inline def setRequestBody(value: SchemaFirewallPolicyAssociation): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
