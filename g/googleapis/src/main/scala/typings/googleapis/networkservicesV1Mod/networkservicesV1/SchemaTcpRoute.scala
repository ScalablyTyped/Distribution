package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTcpRoute extends StObject {
  
  /**
    * Output only. The timestamp when the resource was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A free-text description of the resource. Max length 1024 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Gateways defines a list of gateways this TcpRoute is attached to, as one of the routing rules to route the requests served by the gateway. Each gateway reference should match the pattern: `projects/x/locations/global/gateways/`
    */
  var gateways: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Set of label tags associated with the TcpRoute resource.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. Meshes defines a list of meshes this TcpRoute is attached to, as one of the routing rules to route the requests served by the mesh. Each mesh reference should match the pattern: `projects/x/locations/global/meshes/` The attached Mesh should be of a type SIDECAR
    */
  var meshes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. Name of the TcpRoute resource. It matches pattern `projects/x/locations/global/tcpRoutes/tcp_route_name\>`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Rules that define how traffic is routed and handled. At least one RouteRule must be supplied. If there are multiple rules then the action taken will be the first rule to match.
    */
  var rules: js.UndefOr[js.Array[SchemaTcpRouteRouteRule]] = js.undefined
  
  /**
    * Output only. Server-defined URL of this resource
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when the resource was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaTcpRoute {
  
  inline def apply(): SchemaTcpRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTcpRoute]
  }
  
  extension [Self <: SchemaTcpRoute](x: Self) {
    
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
    
    inline def setRules(value: js.Array[SchemaTcpRouteRouteRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaTcpRouteRouteRule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
