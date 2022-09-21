package typings.googleapis.networkmanagementV1Mod.networkmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStep extends StObject {
  
  /**
    * Display information of the final state "abort" and reason.
    */
  var abort: js.UndefOr[SchemaAbortInfo] = js.undefined
  
  /**
    * This is a step that leads to the final state Drop.
    */
  var causesDrop: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Display information of a Cloud function.
    */
  var cloudFunction: js.UndefOr[SchemaCloudFunctionInfo] = js.undefined
  
  /**
    * Display information of a Cloud SQL instance.
    */
  var cloudSqlInstance: js.UndefOr[SchemaCloudSQLInstanceInfo] = js.undefined
  
  /**
    * Display information of the final state "deliver" and reason.
    */
  var deliver: js.UndefOr[SchemaDeliverInfo] = js.undefined
  
  /**
    * A description of the step. Usually this is a summary of the state.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display information of the final state "drop" and reason.
    */
  var drop: js.UndefOr[SchemaDropInfo] = js.undefined
  
  /**
    * Display information of the source and destination under analysis. The endpoint information in an intermediate state may differ with the initial input, as it might be modified by state like NAT, or Connection Proxy.
    */
  var endpoint: js.UndefOr[SchemaEndpointInfo] = js.undefined
  
  /**
    * Display information of a Compute Engine firewall rule.
    */
  var firewall: js.UndefOr[SchemaFirewallInfo] = js.undefined
  
  /**
    * Display information of the final state "forward" and reason.
    */
  var forward: js.UndefOr[SchemaForwardInfo] = js.undefined
  
  /**
    * Display information of a Compute Engine forwarding rule.
    */
  var forwardingRule: js.UndefOr[SchemaForwardingRuleInfo] = js.undefined
  
  /**
    * Display information of a Google Kubernetes Engine cluster master.
    */
  var gkeMaster: js.UndefOr[SchemaGKEMasterInfo] = js.undefined
  
  /**
    * Display information of a Compute Engine instance.
    */
  var instance: js.UndefOr[SchemaInstanceInfo] = js.undefined
  
  /**
    * Display information of the load balancers.
    */
  var loadBalancer: js.UndefOr[SchemaLoadBalancerInfo] = js.undefined
  
  /**
    * Display information of a Google Cloud network.
    */
  var network: js.UndefOr[SchemaNetworkInfo] = js.undefined
  
  /**
    * Project ID that contains the configuration this step is validating.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display information of a Compute Engine route.
    */
  var route: js.UndefOr[SchemaRouteInfo] = js.undefined
  
  /**
    * Each step is in one of the pre-defined states.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display information of a VPC connector.
    */
  var vpcConnector: js.UndefOr[SchemaVpcConnectorInfo] = js.undefined
  
  /**
    * Display information of a Compute Engine VPN gateway.
    */
  var vpnGateway: js.UndefOr[SchemaVpnGatewayInfo] = js.undefined
  
  /**
    * Display information of a Compute Engine VPN tunnel.
    */
  var vpnTunnel: js.UndefOr[SchemaVpnTunnelInfo] = js.undefined
}
object SchemaStep {
  
  inline def apply(): SchemaStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStep]
  }
  
  extension [Self <: SchemaStep](x: Self) {
    
    inline def setAbort(value: SchemaAbortInfo): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    inline def setCausesDrop(value: Boolean): Self = StObject.set(x, "causesDrop", value.asInstanceOf[js.Any])
    
    inline def setCausesDropNull: Self = StObject.set(x, "causesDrop", null)
    
    inline def setCausesDropUndefined: Self = StObject.set(x, "causesDrop", js.undefined)
    
    inline def setCloudFunction(value: SchemaCloudFunctionInfo): Self = StObject.set(x, "cloudFunction", value.asInstanceOf[js.Any])
    
    inline def setCloudFunctionUndefined: Self = StObject.set(x, "cloudFunction", js.undefined)
    
    inline def setCloudSqlInstance(value: SchemaCloudSQLInstanceInfo): Self = StObject.set(x, "cloudSqlInstance", value.asInstanceOf[js.Any])
    
    inline def setCloudSqlInstanceUndefined: Self = StObject.set(x, "cloudSqlInstance", js.undefined)
    
    inline def setDeliver(value: SchemaDeliverInfo): Self = StObject.set(x, "deliver", value.asInstanceOf[js.Any])
    
    inline def setDeliverUndefined: Self = StObject.set(x, "deliver", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDrop(value: SchemaDropInfo): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setEndpoint(value: SchemaEndpointInfo): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setFirewall(value: SchemaFirewallInfo): Self = StObject.set(x, "firewall", value.asInstanceOf[js.Any])
    
    inline def setFirewallUndefined: Self = StObject.set(x, "firewall", js.undefined)
    
    inline def setForward(value: SchemaForwardInfo): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
    
    inline def setForwardingRule(value: SchemaForwardingRuleInfo): Self = StObject.set(x, "forwardingRule", value.asInstanceOf[js.Any])
    
    inline def setForwardingRuleUndefined: Self = StObject.set(x, "forwardingRule", js.undefined)
    
    inline def setGkeMaster(value: SchemaGKEMasterInfo): Self = StObject.set(x, "gkeMaster", value.asInstanceOf[js.Any])
    
    inline def setGkeMasterUndefined: Self = StObject.set(x, "gkeMaster", js.undefined)
    
    inline def setInstance(value: SchemaInstanceInfo): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setLoadBalancer(value: SchemaLoadBalancerInfo): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerUndefined: Self = StObject.set(x, "loadBalancer", js.undefined)
    
    inline def setNetwork(value: SchemaNetworkInfo): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRoute(value: SchemaRouteInfo): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVpcConnector(value: SchemaVpcConnectorInfo): Self = StObject.set(x, "vpcConnector", value.asInstanceOf[js.Any])
    
    inline def setVpcConnectorUndefined: Self = StObject.set(x, "vpcConnector", js.undefined)
    
    inline def setVpnGateway(value: SchemaVpnGatewayInfo): Self = StObject.set(x, "vpnGateway", value.asInstanceOf[js.Any])
    
    inline def setVpnGatewayUndefined: Self = StObject.set(x, "vpnGateway", js.undefined)
    
    inline def setVpnTunnel(value: SchemaVpnTunnelInfo): Self = StObject.set(x, "vpnTunnel", value.asInstanceOf[js.Any])
    
    inline def setVpnTunnelUndefined: Self = StObject.set(x, "vpnTunnel", js.undefined)
  }
}
