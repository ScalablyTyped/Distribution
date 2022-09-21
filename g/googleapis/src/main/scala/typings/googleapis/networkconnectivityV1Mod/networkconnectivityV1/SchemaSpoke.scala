package typings.googleapis.networkconnectivityV1Mod.networkconnectivityV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpoke extends StObject {
  
  /**
    * Output only. The time the spoke was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional description of the spoke.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The name of the hub that this spoke is attached to.
    */
  var hub: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * VLAN attachments that are associated with the spoke.
    */
  var linkedInterconnectAttachments: js.UndefOr[SchemaLinkedInterconnectAttachments] = js.undefined
  
  /**
    * Router appliance instances that are associated with the spoke.
    */
  var linkedRouterApplianceInstances: js.UndefOr[SchemaLinkedRouterApplianceInstances] = js.undefined
  
  /**
    * VPN tunnels that are associated with the spoke.
    */
  var linkedVpnTunnels: js.UndefOr[SchemaLinkedVpnTunnels] = js.undefined
  
  /**
    * Immutable. The name of the spoke. Spoke names must be unique. They use the following form: `projects/{project_number\}/locations/{region\}/spokes/{spoke_id\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current lifecycle state of this spoke.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The Google-generated UUID for the spoke. This value is unique across all spoke resources. If a spoke is deleted and another with the same name is created, the new spoke is assigned a different unique_id.
    */
  var uniqueId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time the spoke was last updated.
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
    
    inline def setLinkedInterconnectAttachments(value: SchemaLinkedInterconnectAttachments): Self = StObject.set(x, "linkedInterconnectAttachments", value.asInstanceOf[js.Any])
    
    inline def setLinkedInterconnectAttachmentsUndefined: Self = StObject.set(x, "linkedInterconnectAttachments", js.undefined)
    
    inline def setLinkedRouterApplianceInstances(value: SchemaLinkedRouterApplianceInstances): Self = StObject.set(x, "linkedRouterApplianceInstances", value.asInstanceOf[js.Any])
    
    inline def setLinkedRouterApplianceInstancesUndefined: Self = StObject.set(x, "linkedRouterApplianceInstances", js.undefined)
    
    inline def setLinkedVpnTunnels(value: SchemaLinkedVpnTunnels): Self = StObject.set(x, "linkedVpnTunnels", value.asInstanceOf[js.Any])
    
    inline def setLinkedVpnTunnelsUndefined: Self = StObject.set(x, "linkedVpnTunnels", js.undefined)
    
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
