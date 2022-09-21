package typings.googleapis.networkmanagementV1beta1Mod.networkmanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaForwardingRuleInfo extends StObject {
  
  /**
    * Name of a Compute Engine forwarding rule.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Port range defined in the forwarding rule that matches the test.
    */
  var matchedPortRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Protocol defined in the forwarding rule that matches the test.
    */
  var matchedProtocol: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Network URI. Only valid for Internal Load Balancer.
    */
  var networkUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Target type of the forwarding rule.
    */
  var target: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of a Compute Engine forwarding rule.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * VIP of the forwarding rule.
    */
  var vip: js.UndefOr[String | Null] = js.undefined
}
object SchemaForwardingRuleInfo {
  
  inline def apply(): SchemaForwardingRuleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForwardingRuleInfo]
  }
  
  extension [Self <: SchemaForwardingRuleInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMatchedPortRange(value: String): Self = StObject.set(x, "matchedPortRange", value.asInstanceOf[js.Any])
    
    inline def setMatchedPortRangeNull: Self = StObject.set(x, "matchedPortRange", null)
    
    inline def setMatchedPortRangeUndefined: Self = StObject.set(x, "matchedPortRange", js.undefined)
    
    inline def setMatchedProtocol(value: String): Self = StObject.set(x, "matchedProtocol", value.asInstanceOf[js.Any])
    
    inline def setMatchedProtocolNull: Self = StObject.set(x, "matchedProtocol", null)
    
    inline def setMatchedProtocolUndefined: Self = StObject.set(x, "matchedProtocol", js.undefined)
    
    inline def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    inline def setNetworkUriNull: Self = StObject.set(x, "networkUri", null)
    
    inline def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setVip(value: String): Self = StObject.set(x, "vip", value.asInstanceOf[js.Any])
    
    inline def setVipNull: Self = StObject.set(x, "vip", null)
    
    inline def setVipUndefined: Self = StObject.set(x, "vip", js.undefined)
  }
}
