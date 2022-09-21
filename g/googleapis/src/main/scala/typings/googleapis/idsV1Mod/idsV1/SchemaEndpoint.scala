package typings.googleapis.idsV1Mod.idsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEndpoint extends StObject {
  
  /**
    * Output only. The create time timestamp.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-provided description of the endpoint
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The fully qualified URL of the endpoint's ILB Forwarding Rule.
    */
  var endpointForwardingRule: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The IP address of the IDS Endpoint's ILB.
    */
  var endpointIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The labels of the endpoint.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The name of the endpoint.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The fully qualified URL of the network to which the IDS Endpoint is attached.
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Lowest threat severity that this endpoint will alert on.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Current state of the endpoint.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the endpoint should report traffic logs in addition to threat logs.
    */
  var trafficLogs: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The update time timestamp.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaEndpoint {
  
  inline def apply(): SchemaEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndpoint]
  }
  
  extension [Self <: SchemaEndpoint](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndpointForwardingRule(value: String): Self = StObject.set(x, "endpointForwardingRule", value.asInstanceOf[js.Any])
    
    inline def setEndpointForwardingRuleNull: Self = StObject.set(x, "endpointForwardingRule", null)
    
    inline def setEndpointForwardingRuleUndefined: Self = StObject.set(x, "endpointForwardingRule", js.undefined)
    
    inline def setEndpointIp(value: String): Self = StObject.set(x, "endpointIp", value.asInstanceOf[js.Any])
    
    inline def setEndpointIpNull: Self = StObject.set(x, "endpointIp", null)
    
    inline def setEndpointIpUndefined: Self = StObject.set(x, "endpointIp", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTrafficLogs(value: Boolean): Self = StObject.set(x, "trafficLogs", value.asInstanceOf[js.Any])
    
    inline def setTrafficLogsNull: Self = StObject.set(x, "trafficLogs", null)
    
    inline def setTrafficLogsUndefined: Self = StObject.set(x, "trafficLogs", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
