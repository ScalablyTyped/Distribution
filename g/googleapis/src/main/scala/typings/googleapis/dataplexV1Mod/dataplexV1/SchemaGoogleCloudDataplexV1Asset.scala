package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1Asset extends StObject {
  
  /**
    * Output only. The time when the asset was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Description of the asset.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Specification of the discovery feature applied to data referenced by this asset. When this spec is left unset, the asset will use the spec set on the parent zone.
    */
  var discoverySpec: js.UndefOr[SchemaGoogleCloudDataplexV1AssetDiscoverySpec] = js.undefined
  
  /**
    * Output only. Status of the discovery feature applied to data referenced by this asset.
    */
  var discoveryStatus: js.UndefOr[SchemaGoogleCloudDataplexV1AssetDiscoveryStatus] = js.undefined
  
  /**
    * Optional. User friendly display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. User defined labels for the asset.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The relative resource name of the asset, of the form: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}/assets/{asset_id\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Specification of the resource that is referenced by this asset.
    */
  var resourceSpec: js.UndefOr[SchemaGoogleCloudDataplexV1AssetResourceSpec] = js.undefined
  
  /**
    * Output only. Status of the resource referenced by this asset.
    */
  var resourceStatus: js.UndefOr[SchemaGoogleCloudDataplexV1AssetResourceStatus] = js.undefined
  
  /**
    * Output only. Status of the security policy applied to resource referenced by this asset.
    */
  var securityStatus: js.UndefOr[SchemaGoogleCloudDataplexV1AssetSecurityStatus] = js.undefined
  
  /**
    * Output only. Current state of the asset.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. System generated globally unique ID for the asset. This ID will be different if the asset is deleted and re-created with the same name.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the asset was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1Asset {
  
  inline def apply(): SchemaGoogleCloudDataplexV1Asset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1Asset]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1Asset](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiscoverySpec(value: SchemaGoogleCloudDataplexV1AssetDiscoverySpec): Self = StObject.set(x, "discoverySpec", value.asInstanceOf[js.Any])
    
    inline def setDiscoverySpecUndefined: Self = StObject.set(x, "discoverySpec", js.undefined)
    
    inline def setDiscoveryStatus(value: SchemaGoogleCloudDataplexV1AssetDiscoveryStatus): Self = StObject.set(x, "discoveryStatus", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryStatusUndefined: Self = StObject.set(x, "discoveryStatus", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceSpec(value: SchemaGoogleCloudDataplexV1AssetResourceSpec): Self = StObject.set(x, "resourceSpec", value.asInstanceOf[js.Any])
    
    inline def setResourceSpecUndefined: Self = StObject.set(x, "resourceSpec", js.undefined)
    
    inline def setResourceStatus(value: SchemaGoogleCloudDataplexV1AssetResourceStatus): Self = StObject.set(x, "resourceStatus", value.asInstanceOf[js.Any])
    
    inline def setResourceStatusUndefined: Self = StObject.set(x, "resourceStatus", js.undefined)
    
    inline def setSecurityStatus(value: SchemaGoogleCloudDataplexV1AssetSecurityStatus): Self = StObject.set(x, "securityStatus", value.asInstanceOf[js.Any])
    
    inline def setSecurityStatusUndefined: Self = StObject.set(x, "securityStatus", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
