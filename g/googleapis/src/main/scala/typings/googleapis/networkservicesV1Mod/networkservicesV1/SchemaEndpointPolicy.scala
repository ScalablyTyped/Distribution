package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEndpointPolicy extends StObject {
  
  /**
    * Optional. This field specifies the URL of AuthorizationPolicy resource that applies authorization policies to the inbound traffic at the matched endpoints. Refer to Authorization. If this field is not specified, authorization is disabled(no authz checks) for this endpoint.
    */
  var authorizationPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A URL referring to a ClientTlsPolicy resource. ClientTlsPolicy can be set to specify the authentication for traffic from the proxy to the actual endpoints. More specifically, it is applied to the outgoing traffic from the proxy to the endpoint. This is typically used for sidecar model where the proxy identifies itself as endpoint to the control plane, with the connection between sidecar and endpoint requiring authentication. If this field is not set, authentication is disabled(open). Applicable only when EndpointPolicyType is SIDECAR_PROXY.
    */
  var clientTlsPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when the resource was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A free-text description of the resource. Max length 1024 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. A matcher that selects endpoints to which the policies should be applied.
    */
  var endpointMatcher: js.UndefOr[SchemaEndpointMatcher] = js.undefined
  
  /**
    * Optional. Set of label tags associated with the EndpointPolicy resource.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Required. Name of the EndpointPolicy resource. It matches pattern `projects/{project\}/locations/global/endpointPolicies/{endpoint_policy\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A URL referring to ServerTlsPolicy resource. ServerTlsPolicy is used to determine the authentication policy to be applied to terminate the inbound traffic at the identified backends. If this field is not set, authentication is disabled(open) for this endpoint.
    */
  var serverTlsPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
    */
  var trafficPortSelector: js.UndefOr[SchemaTrafficPortSelector] = js.undefined
  
  /**
    * Required. The type of endpoint policy. This is primarily used to validate the configuration.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when the resource was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaEndpointPolicy {
  
  inline def apply(): SchemaEndpointPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndpointPolicy]
  }
  
  extension [Self <: SchemaEndpointPolicy](x: Self) {
    
    inline def setAuthorizationPolicy(value: String): Self = StObject.set(x, "authorizationPolicy", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationPolicyNull: Self = StObject.set(x, "authorizationPolicy", null)
    
    inline def setAuthorizationPolicyUndefined: Self = StObject.set(x, "authorizationPolicy", js.undefined)
    
    inline def setClientTlsPolicy(value: String): Self = StObject.set(x, "clientTlsPolicy", value.asInstanceOf[js.Any])
    
    inline def setClientTlsPolicyNull: Self = StObject.set(x, "clientTlsPolicy", null)
    
    inline def setClientTlsPolicyUndefined: Self = StObject.set(x, "clientTlsPolicy", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndpointMatcher(value: SchemaEndpointMatcher): Self = StObject.set(x, "endpointMatcher", value.asInstanceOf[js.Any])
    
    inline def setEndpointMatcherUndefined: Self = StObject.set(x, "endpointMatcher", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServerTlsPolicy(value: String): Self = StObject.set(x, "serverTlsPolicy", value.asInstanceOf[js.Any])
    
    inline def setServerTlsPolicyNull: Self = StObject.set(x, "serverTlsPolicy", null)
    
    inline def setServerTlsPolicyUndefined: Self = StObject.set(x, "serverTlsPolicy", js.undefined)
    
    inline def setTrafficPortSelector(value: SchemaTrafficPortSelector): Self = StObject.set(x, "trafficPortSelector", value.asInstanceOf[js.Any])
    
    inline def setTrafficPortSelectorUndefined: Self = StObject.set(x, "trafficPortSelector", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
