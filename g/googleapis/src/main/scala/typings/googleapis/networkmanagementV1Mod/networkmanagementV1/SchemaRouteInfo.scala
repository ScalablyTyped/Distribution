package typings.googleapis.networkmanagementV1Mod.networkmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouteInfo extends StObject {
  
  /**
    * Destination IP range of the route.
    */
  var destIpRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of a Compute Engine route.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Instance tags of the route.
    */
  var instanceTags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * URI of a Compute Engine network.
    */
  var networkUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Next hop of the route.
    */
  var nextHop: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of next hop.
    */
  var nextHopType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Priority of the route.
    */
  var priority: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Type of route.
    */
  var routeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of a Compute Engine route. Dynamic route from cloud router does not have a URI. Advertised route from Google Cloud VPC to on-premises network also does not have a URI.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaRouteInfo {
  
  inline def apply(): SchemaRouteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouteInfo]
  }
  
  extension [Self <: SchemaRouteInfo](x: Self) {
    
    inline def setDestIpRange(value: String): Self = StObject.set(x, "destIpRange", value.asInstanceOf[js.Any])
    
    inline def setDestIpRangeNull: Self = StObject.set(x, "destIpRange", null)
    
    inline def setDestIpRangeUndefined: Self = StObject.set(x, "destIpRange", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setInstanceTags(value: js.Array[String]): Self = StObject.set(x, "instanceTags", value.asInstanceOf[js.Any])
    
    inline def setInstanceTagsNull: Self = StObject.set(x, "instanceTags", null)
    
    inline def setInstanceTagsUndefined: Self = StObject.set(x, "instanceTags", js.undefined)
    
    inline def setInstanceTagsVarargs(value: String*): Self = StObject.set(x, "instanceTags", js.Array(value*))
    
    inline def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    inline def setNetworkUriNull: Self = StObject.set(x, "networkUri", null)
    
    inline def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    inline def setNextHop(value: String): Self = StObject.set(x, "nextHop", value.asInstanceOf[js.Any])
    
    inline def setNextHopNull: Self = StObject.set(x, "nextHop", null)
    
    inline def setNextHopType(value: String): Self = StObject.set(x, "nextHopType", value.asInstanceOf[js.Any])
    
    inline def setNextHopTypeNull: Self = StObject.set(x, "nextHopType", null)
    
    inline def setNextHopTypeUndefined: Self = StObject.set(x, "nextHopType", js.undefined)
    
    inline def setNextHopUndefined: Self = StObject.set(x, "nextHop", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRouteType(value: String): Self = StObject.set(x, "routeType", value.asInstanceOf[js.Any])
    
    inline def setRouteTypeNull: Self = StObject.set(x, "routeType", null)
    
    inline def setRouteTypeUndefined: Self = StObject.set(x, "routeType", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
