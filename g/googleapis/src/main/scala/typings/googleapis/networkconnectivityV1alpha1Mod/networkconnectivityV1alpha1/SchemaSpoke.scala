package typings.googleapis.networkconnectivityV1alpha1Mod.networkconnectivityV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpoke extends StObject {
  
  /**
    * The time when the Spoke was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Short description of the spoke resource
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource URL of the hub resource that the spoke is attached to
    */
  var hub: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-defined labels.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The URIs of linked interconnect attachment resources
    */
  var linkedInterconnectAttachments: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The URIs of linked Router appliance resources
    */
  var linkedRouterApplianceInstances: js.UndefOr[js.Array[SchemaRouterApplianceInstance]] = js.undefined
  
  /**
    * The URIs of linked VPN tunnel resources
    */
  var linkedVpnTunnels: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Immutable. The name of a Spoke resource.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current lifecycle state of this Hub.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Google-generated UUID for this resource. This is unique across all Spoke resources. If a Spoke resource is deleted and another with the same name is created, it gets a different unique_id.
    */
  var uniqueId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time when the Spoke was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaSpoke {
  
  inline def apply(): SchemaSpoke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpoke]
  }
  
  extension [Self <: SchemaSpoke](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHub(value: String): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
    
    inline def setHubNull: Self = StObject.set(x, "hub", null)
    
    inline def setHubUndefined: Self = StObject.set(x, "hub", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLinkedInterconnectAttachments(value: js.Array[String]): Self = StObject.set(x, "linkedInterconnectAttachments", value.asInstanceOf[js.Any])
    
    inline def setLinkedInterconnectAttachmentsNull: Self = StObject.set(x, "linkedInterconnectAttachments", null)
    
    inline def setLinkedInterconnectAttachmentsUndefined: Self = StObject.set(x, "linkedInterconnectAttachments", js.undefined)
    
    inline def setLinkedInterconnectAttachmentsVarargs(value: String*): Self = StObject.set(x, "linkedInterconnectAttachments", js.Array(value*))
    
    inline def setLinkedRouterApplianceInstances(value: js.Array[SchemaRouterApplianceInstance]): Self = StObject.set(x, "linkedRouterApplianceInstances", value.asInstanceOf[js.Any])
    
    inline def setLinkedRouterApplianceInstancesUndefined: Self = StObject.set(x, "linkedRouterApplianceInstances", js.undefined)
    
    inline def setLinkedRouterApplianceInstancesVarargs(value: SchemaRouterApplianceInstance*): Self = StObject.set(x, "linkedRouterApplianceInstances", js.Array(value*))
    
    inline def setLinkedVpnTunnels(value: js.Array[String]): Self = StObject.set(x, "linkedVpnTunnels", value.asInstanceOf[js.Any])
    
    inline def setLinkedVpnTunnelsNull: Self = StObject.set(x, "linkedVpnTunnels", null)
    
    inline def setLinkedVpnTunnelsUndefined: Self = StObject.set(x, "linkedVpnTunnels", js.undefined)
    
    inline def setLinkedVpnTunnelsVarargs(value: String*): Self = StObject.set(x, "linkedVpnTunnels", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    
    inline def setUniqueIdNull: Self = StObject.set(x, "uniqueId", null)
    
    inline def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
