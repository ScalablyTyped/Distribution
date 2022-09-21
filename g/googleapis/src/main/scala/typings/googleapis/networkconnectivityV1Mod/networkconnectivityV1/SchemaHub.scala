package typings.googleapis.networkconnectivityV1Mod.networkconnectivityV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHub extends StObject {
  
  /**
    * Output only. The time the hub was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional description of the hub.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Immutable. The name of the hub. Hub names must be unique. They use the following form: `projects/{project_number\}/locations/global/hubs/{hub_id\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The VPC networks associated with this hub's spokes. This field is read-only. Network Connectivity Center automatically populates it based on the set of spokes attached to the hub.
    */
  var routingVpcs: js.UndefOr[js.Array[SchemaRoutingVPC]] = js.undefined
  
  /**
    * Output only. The current lifecycle state of this hub.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The Google-generated UUID for the hub. This value is unique across all hub resources. If a hub is deleted and another with the same name is created, the new hub is assigned a different unique_id.
    */
  var uniqueId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time the hub was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaHub {
  
  inline def apply(): SchemaHub = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHub]
  }
  
  extension [Self <: SchemaHub](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRoutingVpcs(value: js.Array[SchemaRoutingVPC]): Self = StObject.set(x, "routingVpcs", value.asInstanceOf[js.Any])
    
    inline def setRoutingVpcsUndefined: Self = StObject.set(x, "routingVpcs", js.undefined)
    
    inline def setRoutingVpcsVarargs(value: SchemaRoutingVPC*): Self = StObject.set(x, "routingVpcs", js.Array(value*))
    
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
