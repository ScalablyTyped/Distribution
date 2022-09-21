package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRoute extends StObject {
  
  /**
    * Output only. The timestamp when the resource was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A free-text description of the resource. Max length 1024 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Gateways defines a list of gateways this HttpRoute is attached to, as one of the routing rules to route the requests served by the gateway. Each gateway reference should match the pattern: `projects/x/locations/global/gateways/`
    */
  var gateways: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. Hostnames define a set of hosts that should match against the HTTP host header to select a HttpRoute to process the request. Hostname is the fully qualified domain name of a network host, as defined by RFC 1123 with the exception that: - IPs are not allowed. - A hostname may be prefixed with a wildcard label (*.). The wildcard label must appear by itself as the first label. Hostname can be "precise" which is a domain name without the terminating dot of a network host (e.g. "foo.example.com") or "wildcard", which is a domain name prefixed with a single wildcard label (e.g. *.example.com). Note that as per RFC1035 and RFC1123, a label must consist of lower case alphanumeric characters or '-', and must start and end with an alphanumeric character. No other punctuation is allowed. The routes associated with a Mesh or Gateways must have unique hostnames. If you attempt to attach multiple routes with conflicting hostnames, the configuration will be rejected. For example, while it is acceptable for routes for the hostnames "*.foo.bar.com" and "*.bar.com" to be associated with the same Mesh (or Gateways under the same scope), it is not possible to associate two routes both with "*.bar.com" or both with "bar.com".
    */
  var hostnames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Set of label tags associated with the HttpRoute resource.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. Meshes defines a list of meshes this HttpRoute is attached to, as one of the routing rules to route the requests served by the mesh. Each mesh reference should match the pattern: `projects/x/locations/global/meshes/` The attached Mesh should be of a type SIDECAR
    */
  var meshes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. Name of the HttpRoute resource. It matches pattern `projects/x/locations/global/httpRoutes/http_route_name\>`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Rules that define how traffic is routed and handled. Rules will be matched sequentially based on the RouteMatch specified for the rule.
    */
  var rules: js.UndefOr[js.Array[SchemaHttpRouteRouteRule]] = js.undefined
  
  /**
    * Output only. Server-defined URL of this resource
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when the resource was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaHttpRoute {
  
  inline def apply(): SchemaHttpRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRoute]
  }
  
  extension [Self <: SchemaHttpRoute](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGateways(value: js.Array[String]): Self = StObject.set(x, "gateways", value.asInstanceOf[js.Any])
    
    inline def setGatewaysNull: Self = StObject.set(x, "gateways", null)
    
    inline def setGatewaysUndefined: Self = StObject.set(x, "gateways", js.undefined)
    
    inline def setGatewaysVarargs(value: String*): Self = StObject.set(x, "gateways", js.Array(value*))
    
    inline def setHostnames(value: js.Array[String]): Self = StObject.set(x, "hostnames", value.asInstanceOf[js.Any])
    
    inline def setHostnamesNull: Self = StObject.set(x, "hostnames", null)
    
    inline def setHostnamesUndefined: Self = StObject.set(x, "hostnames", js.undefined)
    
    inline def setHostnamesVarargs(value: String*): Self = StObject.set(x, "hostnames", js.Array(value*))
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMeshes(value: js.Array[String]): Self = StObject.set(x, "meshes", value.asInstanceOf[js.Any])
    
    inline def setMeshesNull: Self = StObject.set(x, "meshes", null)
    
    inline def setMeshesUndefined: Self = StObject.set(x, "meshes", js.undefined)
    
    inline def setMeshesVarargs(value: String*): Self = StObject.set(x, "meshes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRules(value: js.Array[SchemaHttpRouteRouteRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaHttpRouteRouteRule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
