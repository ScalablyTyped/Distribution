package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoprovisioningNodePoolDefaults extends StObject {
  
  /**
    *  The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see: https://cloud.google.com/compute/docs/disks/customer-managed-encryption
    */
  var bootDiskKmsKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. If unspecified, the default disk size is 100GB.
    */
  var diskSizeGb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Type of the disk attached to each node (e.g. 'pd-standard', 'pd-ssd' or 'pd-balanced') If unspecified, the default disk type is 'pd-standard'
    */
  var diskType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The image type to use for NAP created node.
    */
  var imageType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * NodeManagement configuration for this NodePool.
    */
  var management: js.UndefOr[SchemaNodeManagement] = js.undefined
  
  /**
    * Deprecated. Minimum CPU platform to be used for NAP created node pools. The instance may be scheduled on the specified or newer CPU platform. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: Intel Haswell or minCpuPlatform: Intel Sandy Bridge. For more information, read [how to specify min CPU platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform) This field is deprecated, min_cpu_platform should be specified using https://cloud.google.com/requested-min-cpu-platform label selector on the pod. To unset the min cpu platform field pass "automatic" as field value.
    */
  var minCpuPlatform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The set of Google API scopes to be made available on all of the node VMs under the "default" service account. The following scopes are recommended, but not required, and by default are not included: * `https://www.googleapis.com/auth/compute` is required for mounting persistent storage on your nodes. * `https://www.googleapis.com/auth/devstorage.read_only` is required for communicating with **gcr.io** (the [Google Container Registry](https://cloud.google.com/container-registry/)). If unspecified, no scopes are added, unless Cloud Logging or Cloud Monitoring are enabled, in which case their required scopes will be added.
    */
  var oauthScopes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The Google Cloud Platform Service Account to be used by the node VMs. Specify the email address of the Service Account; otherwise, if no Service Account is specified, the "default" service account is used.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Shielded Instance options.
    */
  var shieldedInstanceConfig: js.UndefOr[SchemaShieldedInstanceConfig] = js.undefined
  
  /**
    * Upgrade settings control disruption and speed of the upgrade.
    */
  var upgradeSettings: js.UndefOr[SchemaUpgradeSettings] = js.undefined
}
object SchemaAutoprovisioningNodePoolDefaults {
  
  inline def apply(): SchemaAutoprovisioningNodePoolDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoprovisioningNodePoolDefaults]
  }
  
  extension [Self <: SchemaAutoprovisioningNodePoolDefaults](x: Self) {
    
    inline def setBootDiskKmsKey(value: String): Self = StObject.set(x, "bootDiskKmsKey", value.asInstanceOf[js.Any])
    
    inline def setBootDiskKmsKeyNull: Self = StObject.set(x, "bootDiskKmsKey", null)
    
    inline def setBootDiskKmsKeyUndefined: Self = StObject.set(x, "bootDiskKmsKey", js.undefined)
    
    inline def setDiskSizeGb(value: Double): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbNull: Self = StObject.set(x, "diskSizeGb", null)
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setDiskType(value: String): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    inline def setDiskTypeNull: Self = StObject.set(x, "diskType", null)
    
    inline def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
    
    inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
    
    inline def setImageTypeNull: Self = StObject.set(x, "imageType", null)
    
    inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
    
    inline def setManagement(value: SchemaNodeManagement): Self = StObject.set(x, "management", value.asInstanceOf[js.Any])
    
    inline def setManagementUndefined: Self = StObject.set(x, "management", js.undefined)
    
    inline def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    inline def setMinCpuPlatformNull: Self = StObject.set(x, "minCpuPlatform", null)
    
    inline def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
    
    inline def setOauthScopes(value: js.Array[String]): Self = StObject.set(x, "oauthScopes", value.asInstanceOf[js.Any])
    
    inline def setOauthScopesNull: Self = StObject.set(x, "oauthScopes", null)
    
    inline def setOauthScopesUndefined: Self = StObject.set(x, "oauthScopes", js.undefined)
    
    inline def setOauthScopesVarargs(value: String*): Self = StObject.set(x, "oauthScopes", js.Array(value*))
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setShieldedInstanceConfig(value: SchemaShieldedInstanceConfig): Self = StObject.set(x, "shieldedInstanceConfig", value.asInstanceOf[js.Any])
    
    inline def setShieldedInstanceConfigUndefined: Self = StObject.set(x, "shieldedInstanceConfig", js.undefined)
    
    inline def setUpgradeSettings(value: SchemaUpgradeSettings): Self = StObject.set(x, "upgradeSettings", value.asInstanceOf[js.Any])
    
    inline def setUpgradeSettingsUndefined: Self = StObject.set(x, "upgradeSettings", js.undefined)
  }
}
