package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1Zone extends StObject {
  
  /**
    * Output only. Aggregated status of the underlying assets of the zone.
    */
  var assetStatus: js.UndefOr[SchemaGoogleCloudDataplexV1AssetStatus] = js.undefined
  
  /**
    * Output only. The time when the zone was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Description of the zone.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Specification of the discovery feature applied to data in this zone.
    */
  var discoverySpec: js.UndefOr[SchemaGoogleCloudDataplexV1ZoneDiscoverySpec] = js.undefined
  
  /**
    * Optional. User friendly display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. User defined labels for the zone.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The relative resource name of the zone, of the form: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Specification of the resources that are referenced by the assets within this zone.
    */
  var resourceSpec: js.UndefOr[SchemaGoogleCloudDataplexV1ZoneResourceSpec] = js.undefined
  
  /**
    * Output only. Current state of the zone.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The type of the zone.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. System generated globally unique ID for the zone. This ID will be different if the zone is deleted and re-created with the same name.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the zone was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1Zone {
  
  inline def apply(): SchemaGoogleCloudDataplexV1Zone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1Zone]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1Zone](x: Self) {
    
    inline def setAssetStatus(value: SchemaGoogleCloudDataplexV1AssetStatus): Self = StObject.set(x, "assetStatus", value.asInstanceOf[js.Any])
    
    inline def setAssetStatusUndefined: Self = StObject.set(x, "assetStatus", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiscoverySpec(value: SchemaGoogleCloudDataplexV1ZoneDiscoverySpec): Self = StObject.set(x, "discoverySpec", value.asInstanceOf[js.Any])
    
    inline def setDiscoverySpecUndefined: Self = StObject.set(x, "discoverySpec", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceSpec(value: SchemaGoogleCloudDataplexV1ZoneResourceSpec): Self = StObject.set(x, "resourceSpec", value.asInstanceOf[js.Any])
    
    inline def setResourceSpecUndefined: Self = StObject.set(x, "resourceSpec", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
