package typings.googleapis.fileV1beta1Mod.fileV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstance extends StObject {
  
  /**
    * The storage capacity of the instance in gigabytes (GB = 1024^3 bytes). This capacity can be increased up to `max_capacity_gb` GB in multipliers of `capacity_step_size_gb` GB.
    */
  var capacityGb: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The increase/decrease capacity step size.
    */
  var capacityStepSizeGb: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the instance was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The description of the instance (2048 characters or less).
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * File system shares on the instance. For this version, only a single file share is supported.
    */
  var fileShares: js.UndefOr[js.Array[SchemaFileShareConfig]] = js.undefined
  
  /**
    * KMS key name used for data encryption.
    */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource labels to represent user provided metadata.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The max capacity of the instance.
    */
  var maxCapacityGb: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The max number of shares allowed.
    */
  var maxShareCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether this instance uses a multi-share configuration with which it can have more than one file-share or none at all. File-shares are added, updated and removed through the separate file-share APIs.
    */
  var multiShareEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The resource name of the instance, in the format `projects/{project_id\}/locations/{location_id\}/instances/{instance_id\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * VPC networks to which the instance is connected. For this version, only a single network is supported.
    */
  var networks: js.UndefOr[js.Array[SchemaNetworkConfig]] = js.undefined
  
  /**
    * Output only. Reserved for future use.
    */
  var satisfiesPzs: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The instance state.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Additional information about the instance state, if available.
    */
  var statusMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Field indicates all the reasons the instance is in "SUSPENDED" state.
    */
  var suspensionReasons: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The service tier of the instance.
    */
  var tier: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstance {
  
  inline def apply(): SchemaInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstance]
  }
  
  extension [Self <: SchemaInstance](x: Self) {
    
    inline def setCapacityGb(value: String): Self = StObject.set(x, "capacityGb", value.asInstanceOf[js.Any])
    
    inline def setCapacityGbNull: Self = StObject.set(x, "capacityGb", null)
    
    inline def setCapacityGbUndefined: Self = StObject.set(x, "capacityGb", js.undefined)
    
    inline def setCapacityStepSizeGb(value: String): Self = StObject.set(x, "capacityStepSizeGb", value.asInstanceOf[js.Any])
    
    inline def setCapacityStepSizeGbNull: Self = StObject.set(x, "capacityStepSizeGb", null)
    
    inline def setCapacityStepSizeGbUndefined: Self = StObject.set(x, "capacityStepSizeGb", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFileShares(value: js.Array[SchemaFileShareConfig]): Self = StObject.set(x, "fileShares", value.asInstanceOf[js.Any])
    
    inline def setFileSharesUndefined: Self = StObject.set(x, "fileShares", js.undefined)
    
    inline def setFileSharesVarargs(value: SchemaFileShareConfig*): Self = StObject.set(x, "fileShares", js.Array(value*))
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMaxCapacityGb(value: String): Self = StObject.set(x, "maxCapacityGb", value.asInstanceOf[js.Any])
    
    inline def setMaxCapacityGbNull: Self = StObject.set(x, "maxCapacityGb", null)
    
    inline def setMaxCapacityGbUndefined: Self = StObject.set(x, "maxCapacityGb", js.undefined)
    
    inline def setMaxShareCount(value: String): Self = StObject.set(x, "maxShareCount", value.asInstanceOf[js.Any])
    
    inline def setMaxShareCountNull: Self = StObject.set(x, "maxShareCount", null)
    
    inline def setMaxShareCountUndefined: Self = StObject.set(x, "maxShareCount", js.undefined)
    
    inline def setMultiShareEnabled(value: Boolean): Self = StObject.set(x, "multiShareEnabled", value.asInstanceOf[js.Any])
    
    inline def setMultiShareEnabledNull: Self = StObject.set(x, "multiShareEnabled", null)
    
    inline def setMultiShareEnabledUndefined: Self = StObject.set(x, "multiShareEnabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworks(value: js.Array[SchemaNetworkConfig]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    
    inline def setNetworksVarargs(value: SchemaNetworkConfig*): Self = StObject.set(x, "networks", js.Array(value*))
    
    inline def setSatisfiesPzs(value: Boolean): Self = StObject.set(x, "satisfiesPzs", value.asInstanceOf[js.Any])
    
    inline def setSatisfiesPzsNull: Self = StObject.set(x, "satisfiesPzs", null)
    
    inline def setSatisfiesPzsUndefined: Self = StObject.set(x, "satisfiesPzs", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setSuspensionReasons(value: js.Array[String]): Self = StObject.set(x, "suspensionReasons", value.asInstanceOf[js.Any])
    
    inline def setSuspensionReasonsNull: Self = StObject.set(x, "suspensionReasons", null)
    
    inline def setSuspensionReasonsUndefined: Self = StObject.set(x, "suspensionReasons", js.undefined)
    
    inline def setSuspensionReasonsVarargs(value: String*): Self = StObject.set(x, "suspensionReasons", js.Array(value*))
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierNull: Self = StObject.set(x, "tier", null)
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
